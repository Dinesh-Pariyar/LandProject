package com.landproject.service.serviceImpl;

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
    InvestorRepository investorRepository;
    final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        Investor investor = new Investor();
        investor.setUser(user);
        investorRepository.save(investor);
        userRepository.save(user);
        return user;
    }

    @Override
    public User updateUser(long id, User user) {
        User usr = userRepository.findById(id).get();
        usr.setUserName(user.getUserName());
        usr.setUserEmail(user.getUserEmail());
        usr.setUserPassword(user.getUserPassword());
        return userRepository.save(usr);
    }

    @Override
    public String deleteUser(long id) {
        User user = userRepository.findById(id).get();
        user.setDeleted(true);
        userRepository.save(user);
        return "user id of '" + id + "' is deleted successfully";
    }

    @Override
    public User getUser(long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
