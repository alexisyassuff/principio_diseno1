package org.example.DependencyInersionPrinciple;


public class TikTokService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando notificación de TikTok con el mensaje: " + message);
    }
}
