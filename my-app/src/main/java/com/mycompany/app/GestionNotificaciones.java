package com.mycompany.app;

import java.util.List;

public class GestionNotificaciones {
    private List<NotificacionStrategy> notificaciones;

    public GestionNotificaciones(List<NotificacionStrategy> notificaciones) {
        this.notificaciones = notificaciones;
    }

    public void agregarNotificacion(NotificacionStrategy notificacion) {
        notificaciones.add(notificacion);
    }

    public void eliminarNotificacion(NotificacionStrategy notificacion) {
        notificaciones.remove(notificacion);
    }

    public void enviarNotificaciones() {
        for (NotificacionStrategy notificacion : notificaciones) {
            notificacion.enviar();
        }
    }
}