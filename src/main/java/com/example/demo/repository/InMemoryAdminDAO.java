package com.example.demo.repository;

import com.example.demo.model.Admin;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryAdminDAO {
    private final List<Admin> ADMINS = new ArrayList<>();

    public List<Admin> findAllAdmins() {
        return ADMINS;
    }

    public Admin saveAdmin(Admin admin) {
        ADMINS.add(admin);
        return admin;
    }

    public Admin findById(String adminId) {
        return ADMINS.stream()
                .filter(admin -> admin.getAdminId().equals(adminId))
                .findFirst()
                .orElse(null);
    }

    public Admin findByUsername(String username) {
        return ADMINS.stream()
                .filter(admin -> admin.getUsername().equals(username))
                .findFirst()
                .orElse(null);
    }

    public Admin updateAdmin(Admin admin) {
        var adminIndex = IntStream.range(0, ADMINS.size())
                .filter(index -> ADMINS.get(index).getAdminId().equals(admin.getAdminId()))
                .findFirst()
                .orElse(-1);

        if (adminIndex > -1) {
            ADMINS.set(adminIndex, admin);
            return admin;
        }
        return null;
    }

    public void deleteAdmin(String adminId) {
        var admin = findById(adminId);
        if (admin != null) {
            ADMINS.remove(admin);
        }
    }
}
