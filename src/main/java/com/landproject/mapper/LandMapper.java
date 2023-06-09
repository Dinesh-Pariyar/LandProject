package com.landproject.mapper;

import com.landproject.model.DTO.LandDTO;
import com.landproject.model.DTO.OwnerDTO;
import com.landproject.model.Land;
import com.landproject.model.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses = {UserMapper.class, OwnerMapper.class})
public interface LandMapper {
    @Mapping(target = "owner",qualifiedByName = "blockLand")
    LandDTO modelLandTODto(Land land);
    LandDTO landDtoToModel(LandDTO landDTO);
    List<LandDTO> landDtoList(List<Land> landList);

    @Named("blockLand")                         // jati bela owner field vetxa teti bela block land ma ja vanxa ani
    @Mapping(target = "landList",ignore = true) // jaba owner lai owner dto ma convert garda land list lai ignore gar
    OwnerDTO ownerToOwnerDto(Owner owner);      // vaneko ho.

}
