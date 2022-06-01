package com.curame.usuarios.controllers;

import com.curame.usuarios.models.entity.User;
import com.curame.usuarios.services.IUsersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class UsersController {

    @Autowired
    public IUsersService service;

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public List<User> getUsers(){
        log.info("request GET all: {}",this );
        return service.getUsers();
    }

    @GetMapping("/users/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User getUser(@PathVariable Long id){
        log.info("request GET :"+id+" {}",this );
        return service.getUser(id);
    }

    @PostMapping("/users")
    @ResponseStatus(HttpStatus.CREATED)
    public User create(@RequestBody User user){
        log.info("request create : {}",this );
        return service.create(user);
    }

    @PutMapping("/users/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public User update(@RequestBody User user, @PathVariable Long id){
        log.info("request update : {}",this );
        return service.update(user,id);
    }

    @DeleteMapping("/users/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id){
        log.info("request delete : {}",this );
        service.delete(id);
    }

    @GetMapping("/users/search-username")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public User findUserByUsername(@Param("username") String username){
        log.info("request get  user by username: {}",this );
        return service.findByUserName(username);
    }
}
