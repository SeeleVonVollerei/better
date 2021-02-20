package com.Seele.personal.service;

import com.Seele.personal.pojo.TestDTO1;

import java.util.List;
import java.util.Map;

public interface crudService {

    List<TestDTO1> test1();

    List<Map<String,Object>> test2();
}
