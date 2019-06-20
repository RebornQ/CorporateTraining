package com.mallotec.reb.corporatetraining.config.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SecurityInterceptor implements HandlerInterceptor {

    /**
     * 登录session key
     */
    public final static String SESSION_KEY = "user";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {
        /*String requestUrl = request.getRequestURL().toString();
        if (requestUrl.contains("swagger")) {
            return true;
        }*/
        HttpSession session = request.getSession();
        if (session.getAttribute(SESSION_KEY) != null)
            return true;

        // 跳转登录
        response.sendRedirect(request.getContextPath() + "/admin/login.html");
        return false;
    }
}