package com.doromv.controller;

import com.doromv.pojo.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Doromv
 * @create 2022-03-06-10:15
 */
@RestController
public class ajaxController {
    @RequestMapping("/t1")
    public String test() {
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>" + name);
        if ("Doromv".equals(name)) {
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2() {
        List<User> userList = new ArrayList<>();
        userList.add(new User("Doromv1", 21, "男"));
        userList.add(new User("Doromv2", 21, "男"));
        userList.add(new User("Doromv3", 21, "男"));
        return userList;
    }

    @RequestMapping("/a3")
    public String a3(String name, String pwd) {
        String msg = null;
        if (name != null) {
            if ("admin".equals(name)) {
                msg = "用户名正确";
            } else {
                msg = "用户名有误";
            }
        }
        if (pwd != null) {
            if ("123".equals(pwd)) {
                msg = "密码正确";
            } else {
                msg = "密码有误";
            }
        }
        return msg;
    }
}
