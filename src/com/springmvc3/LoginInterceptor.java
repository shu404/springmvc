package com.springmvc3;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //在进入动作方法前执行，可以进行登录认证、权限认证等。
        String url=request.getRequestURL().toString();
        System.out.println(url);

        String username = (String) request.getSession().getAttribute("username");
        if(username==null || "".equalsIgnoreCase(username)){
//            request.getRequestDispatcher("/login.jsp").forward(request,response);
            response.sendRedirect("login.jsp");
            return false;
        }
        return true;
    }
}
