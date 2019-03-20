package com.example.demo.dao;

import com.example.demo.mapper.TeacherMapper;
import com.example.demo.pojo.Teacher;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import java.util.List;

public interface TeacherDao extends TeacherMapper{
    //在使用通用Mapper的基础上 下面的都是mybatis注解的方法
    @Select("select * from teacher")
    @ResultMap("com.example.demo.mapper.TeacherMapper.BaseResultMap")
    List<Teacher> getAll();
}
