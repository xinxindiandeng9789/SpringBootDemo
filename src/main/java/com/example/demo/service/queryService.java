package com.example.demo.service;

import com.example.demo.dao.CourseDao;
import com.example.demo.pojo.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class queryService {
    @Autowired
    private CourseDao courseDao;

    @RequestMapping("/query/{id}")
    public String findCourse(@PathVariable("id") String id, Model model) {
        Course c = courseDao.selectByPrimaryKey(id);
        model.addAttribute("Course", c);
        return "displayCourse";
    }
}
