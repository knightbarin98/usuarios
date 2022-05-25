package com.curame.usuarios.repository;

import com.curame.usuarios.models.entity.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "users")
public interface UserDao extends PagingAndSortingRepository<User, Long> {

    @RestResource(path = "search-username")
    public User findByUsername(@Param("username") String username);
}
