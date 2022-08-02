package com.example.weiboclone.repository;

import com.example.weiboclone.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Object> findByUsername(String username);
}