package com.example.chat_app;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Controller
public class ChatController {

    @MessageMapping("/sendMessage")
    @SendTo("/topic/messages")
    public Map<String, String> handleMessage(Map<String, String> payload) {
        // Generate timestamp: e.g., "14:30"
        String timestamp = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm"));
        
        // Add the timestamp to the map so the frontend can see it
        payload.put("timestamp", timestamp);
        
        System.out.println("Processing message from: " + payload.get("sender") + " at " + timestamp);
        return payload; 
    }
}