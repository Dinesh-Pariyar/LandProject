package com.landproject.service.serviceImpl;

import com.landproject.model.Land;
import com.landproject.repository.LandRepository;
import com.landproject.service.LandService;
import com.landproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandServiceImpl  implements LandService {
    @Autowired
    LandRepository landRepository;
    @Autowired
    UserService userService;
    @Override
    public Land createLand(long id, Land land) {
        return null;
    }

    @Override
    public Land createLand(long id) {
        return null;
    }

    @Override
    public void deleteLand(long id) {

    }

    @Override
    public Land updateLand(long id, Land land) {
        return null;
    }

    @Override
    public Land getLand(long id) {
        return null;
    }

    @Override
    public List<Land> getAllLand() {
        return null;
    }
}
