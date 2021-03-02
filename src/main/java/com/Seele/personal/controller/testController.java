package com.Seele.personal.controller;

import com.Seele.personal.pojo.TestDTO1;
import com.Seele.personal.service.crudService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class testController {

    @Resource
    private crudService service;

    @GetMapping(value = "/test1")
    public List<TestDTO1> test1(){
        return service.test1();
    }

    @GetMapping(value = "/test2")
    public List<Map<String,Object>> test2(){
        return service.test2();
    }

    @GetMapping(value = "/test3")
    public String test3(){
        return "hello world";
    }
}
