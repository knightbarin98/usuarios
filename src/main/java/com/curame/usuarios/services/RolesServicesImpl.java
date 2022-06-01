package com.curame.usuarios.services;

import com.curame.usuarios.models.entity.Role;
import com.curame.usuarios.repository.RoleDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class RolesServicesImpl implements IRolesService{

    @Autowired
    private RoleDao repository;

    @Override
    public List<Role> getRoles() {
        log.info("obtener roles: {}", this);
        List<Role> roles = new ArrayList<>();
        repository.findAll().forEach(role -> roles.add(role));
        return roles;
    }
}
