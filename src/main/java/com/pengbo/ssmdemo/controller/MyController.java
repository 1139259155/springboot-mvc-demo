package com.pengbo.ssmdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

//    @Autowired
//    private UserMapper userMapper;

//    @RequestMapping("/user/{id}")
//    public User getUserById(@PathVariable String id){
//        userMapper.getUserById(id);
//        return null;
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String test() {
        return "hello world";
    }

}
