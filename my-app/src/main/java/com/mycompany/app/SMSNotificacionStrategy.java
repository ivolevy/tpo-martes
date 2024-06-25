package com.mycompany.app;

public class SMSNotificacionStrategy implements NotificacionStrategy {
    @Override
    public boolean enviar(String mensaje) {
        System.out.println("Enviando notificación por SMS: " + mensaje);
        return true;
    }
}
