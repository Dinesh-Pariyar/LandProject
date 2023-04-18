package com.landproject.repository;

import com.landproject.model.Investor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestorRepository extends JpaRepository<Investor, Integer> {
}
