package com.zwx.demo.test.controller;


import com.zwx.demo.test.service.TestService;
import io.swagger.annotations.ApiModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test",method = RequestMethod.POST)
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping
    public int add() throws InterruptedException {
        int a=0;
        for(int i=0;i<10000;i++){
            a=(int)(Math.random()*1000);
            testService.add(a);
            System.out.println(i);
        }
        return 0;
    }


}
