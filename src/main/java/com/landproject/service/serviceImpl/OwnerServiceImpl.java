package com.landproject.service.serviceImpl;

import com.landproject.mapper.OwnerMapper;
import com.landproject.model.DTO.OwnerDTO;
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
    OwnerMapper ownerMapper;
    @Autowired
    OwnerRepository ownerRepository;
    @Autowired
    UserService userService;

    @Override
    public OwnerDTO saveOwner(Long userId) {
        OwnerDTO owner = new OwnerDTO();
        owner.setUser(userService.getUser(userId));
        return ownerMapper.modelOwnerToDto(ownerRepository.save(ownerMapper.OwnerDtoToModel(owner)));
    }

    @Override
    public OwnerDTO updateOwner(Long ownerId, Owner owner) {
        Owner owner1 = ownerRepository.findById(ownerId).get();
        User user = (owner.getUser());
        userService.updateUser(user.getUserId(), user);
        owner1.setUser(user);
        return ownerMapper.modelOwnerToDto(ownerRepository.save(owner1));
    }

    @Override
    public void deleteOwner(Long ownerId) {

    }

    @Override
    public OwnerDTO getSingleOwnerDTO(Long ownerId) {
        return ownerMapper.modelOwnerToDto(ownerRepository.findById(ownerId).get());
    }

    @Override
    public Owner getSingleOwner(Long ownerId) {
        return ownerRepository.findById(ownerId).get();
    }


    @Override
    public List<OwnerDTO> getAllOwner() {
        return ownerMapper.listModelOwnerDto(ownerRepository.findAll());
    }
}
