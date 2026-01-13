package com.pentasoftsolutions.repository;

import com.pentasoftsolutions.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserJpaRepository extends JpaRepository<User, Long> {

    // Find user by username
    Optional<User> findByUsername(String username);

    // Find user by email
    Optional<User> findByEmail(String email);

    // Custom query example
    @Query("SELECT u FROM User u WHERE u.username = :username AND u.email = :email")
    Optional<User> findByUsernameAndEmail(@Param("username") String username, @Param("email") String email);

    // Check if username exists
    boolean existsByUsername(String username);

    // Check if email exists
    boolean existsByEmail(String email);
}
