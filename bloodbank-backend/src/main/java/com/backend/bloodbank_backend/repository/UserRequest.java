package com.backend.bloodbank_backend.repository;

import java.lang.StackWalker.Option;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.bloodbank_backend.model.User;

public interface UserRequest extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
