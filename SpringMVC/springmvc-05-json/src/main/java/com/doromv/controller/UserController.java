package com.doromv.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.doromv.pojo.User;
import com.doromv.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Doromv
 * @create 2022-03-04-8:05
 */
@Controller
//@RestController 它注解的类里面的全部方法不会走视图解析器
public class UserController {
    @RequestMapping("/j1")
    @ResponseBody//它注解的方法不会走视图解析器，会直接返回一个字符串
    public  String json() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user1 = new User("Doromv1",21,"男");
        User user2 = new User("Doromv2",21,"男");
        User user3 = new User("Doromv3",21,"男");
        User user4 = new User("Doromv4",21,"男");
        User user5 = new User("Doromv5",21,"男");
        User user6 = new User("Doromv6",21,"男");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        String str = mapper.writeValueAsString(userList);
        return str;
    }
    @RequestMapping("/j2")
    @ResponseBody
    public String json2() throws JsonProcessingException {
        //自定义日期的格式
        //方法一
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String format = simpleDateFormat.format(date);
        //方法二
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS,false);
        mapper.setDateFormat(simpleDateFormat);
        Date date = new Date();
        return mapper.writeValueAsString(date);
    }
    @RequestMapping("/j3")
    @ResponseBody
    public String json3(){
        Date date = new Date();
//        return JsonUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
        return JsonUtils.getJson(date);
    }
    @RequestMapping("/j4")
    @ResponseBody
    public  String json4() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        User user1 = new User("Doromv1",21,"男");
        User user2 = new User("Doromv2",21,"男");
        User user3 = new User("Doromv3",21,"男");
        User user4 = new User("Doromv4",21,"男");
        User user5 = new User("Doromv5",21,"男");
        User user6 = new User("Doromv6",21,"男");
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        userList.add(user4);
        userList.add(user5);
        userList.add(user6);
        String s = JSON.toJSONString(userList);
        return s;
    }
}
