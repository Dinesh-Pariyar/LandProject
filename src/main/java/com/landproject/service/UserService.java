package com.landproject.service;


import com.landproject.model.DTO.UserDTO;
import com.landproject.model.User;

import java.util.List;

public interface UserService {
    UserDTO addUser(User user);
    UserDTO updateUser(long id, User user);
    String  deleteUser(long id);
    UserDTO getUser(long id);
    List<UserDTO> getAllUsers();

}
