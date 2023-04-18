package com.landproject.service;

import com.landproject.model.Land;

import java.util.List;

public interface LandService {

    Land createLand(long id,Land land);

    Land createLand(long id);

    void deleteLand(long id);
    Land updateLand(long id, Land land);
    Land getLand(long id);
    List<Land> getAllLand();

}
