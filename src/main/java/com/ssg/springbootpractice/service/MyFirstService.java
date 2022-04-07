package com.ssg.springbootpractice.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Primary
@Service
public class MyFirstService implements MyService {

    @Override
    public String hello() {
        return "hello world!";
    }

}
