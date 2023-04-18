package com.landproject.controller;

import com.landproject.model.Land;
import com.landproject.service.LandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LandController {
    @Autowired
    LandService landService;

    @PostMapping("/addLand/userId={id}")
    public ResponseEntity<?> addLand(@PathVariable long id, @RequestBody Land land){
        return new ResponseEntity<>(landService.createLand(id,land), HttpStatus.OK);

    }

}
