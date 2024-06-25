package com.mycompany.app;

public class EmailNotificacionStrategy implements NotificacionStrategy {
    @Override
    public boolean enviar(String mensaje) {
        System.out.println("Enviando notificación por email: " + mensaje);
        return true;
    }
}
