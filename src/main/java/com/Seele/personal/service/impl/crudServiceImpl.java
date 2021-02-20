package com.Seele.personal.service.impl;


import com.Seele.personal.dao.crudDao;
import com.Seele.personal.pojo.TestDTO1;
import com.Seele.personal.service.crudService;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Component
public class crudServiceImpl implements crudService {

    @Resource
    private crudDao crudDao;

    @Override
    public List<TestDTO1> test1() {
        return crudDao.test1();
    }

    @Override
    public List<Map<String, Object>> test2() {
        return crudDao.test2();
    }
}
