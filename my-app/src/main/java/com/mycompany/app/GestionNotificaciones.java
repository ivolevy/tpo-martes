package com.mycompany.app;

import java.util.List;

public class GestionNotificaciones {
    private List<NotificacionStrategy> estrategias;
    private String tipoNotificacion;

    public GestionNotificaciones(List<NotificacionStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public boolean enviarNotificacion(String mensaje) {
        for (NotificacionStrategy estrategia : estrategias) {
            if (estrategia.enviar(mensaje)) {
                return true;
            }
        }
        return false;
    }

    public void configurarTipoNotificacion(String tipo) {
        this.tipoNotificacion = tipo;
    }

    public String getTipoNotificacion() {
        return tipoNotificacion;
    }
}
