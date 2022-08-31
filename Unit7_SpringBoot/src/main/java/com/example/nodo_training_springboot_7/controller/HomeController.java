package com.example.nodo_training_springboot_7.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {

    private final static Logger LOGGER = Logger.getLogger(HomeController.class);

    @RequestMapping("/")
    public ModelAndView mv() {
        ModelAndView mv = new ModelAndView();
        mv.addObject("message", "Hello World1");
        mv.setViewName("index");
        LOGGER.info("Truy cap thanh cong!");
        return mv;
    }
//public String index(Model model) {
//    model.addAttribute("message", "Hello World");
//    return "index";
//}
}