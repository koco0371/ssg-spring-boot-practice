package com.ssg.springbootpractice.controller;

import com.ssg.springbootpractice.service.MyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @ResponseBody
    @GetMapping("/")
    public String main() {
        return myService.hello();
    }
}
