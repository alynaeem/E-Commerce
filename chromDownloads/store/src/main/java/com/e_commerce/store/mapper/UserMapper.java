package com.e_commerce.store.mapper;

import com.e_commerce.store.dto.UserDTO;
import com.e_commerce.store.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userDTOToUser(UserDTO userDTO);
    UserDTO userToUserDTO(User user);
}