package com.Seele.personal.controller;

import com.Seele.personal.pojo.TestDTO1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@RestController
@RequestMapping("/listener")
public class ListenerController {

    @GetMapping("/test")
    public TestDTO1 getTestDto(HttpServletRequest request){
        ServletContext application = request.getServletContext();
        return (TestDTO1) application.getAttribute("testDTO1");
    }

    @GetMapping("/test2")
    public String getTotalUser(HttpServletRequest request, HttpServletResponse response){
        Cookie cookie;
        try{
            // 把sessionId记录在浏览器中
            cookie = new Cookie("JSESSIONID", URLEncoder.encode(request.getSession().getId(),"utf-8"));
            cookie.setPath("/");
            //设置cookie有效期为2天，设置长一点
            cookie.setMaxAge(48*60*60);
            response.addCookie(cookie);
        }catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        Integer count = (Integer) request.getSession().getServletContext().getAttribute("count");
        return "当前在线人数：" + count;
    }
}
