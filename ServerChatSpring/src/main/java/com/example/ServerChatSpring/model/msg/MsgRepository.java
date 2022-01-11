package com.example.ServerChatSpring.model.msg;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface MsgRepository extends JpaRepository<Msg, Integer> {
    @Query("SELECT m FROM Msg m WHERE m.msgId=?1")
    Optional<Msg> findMsgById(Integer msgId);
}
