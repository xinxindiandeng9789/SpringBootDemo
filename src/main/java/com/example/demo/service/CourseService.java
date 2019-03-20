package com.example.demo.service;

import com.example.demo.dao.CourseDao;
import com.example.demo.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseService {
    @Autowired
    private CourseDao courseDao;

    @RequestMapping(value = "/findCourse/{id}",produces = {"application/json;charset=UTF-8"})
    public Course findCourse(@PathVariable("id") String id){
        return courseDao.selectByPrimaryKey(id);
    }

    @RequestMapping(value = "/findAllCourse",produces = {"application/json;charset=UTF-8"})
    public List<Course> findAll(){
        return courseDao.getAll();
    }
}
