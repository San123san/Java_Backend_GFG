package com.gfg_pratica.demo.controller;

import com.gfg_pratica.demo.models.Demo;
import com.gfg_pratica.demo.service.PaymentInter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {

    @Autowired
    Demo demoObj2;

    @Qualifier("cardPaymentService")

    @Autowired
    PaymentInter paymentInter;

    @GetMapping("/2")
    public void helloWorld2() {
        System.out.println("Autowired Demo Object in DemoController2: " + demoObj2);
        System.out.println("Autowired PaymentInterf implementation in DemoController2: "
                + paymentInter.getClass().getName());
    }
}
