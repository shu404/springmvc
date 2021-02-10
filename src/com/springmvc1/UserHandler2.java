package com.springmvc1;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController // @Controller 、 所有动作方法@ResponseBody
public class UserHandler2 {
    @RequestMapping("/a")
    public String a(){
        return "/index.jsp";
    }

    @RequestMapping("/user21")
    @ResponseBody
    public UserPo user21(){
        System.out.println("UserHandler2.user21");
        // user对象可以是创建，也可以从业务层查询到的对象
        UserPo user = new UserPo("李思思",23,true,"西安");
        return user;
    }

    @RequestMapping("/user22")
    public UserPo user22(){
        System.out.println("UserHandler2.user22");
        // user对象可以是创建，也可以从业务层查询到的对象
        UserPo user = new UserPo("李思思2",25,true,"西安3");
        return user;
    }

    @RequestMapping("/user23")
    public String user23(@RequestBody UserPo user){
        System.out.println("UserHandler2.user23");
        System.out.println(user);
        return "/index.jsp";
    }

    @RequestMapping("/user24")
    public ResponseEntity<UserPo> user24(){
        System.out.println("UserHandler2.user24");

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        UserPo user = new UserPo("李思思4",21,true,"西安5");
        ResponseEntity<UserPo> entity = new ResponseEntity<UserPo>(user,headers, HttpStatus.OK);
        return entity;
    }
}
