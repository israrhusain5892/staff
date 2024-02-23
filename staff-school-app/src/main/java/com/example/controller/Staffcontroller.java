package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Models.Staff;
import com.example.service.Staffservice;

@RestController
public class Staffcontroller {

    @Autowired
    private Staffservice service;
    
    @PostMapping("/add/staff")
    public String addData(@RequestBody Staff staff){
        service.addData(staff);
        return "data save successfully";

    }
    
}
