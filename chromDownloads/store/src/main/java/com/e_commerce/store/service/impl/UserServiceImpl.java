package com.e_commerce.store.service.impl;

import com.e_commerce.store.dto.UserDTO;
import com.e_commerce.store.mapper.UserMapper;
import com.e_commerce.store.model.User;
import com.e_commerce.store.repository.UserRepository;
import com.e_commerce.store.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper; // Inject UserMapper


    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {

        User user = userMapper.userDTOToUser(userDTO);
        User savedUser = userRepository.save(user);
        return userMapper.userToUserDTO(savedUser);
    }

    @Override
    public UserDTO getUserByid(Long id) {

        User user = userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("User not found"));

        return userMapper.userToUserDTO(user);
    }
    @Override
    public UserDTO updateUser(UserDTO userDTO) {

        Optional<User> optionalUser = userRepository.findById(userDTO.getId());


        if (optionalUser.isPresent()) {
            User user = optionalUser.get();


            user.setName(userDTO.getName());
            user.setEmail(userDTO.getEmail());
            user.setRole(userDTO.getRole());


            User updatedUser = userRepository.save(user);
            return userMapper.userToUserDTO(updatedUser);
        } else {

            throw new RuntimeException("User not found");
        }
    }
    @Override
    public void deleteUser(Long id) {
        User user = userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("User not found"));
        userRepository.delete(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {

        List<User> users = userRepository.findAll();


        return users.stream()
                .map(userMapper::userToUserDTO)
                .collect(Collectors.toList());
    }
}