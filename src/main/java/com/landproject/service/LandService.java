package com.landproject.service;

import com.landproject.model.Land;

import java.util.List;

public interface LandService {

    Land createLand(long ownerId,Land land);
    String  deleteLand(long landId);
    Land updateLand(long landId, Land land);
    Land getLand(long landId);
    List<Land> getAllLand();
}
