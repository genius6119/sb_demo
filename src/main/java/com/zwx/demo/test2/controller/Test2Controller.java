package com.zwx.demo.test2.controller;


import com.zwx.demo.test2.entity.Test2;
import com.zwx.demo.test2.service.Test2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/test2",method = RequestMethod.POST)
public class Test2Controller {

    @Autowired
    private Test2Service test2Service;

    @RequestMapping
    public int add() throws InterruptedException {
        test2Service.add();
        return 0;
    }


}
