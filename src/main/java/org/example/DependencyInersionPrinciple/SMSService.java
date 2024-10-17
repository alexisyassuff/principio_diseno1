package org.example.DependencyInersionPrinciple;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando SMS con el mensaje: " + message);
    }
}
