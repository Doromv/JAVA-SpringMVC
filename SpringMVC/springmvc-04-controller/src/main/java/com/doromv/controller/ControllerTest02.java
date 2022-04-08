package com.doromv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Doromv
 * @create 2022-03-03-9:35
 */
@Controller
public class ControllerTest02 {
    @RequestMapping("/t1")
    public String test1(Model model){
        model.addAttribute("msg","Hello,SpringMVC");
        return "test";
    }
}
