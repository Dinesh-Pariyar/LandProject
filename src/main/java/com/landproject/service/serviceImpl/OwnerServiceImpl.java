package com.landproject.service.serviceImpl;

import com.landproject.model.Owner;
import com.landproject.model.User;
import com.landproject.repository.OwnerRepository;
import com.landproject.service.OwnerService;
import com.landproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {
    @Autowired
    OwnerRepository ownerRepository;
    @Autowired
    UserService userService;

    @Override
    public Owner saveOwner(Long userId) {
        Owner owner = new Owner();
        owner.setUser(userService.getUser(userId));
        return ownerRepository.save(owner);
    }

    @Override
    public Owner updateOwner(Long ownerId,Owner owner) {
        Owner owner1=ownerRepository.findById(ownerId).get();
        User user  =(owner.getUser());
        userService.updateUser(user.getUserId(), user);
        owner1.setUser(user);
        return ownerRepository.save(owner1);
    }

    @Override
    public void deleteOwner(Long ownerId) {

    }

    @Override
    public Owner getSingleOwner(Long ownerId) {
        return ownerRepository.findById(ownerId).get();
    }

    @Override
    public List<Owner> getAllOwner() {
        return ownerRepository.findAll();
    }
}
