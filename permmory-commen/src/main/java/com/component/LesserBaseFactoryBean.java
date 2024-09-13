package com.component;

import com.model.LeafAlloc;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.InitializingBean;


public class LesserBaseFactoryBean implements FactoryBean, InitializingBean {

    @Override
    public Object getObject() throws Exception {
        return new LeafAlloc();
    }

    @Override
    public Class<?> getObjectType() {
        return LeafAlloc.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("12313123");
    }
}
