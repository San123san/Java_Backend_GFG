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

//    1st way dependency injection - Field Injection
    /* @Autowired
    Demo demoObject; */

//    2nd way of dependency injection - Constructor Injection
    private Demo demoObject;

    /* if more than one constructor present, want to work dependency injection than use @Autowired, like below else if
    single constructor than no need.
    THis is only for constructor */
    @Autowired
    public DemoController(Demo demo){
        logger.info("DemoController initialized");
        this.demoObject = demo;
    }

    //Not allowed to have primitive type param with constructor for class initialized by Spring
    /* public DemoController(int a) {
        logger.info("DemoContoller initailzed with int: {}", a);
    } */

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
