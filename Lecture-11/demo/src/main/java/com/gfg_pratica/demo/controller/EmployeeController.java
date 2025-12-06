package com.gfg_pratica.demo.controller;

import com.gfg_pratica.demo.models.EmployeeRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

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
    public void getEmployeeByIdUsingRequestParam(@RequestParam("id") int employeeId,
                                                 @RequestParam(required = false, defaultValue = "General") String departement) {
        loger.info("Employee ID received as Request Param: {}", employeeId);
    }

    @GetMapping("/path-variable/{id}/details/{detailsId}")
    //path variable accept multiple parameters
    public void getEmployeeByIdUsingVariable(@PathVariable("id") int employeeid,
                                             @PathVariable("detailsId") int detailsId){
        loger.info("Employee id received as Path Variable: {}", employeeid);
    }

    /*
    This is use when you have multiple URL
    @GetMapping(value = {"/path-variable/{id}/details/{detailsId}", "/pv/{id}/details/{detailsId}"})
    //path variable accept multiple parameters
    public void getEmployeeByIdUsingVariable(@PathVariable("id") int employeeid,
                                             @PathVariable("detailsId") int detailsId){
        loger.info("Employee id received as Path Variable: {}", employeeid);
    }
     */

    /*
    This is first method - Same Name(Auto Mapping)
    @GetMapping("/request-param")
    //Multiple @RequestParam can be pass
    public void getEmployeeByIdUsingRequestParam(@RequestParam int employeeId,
                                                 @RequestParam(required = false, defaultValue = "General") String departement) {
        loger.info("Employee ID received as Request Param: {}", employeeId);
    }

    @GetMapping("/path-variable/{employeeid}")
    public void getEmployeeByIdUsingVariable(@PathVariable int employeeid){
        loger.info("Employee id received as Path Variable: {}", employeeid);
    }
    */

    /* Currenlty this method in use
    This is Second method - Different Name(Mannual Mapping)
    @GetMapping("/request-param")
    //Multiple @RequestParam can be pass
    public void getEmployeeByIdUsingRequestParam(@RequestParam("id") int employeeId,
                                                 @RequestParam(required = false, defaultValue = "General") String departement) {
        loger.info("Employee ID received as Request Param: {}", employeeId);
    }

    @GetMapping("/path-variable/{id}")
    public void getEmployeeByIdUsingVariable(@PathVariable("id") int employeeid){
        loger.info("Employee id received as Path Variable: {}", employeeid);
    }
    */

    @GetMapping("/request-body")
    public void getEmployeeIdUsingRequestBody(@RequestBody EmployeeRequest employeeRequest){
        loger.info("Employee request body received: {}", employeeRequest);
    }

    @PostMapping("/request-body")
    public void getEmployeeIdUsingRequestBody2(@RequestBody EmployeeRequest employeeRequest){
        loger.info("Employee request body received: {}", employeeRequest);
    }

    @PostMapping("/request-param-post")
    public void getEmployeeByIdPostUsingRequestParam(@RequestParam int employeeId,
                                                 @RequestParam(required = false, defaultValue = "General") String departement) {
        loger.info("Employee ID received as Request Param: {}", employeeId);
    }
}
