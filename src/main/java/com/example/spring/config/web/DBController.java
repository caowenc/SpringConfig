package com.example.spring.config.web;

import com.example.spring.config.config.DBConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author : 曹闻
 * @date : 2020/3/14 12:26
 * @description :
 */
public class DBController {
    @Autowired
    private DBConfig config;

    @GetMapping("/config")
    public void config() {
     config.confige();
    }
    }

