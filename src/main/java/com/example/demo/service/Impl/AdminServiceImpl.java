package com.example.demo.service.Impl;

import com.example.demo.model.Admin;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {
    private final AdminRepository repository;

    @Override
    public List<Admin> findAllAdmins() {
        return repository.findAll();
    }

    @Override
    @Transactional
    public Admin saveAdmin(Admin admin) {

        return repository.save(admin);
    }

    @Override
    @Transactional
    public Admin loginAdmin(String username, String password) {
        Admin admin = repository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("Admin not found"));

        if (!admin.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return admin;
    }
}
