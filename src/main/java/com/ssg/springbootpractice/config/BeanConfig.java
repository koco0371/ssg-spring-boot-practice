package com.ssg.springbootpractice.config;

import com.ssg.springbootpractice.service.MySecondService;
import com.ssg.springbootpractice.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public MyService myService(){
        return new MySecondService();
    }
}
