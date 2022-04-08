package com.doromv.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Doromv
 * @create 2022-03-06-21:29
 */
@RestController
public class TestController {
    @RequestMapping("/t1")
    public String test1(){
        System.out.println("TestController==>执行了");
        return "OK";
    }
}
