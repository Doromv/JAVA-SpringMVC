package com.doromv.controller;

import com.doromv.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Doromv
 * @create 2022-03-03-15:55
 */
@Controller
@RequestMapping("/u1")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        System.out.println(name);
        model.addAttribute("msg",name);
        return "test";
    }
    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }
    @GetMapping("/t3")
    public String test3(ModelMap map){
        map.addAttribute("msg","doromv");
        return "test";
    }
}
