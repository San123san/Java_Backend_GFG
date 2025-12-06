package com.gfg_pratica.demo.controller;

import com.gfg_pratica.demo.models.Demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private static Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    Demo demoObject;

    public DemoController(){
        logger.info("DemoController initialized");
    }

    @GetMapping
    public void helloWorld(){
        Demo demo = new Demo();
        logger.info("Demo object create: {}", demo);
        logger.info("Demo object create: {}", demoObject);
    }
}
