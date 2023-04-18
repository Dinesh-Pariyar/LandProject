package com.landproject.service.serviceImpl;

import com.landproject.model.Land;
import com.landproject.model.Owner;
import com.landproject.repository.LandRepository;
import com.landproject.service.LandService;
import com.landproject.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LandServiceImpl implements LandService {
    @Autowired
    LandRepository landRepository;
    @Autowired
    OwnerService ownerService;


    @Override
    public Land createLand(long ownerId, Land land) {
        Owner owner = ownerService.getSingleOwner(ownerId);
        land.setOwner(owner);
        landRepository.save(land);
        owner.setLandList(List.of(land));
        ownerService.saveOwner(owner.getUser().getUserId());
        return land;
    }

    @Override
    public String deleteLand(long landId) {
        Land land=landRepository.findById(landId).get();
        land.setDeleted(true);
        landRepository.save(land);
        return "land of Id "+ landId +" is deleted successfully";
    }

    @Override
    public Land updateLand(long landId, Land land) {
        Land lnd=landRepository.findById(landId).get();
        lnd.setLandArea(land.getLandArea());
        lnd.setLandPrice(land.getLandPrice());
        lnd.setLandLocation(land.getLandLocation());
        lnd.setOwner(land.getOwner());
        ownerService.updateOwner(land.getOwner().getOwnerId(), land.getOwner());
        return landRepository.save(lnd);
    }

    @Override
    public Land getLand(long landId) {
        return landRepository.findById(landId).get();
    }

    @Override
    public List<Land> getAllLand() {
        return landRepository.findAll();
    }
}
