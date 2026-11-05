package com.ecommerce.ecommerce.Service.Implemantation;

import com.ecommerce.ecommerce.DTO.UserDto;
import com.ecommerce.ecommerce.Service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public UserDto getUserById(Long id) {
        return null;
    }

    @Override
    public UserDto addUser(UserDto userDTO) {
        return null;
    }

    @Override
    public UserDto updateUser(Long id, UserDto userDTO) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }
}
