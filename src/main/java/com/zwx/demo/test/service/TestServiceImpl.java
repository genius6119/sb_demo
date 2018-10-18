package com.zwx.demo.test.service;

import com.zwx.demo.test.dao.TestMapper;
import com.zwx.demo.test.entity.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public void add(int a) {
        Test test=new Test();
        test.setName(String.valueOf(a));
        test.setMoney((long) a);
        testMapper.insertSelective(test);
    }
}
