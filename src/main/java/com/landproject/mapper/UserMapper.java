package com.landproject.mapper;

import com.landproject.model.DTO.UserDTO;
import com.landproject.model.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDTO modelUserToDto(User user);
    User userDtoToModel(UserDTO userDTO);
    List<UserDTO> modelListToDtoList(List<User> userList);


}
