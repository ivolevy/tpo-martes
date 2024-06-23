package com.mycompany.app;

import java.util.List;

@SuppressWarnings("unused")
public class Cliente extends UserController {
    public Cliente(String nombre, String apellido, String dni, String telefono, String email, String contacto) {
        super(nombre, apellido, dni, telefono, email, contacto);
    }

    public void realizarReserva(Reserva reserva) {
        reserva.setEstado("pendiente de pago");
        reserva.getHabitacion().actualizarDisponibilidad(false);
        reserva.setMonto(calcularMontoReserva(reserva));
    }

    private double calcularMontoReserva(Reserva reserva) {
        // Implementación para calcular el monto total de la reserva.
        double montoTotal = 0;
        // Calcular monto base por la habitación
        montoTotal += reserva.getHabitacion().getPrecio() * reserva.getDuracionEstancia();
        // Agregar extras si existen
        for (Extras extra : reserva.getExtras()) {
            montoTotal += extra.getPrecio();
        }
        // Aplicar políticas de precios si existen
        for (PoliticaPrecios politica : reserva.getPoliticas()) {
            montoTotal -= politica.calcularDescuento(reserva.getFechaReserva(), reserva.getFechaCheckin());
        }
        return montoTotal;
    }
}