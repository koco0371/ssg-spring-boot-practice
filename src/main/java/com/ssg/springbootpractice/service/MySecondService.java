package com.ssg.springbootpractice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Component
public class MySecondService implements MyService {

  

    @Override
    public String hello() {
        return "슥닷컴 여러분 안녕하십니까ㅎ";
    }

}
