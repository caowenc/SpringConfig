package com.example.spring.config.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * @author : 曹闻
 * @date : 2020/3/14 12:19
 * @description :
 */
@Configuration
@Profile("dev")
public class DevDBConfig  implements DBConfig{
    @Override
    public  void confige(){
        System.out.println("dev环境");
    }

}
