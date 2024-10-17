package org.example.DependencyInersionPrinciple;

public class Notification {
    private MessageService messageService;

    // Inyección de dependencias a través del constructor
    public Notification(MessageService messageService) {
        this.messageService = messageService; // Dependencia en la abstracción
    }

    public void send(String message) {
        messageService.sendMessage(message); // Llama al método de la abstracción
    }
}

