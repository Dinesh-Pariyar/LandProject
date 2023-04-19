package com.landproject.controller;

import com.landproject.model.Owner;
import com.landproject.service.OwnerService;
import com.landproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class OwnerController {
    @Autowired
    UserService userService;
    @Autowired
    OwnerService ownerService;

    @PostMapping("/owner/{userId}")
    public ResponseEntity<?> createOwner(@PathVariable Long userId){
        return new ResponseEntity<>(ownerService.saveOwner(userId), HttpStatus.OK);
    }

    @PutMapping("/owner/{ownerId}")
    public ResponseEntity<?> updateOwner(@PathVariable Long ownerId, @RequestBody Owner owner){
        return  new ResponseEntity<>(ownerService.updateOwner(ownerId,owner),HttpStatus.OK);

    }

    @GetMapping("/owner/{ownerId}")
    public ResponseEntity<?> getOwner(@PathVariable Long ownerId){
        return new ResponseEntity<>(ownerService.getSingleOwnerDTO(ownerId),HttpStatus.OK);
    }

    @GetMapping("/allOwners")
    public ResponseEntity<?> getAllOwner(){
        return new ResponseEntity<>(ownerService.getAllOwner(),HttpStatus.OK);
    }


}
