package com.example.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping("/")
    public List<Object> index() {
        List<Object> li =new ArrayList<Object>();
        li.add("Amar");
        li.add("Abhshek");
		return li;
        
    }
    @GetMapping("/view")
    public Object viewdata() {
        return new String("Mayur");
    }
}