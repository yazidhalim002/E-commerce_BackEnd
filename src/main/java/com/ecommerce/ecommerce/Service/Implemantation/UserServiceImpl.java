package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.UserDto;
import com.ecommerce.ecommerce.Model.User;
import com.ecommerce.ecommerce.Repository.UserRepository;
import com.ecommerce.ecommerce.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserDto> getUserById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public UserDto addUser(UserDto userDTO) {
        return userRepository.save(userDTO);
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDTO) {
        UserDto user = userRepository.findById(id).orElseThrow(()->new RuntimeException("user not found"));
            user.setEmail(userDTO.getEmail());
            user.setRole(userDTO.getRole());
            user.setUsername(userDTO.getUsername());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
