package com.ecommerce.ecommerce.Service;

import com.ecommerce.ecommerce.DTO.UserDto;

import java.util.List;

public interface UserService {
    List<UserDto> getAllUsers();
    UserDto getUserById(Long id);
    UserDto addUser(UserDto userDTO);
    UserDto updateUser(Long id, UserDto userDTO);
    void deleteUser(Long id);
}
