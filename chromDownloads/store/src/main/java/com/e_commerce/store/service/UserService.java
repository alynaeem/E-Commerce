package com.e_commerce.store.service;

import com.e_commerce.store.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserByid(Long id);
    UserDTO updateUser(UserDTO userDTO);
    void deleteUser(Long id);
    List<UserDTO> getAllUsers();

}
