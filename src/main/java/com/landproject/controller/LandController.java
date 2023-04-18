package com.landproject.controller;

import com.landproject.model.Land;
import com.landproject.service.LandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LandController {
    @Autowired
    LandService landService;

    @PostMapping("/addLand/{ownerId}")
    public ResponseEntity<?> addLand(@PathVariable long ownerId, @RequestBody Land land){
        return new ResponseEntity<>(landService.createLand(ownerId,land), HttpStatus.OK);
    }

    @PutMapping("/land/{landId}")
    public ResponseEntity<?> updateLand(@PathVariable long landId,@RequestBody Land land){
        return new ResponseEntity<>(landService.updateLand(landId,land), HttpStatus.OK);
    }

    @DeleteMapping("/land/{landId}")
    public ResponseEntity<?> deleteLand(@PathVariable long landId){
        return  new ResponseEntity<>(landService.deleteLand(landId),HttpStatus.OK);
    }

    @GetMapping("/land/{landId}")
    public ResponseEntity<?> getSingleLand(@PathVariable long landId){
        return new ResponseEntity<>(landService.getLand(landId),HttpStatus.OK);
    }

    @GetMapping("/land/getAllLand")
    public ResponseEntity<?> getAllLand(){
        return  new ResponseEntity<>(landService.getAllLand(),HttpStatus.OK);
    }

}
