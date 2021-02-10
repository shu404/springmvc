package com.springmvc3;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Component("handlerExceptionResolver")
public class MyException implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest request
            , HttpServletResponse response, Object o, Exception e) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.getModel().put("ex","出现异常:"+e.getMessage());
        modelAndView.setViewName("/error.jsp");
        return modelAndView;
    }
}
