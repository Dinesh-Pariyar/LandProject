package com.landproject.mapper;

import com.landproject.model.DTO.InvestorDTO;
import com.landproject.model.Investor;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface InvestorMapper {

    InvestorDTO modelInvestorToDto(Investor investor);
    Investor investorDtoToModel(InvestorDTO investorDTO);

    List<InvestorDTO> investorDtoList(List<Investor> investorList);
}
