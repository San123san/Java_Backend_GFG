package com.gfg_pratica.demo.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfig {
    DemoConfig(){
        System.out.println("DemoConfig initialized");
    }
}
