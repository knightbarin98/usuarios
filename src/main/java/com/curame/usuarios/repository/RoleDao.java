package com.curame.usuarios.repository;

import com.curame.usuarios.models.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDao extends CrudRepository<Role,Long> {
}
