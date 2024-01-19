package com.afencode.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.afencode.model.ApplicationUser;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<ApplicationUser, Integer>{
    Optional<ApplicationUser> findByUsername(String username);
}
