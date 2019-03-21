package com.example.demo.service;

import com.example.demo.dao.CourseDao;
import com.example.demo.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class CourseService {
    @Autowired
    private CourseDao courseDao;

    @RequestMapping("/findCourse/{id}")
    public String findCourse(@PathVariable("id") String id, Model model) {
        Course c = courseDao.selectByPrimaryKey(id);
        model.addAttribute("Course", c);
        return "displayCourse";
    }

    @GetMapping("/findAllCourse")
    public String findAll(Model model){
        List<Course> allCourses = courseDao.getAll();
        model.addAttribute("courses",allCourses);
        return "AllCourse";
    }
}
