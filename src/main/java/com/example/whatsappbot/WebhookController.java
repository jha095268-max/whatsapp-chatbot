package com.example.whatsappbot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    private static final Logger logger = LoggerFactory.getLogger(WebhookController.class);

    private final ChatbotService chatbotService;

    public WebhookController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping("/webhook")
    public ResponseEntity<WebhookResponse> receiveMessage(@RequestBody WebhookRequest request) {
        logger.info("Incoming WhatsApp message from={} message={}", request.from(), request.message());

        String reply = chatbotService.generateReply(request.message());
        return ResponseEntity.ok(new WebhookResponse(reply));
    }
}
