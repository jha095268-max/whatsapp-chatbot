package com.example.whatsappbot;

import java.util.Locale;
import org.springframework.stereotype.Service;

@Service
public class ChatbotService {
    public String generateReply(String incomingMessage) {
        if (incomingMessage == null || incomingMessage.isBlank()) {

            return "Please send a valid message.";
        }

        String normalizedMessage = incomingMessage.trim().toLowerCase(Locale.ROOT);
        return switch (normalizedMessage) {
            case "hi" -> "Hello";
               case "bye" -> "Goodbye";
            default -> "I can reply to Hi and Bye for now.";
        };
    }
}
