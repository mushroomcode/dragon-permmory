package com.main;

import com.config.AppConfig;
import com.config.AutoAppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
//        AnnotationConfigApplicationContext applicationContext =
//                new AnnotationConfigApplicationContext(AppConfig.class);
        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(AutoAppConfig.class);
        //
//        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
        // 遍历Spring容器中的beanName
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }
    }

}
