package com.landproject.service;


import com.landproject.model.User;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User updateUser(long id, User user);
    String  deleteUser(long id);
    User getUser(long id);
    List<User> getAllUsers();

}
