package com.landproject.service;

import com.landproject.model.DTO.LandDTO;
import com.landproject.model.Land;

import java.util.List;

public interface LandService {

    LandDTO createLand(long ownerId, Land land);
    String  deleteLand(long landId);
    LandDTO updateLand(long landId, Land land);
    LandDTO getLand(long landId);
    List<LandDTO> getAllLand();
}
