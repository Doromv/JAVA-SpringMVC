package com.doromv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Doromv
 * @create 2022-03-03-8:52
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/h1")
    public String Hello(Model model){
        model.addAttribute("msg","Hello,SpringMVCAnno");
        return "hello";
    }
}
