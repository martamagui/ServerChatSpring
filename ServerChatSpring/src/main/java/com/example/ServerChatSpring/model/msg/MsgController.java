package com.example.ServerChatSpring.model.msg;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/msg")
public class MsgController {
    private MsgService msgService;
}
