package com.doromv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Doromv
 * @create 2022-03-07-8:09
 */
@Controller
@RequestMapping("/user")
public class loginController {
    @RequestMapping("/tomain")
    public String tomain(){
        return "main";
    }
        @RequestMapping("/tologin")
        public String tologin(){
            return "login";
        }
    @RequestMapping("/login")
    public String login(HttpSession session, Model model, String username, String password){
        System.out.println("userInfo==>"+username);
        session.setAttribute("userLoginInfo",username);
        model.addAttribute("username",username);
        model.addAttribute("password",password);
        return "main";
    }
    @RequestMapping("/goOut")
    public String goOut(HttpSession session){
        session.removeAttribute("userLoginInfo");
        return "main";
    }
}
