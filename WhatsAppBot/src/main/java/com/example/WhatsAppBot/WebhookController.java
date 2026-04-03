package com.example.WhatsAppBot;

import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class WebhookController {

    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    @PostMapping("/webhook")
    public String handleMessage(@RequestBody MessageRequest request) {

        String message = request.getMessage();

        logger.info("Received message: {}", message);

        String lowerMsg = message.toLowerCase();

        if (lowerMsg.contains("hi")) {
            return "Hello";
        } else if (lowerMsg.contains("bye")) {
            return "Goodbye";
        } else {
            return "Sorry, I didn't understand.";
        }
    }
}