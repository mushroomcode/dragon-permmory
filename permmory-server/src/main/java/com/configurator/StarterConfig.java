package com.configurator;

import com.pojo.BaseBean;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StarterConfig implements ApplicationContextAware {
    //
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getApplicationName());
        System.out.println(applicationContext.getClassLoader());
    }

    @Bean
    public BaseBean getPojo() {
        BaseBean baseBean = new BaseBean();
        baseBean.setBeanName("green duck!!");
        System.out.println(baseBean.getBeanName());
        return baseBean;
    }

}
