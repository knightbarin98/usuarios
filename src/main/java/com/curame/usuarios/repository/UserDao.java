package com.curame.usuarios.repository;

import com.curame.usuarios.models.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserDao extends CrudRepository<User, Long> {
    public Optional<User> findByUsername(String username);
}
