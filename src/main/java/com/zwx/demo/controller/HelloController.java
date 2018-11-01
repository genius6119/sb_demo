package com.zwx.demo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Api(value = "这是一个Hello类" ,tags = {"Hello TAGS"})
@RestController
public class HelloController {
    @Transactional
    @ApiOperation(value = "这是一个作用为Hello的类",notes = "备注说明")
    @RequestMapping(value = "/hello", method= RequestMethod.GET)
    public String hello(int i){
        System.out.println(i);
        return "Hello！！！！"+i;
    }


}
