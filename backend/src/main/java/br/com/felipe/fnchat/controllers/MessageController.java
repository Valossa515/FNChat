package br.com.felipe.fnchat.controllers;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import br.com.felipe.fnchat.dto.MessageDTO;

@RestController
public class MessageController {
	
	@MessageMapping("/user-all")
    @SendTo("/topic/user")
    public MessageDTO send(@Payload MessageDTO message) {
        return message;
    }
}
