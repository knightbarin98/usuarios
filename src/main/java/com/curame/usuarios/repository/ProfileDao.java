package com.curame.usuarios.repository;

import com.curame.usuarios.models.entity.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "profiles")
public interface ProfileDao extends PagingAndSortingRepository<Profile,Long> {
}
