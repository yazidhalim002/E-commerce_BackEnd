package com.ecommerce.ecommerce.DTO;


import com.ecommerce.ecommerce.Enum.Role;
import com.ecommerce.ecommerce.Model.Cart;
import com.ecommerce.ecommerce.Model.Order;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDto {
    private Long id;
    private String username;
    private String email;
    private Role role;


}
