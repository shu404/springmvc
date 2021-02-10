package com.springmvc3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserHandler3 {
    @Autowired
    private UserService userService;

    /*
    方法抛出了异常，最终统一被前段控制器处理。
     */
    @RequestMapping("/regUser")
    public String regUser() throws Exception {
//int a = 3/0;
        userService.saveUser();
        return "/ok.jsp";
    }

    @RequestMapping("/regUser2")
    public String regUser2() throws Exception {
        System.out.println("UserHandler3.regUser2");
        return "/ok.jsp";
    }
}
