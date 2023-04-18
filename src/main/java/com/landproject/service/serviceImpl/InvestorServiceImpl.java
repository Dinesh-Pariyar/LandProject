package com.landproject.service.serviceImpl;

import com.landproject.model.Investor;
import com.landproject.repository.InvestorRepository;
import com.landproject.service.InvestorService;
import com.landproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorServiceImpl implements InvestorService {
    @Autowired
    InvestorRepository investorRepository;
    @Autowired
    UserService userService;

    @Override
    public Investor updateInvestor(Long invId, Investor investor) {
        Investor invstr =investorRepository.findById(invId).get();
        invstr.setUser(userService.updateUser(investor.getUser().getUserId(), investor.getUser()));
        return investorRepository.save(invstr);
    }
    @Override
    public Investor getsingleInvestor(long invId) {
        return investorRepository.findById(invId).get();
    }
    @Override
    public List<Investor> getAllInvestor() {
        return investorRepository.findAll();
    }
}
