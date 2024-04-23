package com.porfanid.backend.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface UserRepository extends JpaRepository<User, String> {
    @Transactional
    @Modifying
    @Query("UPDATE User u SET u.username = :newEmail WHERE u.username = :username")
    void updateUser(String username, String newEmail);
}