package com.landproject.service.serviceImpl;

import com.landproject.mapper.InvestorMapper;
import com.landproject.model.DTO.InvestorDTO;
import com.landproject.model.Investor;
import com.landproject.model.User;
import com.landproject.repository.InvestorRepository;
import com.landproject.service.InvestorService;
import com.landproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestorServiceImpl implements InvestorService {

    @Autowired
    InvestorMapper investorMapper;
    @Autowired
    InvestorRepository investorRepository;
    @Autowired
    UserService userService;

    @Override
    public InvestorDTO updateInvestor(Long invId, Investor investor) {
        Investor invstr = investorRepository.findById(invId).get();
        User user=investor.getUser();
        userService.updateUser(user.getUserId(), user);
        invstr.setUser(user);
        return investorMapper.modelInvestorToDto(investorRepository.save(invstr));
    }

    @Override
    public InvestorDTO getsingleInvestor(long invId) {
        return investorMapper.modelInvestorToDto(investorRepository.findById(invId).get());
    }

    @Override
    public List<InvestorDTO> getAllInvestor() {
        return investorMapper.investorDtoList(investorRepository.findAll());
    }


}
