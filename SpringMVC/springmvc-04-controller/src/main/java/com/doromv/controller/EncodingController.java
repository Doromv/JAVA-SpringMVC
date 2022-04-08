package com.doromv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Doromv
 * @create 2022-03-03-20:28
 */
@Controller
public class EncodingController {
    @PostMapping("/e1/t1")
    public String test1(String name, Model model){
        model.addAttribute("msg",name);
        return "test";
    }
}
