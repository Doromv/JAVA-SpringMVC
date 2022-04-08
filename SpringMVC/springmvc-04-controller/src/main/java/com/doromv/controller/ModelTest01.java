package com.doromv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Doromv
 * @create 2022-03-03-15:30
 */
@Controller
@RequestMapping("/m1")
public class ModelTest01 {
    @RequestMapping("/t1")
    public String test(Model model){
        model.addAttribute("msg","Doromv");
//        return "/WEB-INF/jsp/test.jsp";
        return "redirect:/index.jsp";
    }
}
