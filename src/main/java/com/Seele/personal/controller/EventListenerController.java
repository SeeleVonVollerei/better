package com.Seele.personal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/event")
public class EventListenerController {

    @GetMapping("/test")
    public String getRequestInfo(HttpServletRequest request){
        System.out.println("code数据"+request.getAttribute("code"));
        System.out.println("name数据"+request.getAttribute("name"));
        return "success";
    }
}
