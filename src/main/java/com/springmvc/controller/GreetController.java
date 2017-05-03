package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by RajuY on 5/2/2017.
 */
@Controller
public class GreetController {
    @RequestMapping(path ="/greet/{name}")
    public String greet(@PathVariable String name, ModelMap map){
        String greet="Entered name is :"+name;
        map.addAttribute("greet",greet);
        return  "index";
    }
}

