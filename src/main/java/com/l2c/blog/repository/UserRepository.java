package com.l2c.blog.repository;

import com.l2c.blog.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> getByEmail(String email);

    Optional<User> getByEmailOrUsername(String email, String username);

    Boolean findByUsername(String username);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}
