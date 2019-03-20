package com.example.demo.service;

import com.example.demo.dao.TeacherDao;
import com.example.demo.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @RequestMapping(value = "/hello")
    public String say(){
        return "this is my first SpringBoot Application";
    }

    @RequestMapping(value = "/findTeacher/{id}",produces = {"application/json;charset=UTF-8"})
    public Teacher findTeacher(@PathVariable("id") String id){
        System.out.println(teacherDao.selectByPrimaryKey(id));
        return teacherDao.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/findAllTeacher",produces = {"application/json;charset=UTF-8"})
    public List<Teacher> findAll(){
        return teacherDao.getAll();
    }
}
