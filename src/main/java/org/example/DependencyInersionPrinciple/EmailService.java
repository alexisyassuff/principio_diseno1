package org.example.DependencyInersionPrinciple;


public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando email con el mensaje: " + message);
    }
}
