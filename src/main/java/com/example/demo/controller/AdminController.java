package com.example.demo.controller;

import com.example.demo.model.Admin;
import com.example.demo.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/admins")
@AllArgsConstructor
public class AdminController {
    private final AdminService service;

    @GetMapping
    public List<Admin> findAllAdmins() {
        return service.findAllAdmins();
    }

    @PostMapping("/register")
    public Admin registerAdmin(@RequestBody Admin admin) {
        return service.saveAdmin(admin);
    }

    @GetMapping("/{adminId}")
    public Admin findById(@PathVariable String adminId) {
        return service.findById(adminId);
    }

    @GetMapping("/by-username/{username}")
    public Admin findByUsername(@PathVariable String username) {
        return service.findByUsername(username);
    }

    @PutMapping("/update")
    public Admin updateAdmin(@RequestBody Admin admin) {
        return service.updateAdmin(admin);
    }

    @DeleteMapping("/delete/{adminId}")
    public void deleteAdmin(@PathVariable String adminId) {
        service.deleteAdmin(adminId);
    }
}