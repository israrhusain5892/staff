package com.example.Models;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String emp_status;
    private String staff_type;
    private String staff_dpt;
    private String emp_cat;
    private String staff_design;
    private String qualification_type;
    private String education_qualification;
    private String access_level;
    private String trained_as;
    private boolean cetet;

    // personal detail
    private String first_name;
    private String middle_name;
    private String last_name;
    private Long mobile_no;
    private Long emergency_contact_no;
    private String gender;
    private Date dob;
    private String permanent_address;
    private String correspondence_address;
    private String religion;

    // other detail

    private Long aadhar_no;
    private String pan_number;
    private String joining_date;
    private String staf_ref_code;


}
