package com.mycompany.app;

import java.util.List;

public class Cliente extends UserController {
    public Cliente(String nombre, String apellido, String dni, String telefono, String email, String contacto) {
        super(nombre, apellido, dni, telefono, email, contacto);
    }

    public void realizarReserva(Reserva reserva) {
        reserva.setEstado("pendiente de pago");
        reserva.getHabitacion().actualizarDisponibilidad(false);
        reserva.setMonto(calcularMontoReserva(reserva));
        // Enviar notificación (implementación de notificación aquí)
    }

    private double calcularMontoReserva(Reserva reserva) {
        double montoBase = reserva.getHabitacion().obtenerPrecio();
        for (PoliticaPrecios politica : reserva.getPoliticas()) {
            montoBase += montoBase * politica.calcularDescuento(reserva.getFechaReserva(), reserva.getFechaCheckin());
        }
        return montoBase;
    }
}

