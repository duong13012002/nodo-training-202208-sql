package com.example.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.lang.reflect.Method;

@Controller
@RequestMapping("/home")
public class HelloClazzController {
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView printMessage(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("index");
        mv.addObject("message","Hello Viet Anh!");
        return mv;
    }
    @RequestMapping(value = "welcome",method = RequestMethod.GET)
    public ModelAndView welcome(){
        ModelAndView mv =new ModelAndView();
        mv.setViewName("clazz");
        mv.addObject("name","Hello Spring!");
        return mv;
    }
    @RequestMapping(value = "site",method = RequestMethod.GET)
    public String redirect(){
        return "redirect:http:www.moom.vn";
    }
    @RequestMapping(value = "data",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
    @ResponseBody
    public String raw(){
        return "xin chao moi nguoi";
    }
    @RequestMapping(value = "hello",method = RequestMethod.POST)
    public ModelAndView printMessage(
            @RequestParam(value = "data",required = false) String message){
        ModelAndView mv =new ModelAndView();
        mv.addObject("message",message);
        return mv;
    }
    @RequestMapping(value = "hello-form",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
    public String getMessage(){
        return "form.html";
    }
}
