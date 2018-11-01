package com.zwx.demo.test2.service;

import com.zwx.demo.test.dao.TestMapper;
import com.zwx.demo.test.entity.Test;
import com.zwx.demo.test2.dao.Test2Mapper;
import com.zwx.demo.test2.entity.Test2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class Test22ServiceImpl implements Test2Service {
    @Autowired
    private Test2Mapper test2Mapper;

    @Override
    public void add() {
        List<Test2> list=new ArrayList<>();

        int a=0;
        for(int i=0;i<100000;i++){
            a=(int)(Math.random()*1000);
            System.out.println(i);
            Test2 test2=new Test2();
            test2.setId(i);
            test2.setName(a);
            test2.setAge(a);
            test2.setMoney(a);
            list.add(test2);
        }
        long start = System.currentTimeMillis();
        test2Mapper.insertForEach(list);
        System.out.println((System.currentTimeMillis() - start) / 1000.00 + "秒");

    }
}
