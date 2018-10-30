package com.capgemini.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 
@Controller
public class WebController {
	
    @GetMapping(value="/")
    public String homepage(){
        return "index";
    }
    @GetMapping("view")
    public void view() {
    	System.out.println("view");
    }
}