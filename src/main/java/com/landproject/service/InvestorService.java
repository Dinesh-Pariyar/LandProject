package com.landproject.service;

import com.landproject.model.Investor;
import java.util.List;

public interface InvestorService {

    Investor updateInvestor(Long invId,Investor investor);
    Investor getsingleInvestor(long invId);
    List<Investor> getAllInvestor();
}
