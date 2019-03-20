package com.example.demo.dao;

import com.example.demo.mapper.CourseMapper;
import com.example.demo.pojo.Course;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CourseDao extends CourseMapper{
    //在使用通用Mapper的基础上 下面的都是mybatis注解的方法
    @Select("select * from Course")
    @ResultMap("com.example.demo.mapper.CourseMapper.BaseResultMap")
    List<Course> getAll();
}
