package com.landproject.service;

import com.landproject.model.Owner;

import java.util.List;

public interface OwnerService {
    Owner setOwner(Long userId);
    Owner updateOwner(Long ownerId,Owner owner);

    void deleteOwner(Long ownerId);

    Owner getOwner(Long ownerId);

    List<Owner> getAllOwner();



}
