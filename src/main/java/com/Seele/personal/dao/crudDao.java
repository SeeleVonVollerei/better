package com.Seele.personal.dao;

import com.Seele.personal.pojo.TestDTO1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface crudDao{

    List<TestDTO1> test1();

    List<Map<String,Object>> test2();
}
