package com.mycompany.app;

public class EmailNotificacionStrategy implements NotificacionStrategy {
    @Override
    public boolean enviar(String mensaje) {
        // Lógica para enviar notificación por email
        System.out.println("Enviando notificación por email: " + mensaje);
        return true;
    }
}
