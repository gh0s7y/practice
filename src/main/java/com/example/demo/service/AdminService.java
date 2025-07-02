package com.example.demo.service;

import com.example.demo.model.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> findAllAdmins();
    Admin saveAdmin(Admin admin);
    Admin findById(String adminId);
    Admin updateAdmin(Admin admin);
    void deleteAdmin(String adminId);
    Admin findByUsername(String username);  // Новый метод для поиска по username
    Admin loginAdmin(String username, String password);
}
