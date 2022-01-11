package com.example.ServerChatSpring.model.msg;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MsgService {
    private MsgRepository msgRepository;

    public MsgService(MsgRepository msgRepository) {
        this.msgRepository = msgRepository;
    }

    public List<Msg> getMsgs() {
        return msgRepository.findAll();
    }
}
