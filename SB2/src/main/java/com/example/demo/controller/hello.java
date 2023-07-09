package com.example.demo.controller;



import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class hello {

 @RequestMapping("/vijay")

 public String sayHello()

 {

 System.out.println("Hi.................");

 return "home";

 }

}



