package com.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LesserPanUIDGenCommon {

    private static Logger logger = LogManager.getLogger(LesserPanUIDGenCommon.class);

    /**
     * 获取唯一ID信息
     * @param type
     * @return
     */
    public String getLesserPanUID(String type) {
        logger.info("  get PanUID : ");
        return "ID";
    }

}
