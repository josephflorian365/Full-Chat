package com.chat.websocket.controller;

import com.chat.websocket.entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@Controller
public class ChatController {

    @MessageMapping
    @SendTo("/chat/message") //With this annotation we notify all users of the new message and all subscribed customers
    public Message receiveMessage(Message message){
        message.setDate(new Date().getTime());
        message.setText("receive for the broker : " + message.getText());
        return message;

    }
}
