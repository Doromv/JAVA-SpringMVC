package com.doromv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Doromv
 * @create 2022-03-03-11:01
 */
@Controller
@RequestMapping("/c3")
public class ControllerTest03 {
    @RequestMapping("/t1")
    public String test(Model model){
        model.addAttribute("msg","Controller03");
        return "test";
    }
}
