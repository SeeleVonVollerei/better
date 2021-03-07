package com.Seele.personal.service;

import com.Seele.personal.dao.crudDao;
import com.Seele.personal.listener.TestEvent;
import com.Seele.personal.pojo.TestDTO1;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestEventListenerService {

    @Resource
    private ApplicationContext applicationContext;

    @Resource
    private crudDao dao;

    public List<TestDTO1> getTestDTO(){
        List<TestDTO1> testDTO1List = dao.test1();
        for(TestDTO1 testDTO1 : testDTO1List){
            TestEvent event = new TestEvent(this,testDTO1);
            applicationContext.publishEvent(event);
        }
        return testDTO1List;
    }
}
