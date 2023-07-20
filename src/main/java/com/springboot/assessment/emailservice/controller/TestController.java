package com.springboot.assessment.emailservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin("*")
@RestController
@RequestMapping("/check")
public class TestController {


    @GetMapping("/{param}")
    public void testCheck(@PathVariable("param") String param){
        System.out.println(param);
    }

    @GetMapping("/new")
   public String newCheck(){
    return "updated ---";
   } 
    
}