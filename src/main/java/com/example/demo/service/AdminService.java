package com.example.demo.service;

import com.example.demo.model.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> findAllAdmins();
    Admin saveAdmin(Admin admin);
    Admin loginAdmin(String username, String password);
}
