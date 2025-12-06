package com.gfg_pratica.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private static Logger loger = LoggerFactory.getLogger(EmployeeController.class);

    // /api/employee - POST - C
    // /api/employee/{id} - GET - R
    // /api/employee/{id} - PUT - U
    // /api/employee/{id} - DELETE - D

    @GetMapping("/request-param")
    //Multiple @RequestParam can be pass
    public void getEmployeeByIdUsingRequestParam(@RequestParam int employeeId,
                                                 @RequestParam(required = false, defaultValue = "General") String departement) {
        loger.info("Employee ID received as Request Param: {}", employeeId);
    }
}
