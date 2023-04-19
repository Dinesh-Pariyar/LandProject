package com.landproject.mapper;

import com.landproject.model.DTO.LandDTO;
import com.landproject.model.DTO.OwnerDTO;
import com.landproject.model.Land;
import com.landproject.model.Owner;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.List;

@Mapper(componentModel = "spring",uses ={UserMapper.class})
public interface OwnerMapper {
    @Mapping(target = "landList", qualifiedByName = "blockOwner") // target = field lai block garney
    OwnerDTO modelOwnerToDto(Owner owner);
    Owner OwnerDtoToModel(OwnerDTO ownerDTO);
    List<OwnerDTO> listModelOwnerDto(List<Owner> ownerList);

    @Named("blockOwner")
    @Mapping(target = "owner", ignore = true) //target=Land Ma vayeko field ko naam.that is responsible  to bring stack over flow.
    LandDTO landToLandDto(Land land);


//    List<LandDTO> listOfLandDto(List<Land> landList);
}
