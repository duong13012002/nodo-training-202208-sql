package com.example.unit6_spring_boot.Controller;

import org.apache.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


@Controller
public class HomeController {

    private final static Logger LOGGER = Logger.getLogger(HomeController.class);

@RequestMapping("/login")
public ModelAndView login(@RequestParam(value = "error",required = false)String error) {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("login");
    if (error != null ){
        mv.addObject("error","Incorrect username or password!");
    }
    return mv;
}
@RequestMapping("/user")
    ModelAndView forUser(){
    ModelAndView mv1 = new ModelAndView();
    mv1.setViewName("index");
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    mv1.addObject("message","Hello User" +auth.getName());
    return mv1;
}
@RequestMapping("/logout")
    public String logout(HttpRequest request, HttpResponse response){
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    if (auth != null){
        new SecurityContextLogoutHandler().logout((HttpServletRequest) request, (HttpServletResponse) response,auth);
    }
    return "redirect:/";
}
}
