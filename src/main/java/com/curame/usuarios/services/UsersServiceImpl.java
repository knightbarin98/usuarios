package com.curame.usuarios.services;

import com.curame.usuarios.models.entity.User;
import com.curame.usuarios.repository.UserDao;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class UsersServiceImpl implements IUsersService {

    @Autowired
    private UserDao repository;

    @Override
    public List<User> getUsers() {
        log.info("obtener usuarios: {}", this);
        List<User> users = new ArrayList<>();
        repository.findAll().forEach(user -> users.add(user));
        return users;
    }

    @Override
    public User getUser(Long id) {
        log.info("obtener usuario id:" + id + " {}", this);
        User user = repository.findById(id).orElse(null);
        return user;
    }

    @Override
    public User create(User user) {
        log.info("create user {} , {}", user, this);
        User newUser = repository.save(user);
        return newUser;
    }

    @Override
    public User update(User user, Long id) {
        User userdb = repository.findById(id).orElse(null);
        if (userdb == null) {
            return null;
        }
        userdb.setUsername(user.getUsername());
        userdb.setPassword(user.getPassword() == null ? userdb.getPassword() : user.getPassword());
        userdb.setEnabled(true);
        userdb.setLoginTries(0);
        userdb.setFirstname(user.getFirstname());
        userdb.setLastname(user.getLastname());
        userdb.setEmail(user.getEmail());

        return repository.save(userdb);
    }

    @Override
    public void delete(Long id) {
        log.info("delete user id: " + id + " {}", this);
        repository.deleteById(id);
    }

    @Override
    public User findByUserName(String username) {
        User user = repository.findByUsername(username).orElse(null);
        return user;
    }
}
