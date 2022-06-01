package com.curame.usuarios.repository;

import com.curame.usuarios.models.entity.Profile;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDao extends CrudRepository<Profile,Long> {
}
