package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDto> getAllUsers();
    Optional<UserDto> getUserById(Long id);
    UserDto addUser(UserDto userDTO);
    UserDto updateUser(Long id, UserDto userDTO);
    void deleteUser(Long id);
}
