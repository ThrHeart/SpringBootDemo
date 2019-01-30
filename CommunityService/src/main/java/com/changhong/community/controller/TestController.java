package com.changhong.community.controller;

import com.changhong.community.config.ContextInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

    @Autowired
    ContextInfo contextInfo;

    @GetMapping("/test")
    public String test(){
        return "port: " + contextInfo.getPort();
    }


}
