package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Models.Staff;

public interface StaffRepository extends JpaRepository<Staff,Integer>{
    
}
