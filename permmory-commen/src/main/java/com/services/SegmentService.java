package com.services;

import com.common.IDGen;
import com.common.LesserPanUIDGenCommon;
import com.common.PropertyFactory;
import com.common.ZeroIDGen;
import com.constants.Constants;
import com.dao.IDAllocDao;
import com.dao.impl.IDAllocDaoImpl;
import com.zaxxer.hikari.HikariDataSource;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.Properties;

import com.model.Result;

@Service("SegmentService")
public class SegmentService {

    public Logger logger = LogManager.getLogger(SegmentService.class);
//    private org.slf4j.Logger logger = LoggerFactory.getLogger(SegmentService.class);

    {
        logger.info("Id gen init...... ");
    }

    private IDGen idGen;
    private HikariDataSource dataSource;

    public SegmentService() throws SQLException, Exception {
        Properties properties = PropertyFactory.getProperties();

        // 读取 leaf.properties 文件，判断是否开启自增式 Leaf 叶子算法。
        boolean flag = Boolean.parseBoolean(properties.getProperty(Constants.LEAF_SEGMENT_ENABLE, "true"));
        //
        if (flag) {
            // Config dataSource
            dataSource = new HikariDataSource();
            dataSource.setJdbcUrl(properties.getProperty(Constants.LEAF_JDBC_URL));
            dataSource.setUsername(properties.getProperty(Constants.LEAF_JDBC_USERNAME));
            dataSource.setPassword(properties.getProperty(Constants.LEAF_JDBC_PASSWORD));

            // Config Dao
            IDAllocDao dao = new IDAllocDaoImpl(dataSource);

            // Config ID Gen
            idGen = new LesserPanUIDGenCommon();
            ((LesserPanUIDGenCommon) idGen).setDao(dao);
            if (idGen.init()) {
                logger.info("Segment Service Init Successfully");
            } else {
                throw new Exception("Segment Service Init Fail");
            }
        } else {
            idGen = new ZeroIDGen();
            logger.info("Zero ID Gen Service Init Successfully");
        }
    }

    public Result getId(String key) {
        return idGen.get(key);
    }

    public LesserPanUIDGenCommon getIdGen() {
        if (idGen instanceof LesserPanUIDGenCommon) {
            return (LesserPanUIDGenCommon) idGen;
        }
        return null;
    }

}
