package com.curame.usuarios.controllers;

import com.curame.usuarios.models.entity.Role;
import com.curame.usuarios.services.IRolesService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class RolesController {

    @Autowired
    private IRolesService service;

    @GetMapping("/roles")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Role> getRoles(){
        log.info("request GET: {}",this);
        return service.getRoles();
    }
}
