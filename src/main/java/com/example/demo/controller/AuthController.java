package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.model.dto.LoginRequest;
import com.example.demo.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/auth")
@AllArgsConstructor
public class AuthController {
    private final AdminService adminService;
    @PostMapping("/login")  // <- Должен быть POST!
    public Admin login(@RequestBody LoginRequest request) {
        return adminService.loginAdmin(request.getUsername(), request.getPassword());
    }
}