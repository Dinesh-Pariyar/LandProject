package com.landproject.service;

import com.landproject.model.DTO.OwnerDTO;
import com.landproject.model.Owner;

import java.util.List;

public interface OwnerService {
    OwnerDTO saveOwner(Long userId);
    OwnerDTO updateOwner(Long ownerId,Owner owner);

    void deleteOwner(Long ownerId);

    OwnerDTO getSingleOwnerDTO(Long ownerId);

    Owner getSingleOwner(Long ownerId);


    List<OwnerDTO> getAllOwner();



}
