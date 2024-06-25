package com.mycompany.app;

public class SMSNotificacionStrategy implements NotificacionStrategy {
    @Override
    public boolean enviar(String mensaje) {
        // Lógica para enviar notificación por SMS
        System.out.println("Enviando notificación por SMS: " + mensaje);
        return true;
    }
}
