package com.curame.usuarios.repository;

import com.curame.usuarios.models.entity.Role;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "roles")
public interface RoleDao extends PagingAndSortingRepository<Role,Long> {
}
