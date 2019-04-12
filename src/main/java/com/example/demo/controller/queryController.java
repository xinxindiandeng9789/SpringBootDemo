package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class queryController {

    @RequestMapping("/menuPage")
    public String showMenuPage() {
        return "menuPage";
    }

//    @RequestMapping("/firstPage")
//    public String showFirstPage() {
//        return "firstPage";
//    }
//
//    @RequestMapping("/queryPage")
//    public String showQueryPage() {
//        return "queryPage";
//    }
}
