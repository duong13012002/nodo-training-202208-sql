package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
    @RequestMapping(value = "student/add",method = RequestMethod.GET)
    public ModelAndView add(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("student.form");
        return mv;
    }
}
