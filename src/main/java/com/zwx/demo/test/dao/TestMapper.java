package com.zwx.demo.test.dao;

import com.zwx.demo.test.entity.Test;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Test record);

    int insertSelective(Test record);

    Test selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Test record);

    int updateByPrimaryKey(Test record);
}