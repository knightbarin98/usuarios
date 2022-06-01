package com.curame.usuarios.services;

import com.curame.usuarios.models.entity.Profile;
import com.curame.usuarios.repository.ProfileDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ProfilesServiceImpl implements IProfileServices{

    @Autowired
    private ProfileDao repository;

    @Override
    public List<Profile> getProfiles() {
        log.info("obtener profiles : {}",this);
        List<Profile> profiles = new ArrayList<>();
        repository.findAll().forEach(profile -> profiles.add(profile));
        return profiles;
    }
}
