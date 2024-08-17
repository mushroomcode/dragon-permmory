package com.common;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.util.Properties;

/**
 *  配置类的信息
 */
public class PropertyFactory {

    private static final Logger logger = LogManager.getLogger(PropertyFactory.class);
    private static final Properties prop = new Properties();

    static {
        try {
            // 配置文件信息
            prop.load(PropertyFactory.class.getClassLoader().getResourceAsStream("leaf.properties"));
        } catch (IOException e) {
            logger.warn("Load Properties Ex", e);
        }
    }

    public static Properties getProperties() {
        return prop;
    }
}
