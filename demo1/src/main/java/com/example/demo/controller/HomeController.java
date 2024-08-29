package com.example.demo.controller;

import ch.qos.logback.classic.pattern.ClassOfCallerConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @RequestMapping(value = "/HolaMundo", method = RequestMethod.GET)

    public String paginaPrincipal(){
        return "hola";
    }

}
