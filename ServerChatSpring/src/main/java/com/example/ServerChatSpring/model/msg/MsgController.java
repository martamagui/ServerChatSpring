package com.example.ServerChatSpring.model.msg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/msg")
public class MsgController {
    public MsgService msgService;

    @Autowired
    public MsgController(MsgService msgService) {
        this.msgService = msgService;
    }

    @GetMapping
    public List<Msg> getMsgs() {
        return msgService.getMsgs();
    }

    @PostMapping
    public List<Msg> addMsg(@RequestBody Msg msg) {
        msgService.addMsg(msg);
        return msgService.getMsgs();
    }
}
