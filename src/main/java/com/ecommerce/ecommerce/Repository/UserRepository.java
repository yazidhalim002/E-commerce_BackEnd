package com.ecommerce.ecommerce.Repository;

import com.ecommerce.ecommerce.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository
        extends JpaRepository<User,Long> {
}
