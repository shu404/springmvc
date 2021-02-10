package com.springmvc2;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.groups.Default;
import java.util.List;

@Controller
public class ValidatHandler1 {
    @RequestMapping("/valid1")
    @ResponseBody
    public String valid1(@Valid UserPo user, BindingResult error) {
        System.out.println("ValidatHandler1.valid1");
        if (error.hasErrors()) {
            List<ObjectError> errors = error.getAllErrors();
            for (ObjectError err : errors) {
                System.out.println(err.getDefaultMessage());
            }
        }
        return "ok";
    }

    @RequestMapping("/login")
    public String login(@Validated(value = {LoginValid.class, Default.class}) UserPo user,BindingResult error, Model model) {
        if (error.hasErrors()) {
            List<ObjectError> errors = error.getAllErrors();
            for (ObjectError err : errors) {
                System.out.println(err.getDefaultMessage());
            }
            model.addAttribute("errors",errors);
            return "/index.jsp";
        }
        return "/ok.jsp";
    }

    @RequestMapping("/reg")
    public String reg(@Validated(value = {RegValid.class,LoginValid.class})UserPo user, BindingResult error) {
        return "ok";
    }

}
