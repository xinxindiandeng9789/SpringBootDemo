package com.example.demo.service;

import com.example.demo.dao.TeacherDao;
import com.example.demo.pojo.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    @RequestMapping(value = "/hello")
    public String say(){
        return "this is my first SpringBoot Application";
    }

    @RequestMapping("/findTeacher/{id}")
    public String findTeacher(@PathVariable("id") String id, Model model) {
        Teacher t = teacherDao.selectByPrimaryKey(id);
        model.addAttribute("Teacher", t);
        return "displayTeacher";
    }

    @GetMapping("/findAllTeacher")
    public String findAll(Model model){
        List<Teacher> allTeachers = teacherDao.getAll();
        model.addAttribute("teachers",allTeachers);
        return "AllTeacher";
    }
}
