package com.landproject.controller;

import com.landproject.model.Investor;
import com.landproject.service.InvestorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class InvestorController {
    @Autowired
    InvestorService investorService;


    @PutMapping("/inv/{invId}")
    public ResponseEntity<?> updateInvestor(@PathVariable Long invId, @RequestBody Investor investor){
        return new ResponseEntity<>(investorService.updateInvestor(invId,investor),HttpStatus.OK);
    }

    @GetMapping("/inv/{invId}")
    public ResponseEntity<?> getSingleInvestor(@PathVariable Long invId){
        return  new ResponseEntity<>(investorService.getsingleInvestor(invId),HttpStatus.OK);
    }

    @GetMapping("/inv/allInvs")
    public ResponseEntity<?> getAllInvestors(){
        return new ResponseEntity<>(investorService.getAllInvestor(),HttpStatus.OK);
    }
}
