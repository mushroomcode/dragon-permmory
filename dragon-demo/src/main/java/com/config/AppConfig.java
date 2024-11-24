package com.config;

import com.pojo.Halibut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@Import(Halibut.class)
public class AppConfig {
    //
    @Bean
    public Halibut getFish () {
        Halibut halibut = new Halibut();
        halibut.setToken("123");
        System.out.println("get Halibut!s");
        return halibut;
    }
}
