package com.mycompany.app;

public class Notification implements NotificacionStrategy {
    private String type;

    public Notification(String type) {
        this.type = type;
    }

    @Override
    public boolean enviar(String mensaje) {
        // Lógica de notificación basada en el tipo
        System.out.println("Enviando notificación de tipo " + type + ": " + mensaje);
        return true;
    }
}
