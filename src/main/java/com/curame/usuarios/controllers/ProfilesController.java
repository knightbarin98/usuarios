package com.curame.usuarios.controllers;

import com.curame.usuarios.models.entity.Profile;
import com.curame.usuarios.services.IProfileServices;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ProfilesController {

    @Autowired
    private IProfileServices service;

    @GetMapping("/profiles")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<Profile> getProfiles(){
        return service.getProfiles();
    }
}
