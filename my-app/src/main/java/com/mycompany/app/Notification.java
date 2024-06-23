package com.mycompany.app;

public class Notification implements NotificacionStrategy {
    private String mensaje;

    public Notification(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public void enviar() {
        // Implementación de la lógica para enviar una notificación
        System.out.println("Enviando notificación: " + mensaje);
    }

    @Override
    public void notificar(String mensaje, Cliente cliente) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'notificar'");
    }
}