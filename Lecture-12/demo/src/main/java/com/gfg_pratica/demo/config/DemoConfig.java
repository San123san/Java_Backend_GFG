package com.gfg_pratica.demo.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class DemoConfig {

    private static Logger logger = LoggerFactory.getLogger(DemoConfig.class);
    DemoConfig(){
        System.out.println("DemoConfig initialized");
    }

    //RestTemplate is already in Library
    @Bean
    public RestTemplate getRestTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        logger.info("restTemplate create in DemoConfig: {}", restTemplate);
        return restTemplate;
    }
}
