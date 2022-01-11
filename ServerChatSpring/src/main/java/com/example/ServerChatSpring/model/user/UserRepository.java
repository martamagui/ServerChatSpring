package com.example.ServerChatSpring.model.user;

import com.example.ServerChatSpring.model.msg.Msg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Integer> {
    @Query("SELECT m FROM User m WHERE m.userId=?1")
    Optional<User> findUserById(Integer userId);
}
