package com.ssg.springbootpractice.config;

import com.ssg.springbootpractice.service.MySecondService;
import com.ssg.springbootpractice.service.MyService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@Component - Myservice를 bean으로 등록하지만 내부적으로 다르게 동작 - Spring lite mode - proxy bean x
public class BeanConfig {
    @Bean
    public MyService myService(){
        return new MySecondService();
    }
}
