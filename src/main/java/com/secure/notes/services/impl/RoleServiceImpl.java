package com.secure.notes.services.impl;

import com.secure.notes.models.Role;
import com.secure.notes.repositories.RoleRepository;
import com.secure.notes.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleRepository roleRepository;

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
}
