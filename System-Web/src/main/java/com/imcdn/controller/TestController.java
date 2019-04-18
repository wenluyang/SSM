package com.imcdn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/")
public class TestController {
    @RequestMapping("login.do")
    public String login(){
        System.out.println("测试controller");
        return null;
    }
}
