package com.landproject.service.serviceImpl;

import com.landproject.mapper.UserMapper;
import com.landproject.model.DTO.UserDTO;
import com.landproject.model.Investor;
import com.landproject.model.User;
import com.landproject.repository.InvestorRepository;
import com.landproject.repository.UserRepository;
import com.landproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    InvestorRepository investorRepository;
    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDTO addUser(User user) {
        Investor investor = new Investor();
        investor.setUser(user);
        investorRepository.save(investor);
        userRepository.save(user);
        return userMapper.modelUserToDto(user);
    }

    @Override
    public UserDTO updateUser(long id, User user) {
        User usr = userRepository.findById(id).get();
        usr.setUserName(user.getUserName());
        usr.setUserEmail(user.getUserEmail());
        usr.setUserPassword(user.getUserPassword());
        userRepository.save(usr);
        return userMapper.modelUserToDto(usr);
    }

    @Override
    public String deleteUser(long id) {
        User user = userRepository.findById(id).get();
        user.setDeleted(true);
        userRepository.save(user);
        return "user id of '" + id + "' is deleted successfully";
    }

    @Override
    public UserDTO getUser(long id) {
        return userMapper.modelUserToDto(userRepository.findById(id).get());
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return userMapper.modelListToDtoList(userRepository.findAll());
    }
}
