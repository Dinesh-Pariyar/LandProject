package com.landproject.service;

import com.landproject.model.DTO.InvestorDTO;
import com.landproject.model.Investor;
import java.util.List;

public interface InvestorService {

    InvestorDTO updateInvestor(Long invId, Investor investor);
    InvestorDTO getsingleInvestor(long invId);
    List<InvestorDTO> getAllInvestor();
}
