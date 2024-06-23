package com.mycompany.app;

public class GestionNotificaciones {
    private NotificacionStrategy notificacionStrategy;

    public void setNotificacionStrategy(NotificacionStrategy notificacionStrategy) {
        this.notificacionStrategy = notificacionStrategy;
    }

    public void notificar(String mensaje, Cliente cliente) {
        if (notificacionStrategy != null) {
            notificacionStrategy.notificar(mensaje, cliente);
        }
    }
}

