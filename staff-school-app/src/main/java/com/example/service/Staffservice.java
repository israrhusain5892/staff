package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Models.Staff;
import com.example.Repository.StaffRepository;

@Service
public class Staffservice {
    @Autowired
    private StaffRepository repo;
    
    public void addData(Staff staff){
          repo.save(staff);
    }
}
