package com.example.demo.service.Impl;

import com.example.demo.model.Admin;
import com.example.demo.repository.InMemoryAdminDAO;
import com.example.demo.service.AdminService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryAdminServiceImpl implements AdminService {
    private final InMemoryAdminDAO repository;

    @Override
    public List<Admin> findAllAdmins() {
        return repository.findAllAdmins();
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        // Проверка на уникальность username
        if (repository.findByUsername(admin.getUsername()) != null) {
            throw new RuntimeException("Username already exists");
        }
        return repository.saveAdmin(admin);
    }

    @Override
    public Admin findById(String adminId) {
        return repository.findById(adminId);
    }

    @Override
    public Admin findByUsername(String username) {
        return repository.findByUsername(username);
    }

    @Override
    public Admin updateAdmin(Admin admin) {
        return repository.updateAdmin(admin);
    }

    @Override
    public void deleteAdmin(String adminId) {
        repository.deleteAdmin(adminId);
    }
}
