package com.chat.websocket.controller;

import com.chat.websocket.entity.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Random;

@Controller
public class ChatController {

    private String[] colors = {"red","green","blue","purple","orange","yellow"};

    @MessageMapping("/message") //get
    @SendTo("/chat/message") //With this annotation we notify all users of the new message and all subscribed customers
    public Message receiveMessage(Message message){
        message.setDate(new Date().getTime());
        if(message.getType().equals("NEW_USER")){
            message.setColor(colors[new Random().nextInt(colors.length)]);
            message.setText(" - New user connected");
        }
        return message;

    }

    @MessageMapping("/typing")
    @SendTo("/chat/typing")
    public String checkUserTyping(String username){
        return username.concat("is writing ...");
    }
}
