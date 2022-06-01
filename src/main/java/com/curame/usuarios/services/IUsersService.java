package com.curame.usuarios.services;

import com.curame.usuarios.models.entity.User;

import java.util.List;

public interface IUsersService {
    public List<User> getUsers();
    public User getUser(Long id);
    public User create (User user);
    public User update (User user, Long id);
    public void delete(Long id);
    public User findByUserName(String username);
}
