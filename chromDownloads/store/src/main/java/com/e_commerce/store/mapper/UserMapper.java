package com.e_commerce.store.mapper;

import com.e_commerce.store.model.User;
import com.e_commerce.store.dto.UserDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserDTO userToUserDTO(User user);

    User userDTOToUser(UserDTO userDTO);
}