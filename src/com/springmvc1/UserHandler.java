package com.springmvc1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Controller
public class UserHandler {
    @RequestMapping("/hello1")
    public String hello1(@ModelAttribute(value = "name") String name, Model model){
        System.out.println("UserHandler.hello1");
        System.out.println(model);
        return "/index.jsp";
    }
    /*
        @PathVariable : 将请求url的模板变量值绑定到方法形参上。
     */
    @RequestMapping("/pathVar/{name}/{a}") // 调用：http://localhost:8888/springmvc2/pathVar/jerry/23.do
    public String pathVar(@PathVariable String name,@PathVariable(value="a") Integer age){
        System.out.println("UserHandler.pathVar,name="+name+",age="+age);
        return "/index.jsp";
    }

    @PostConstruct
    public void init(){
        System.out.println("UserHandler.init");
    }

    @PreDestroy
    public void des(){
        System.out.println("UserHandler.des");
    }

    @ModelAttribute(value = "addrs")
    public String[] addrs(){
        return new String[]{"西安","宝鸡","咸阳"};
    }




}
