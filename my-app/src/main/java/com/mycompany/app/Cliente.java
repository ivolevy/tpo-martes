package com.mycompany.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente extends UserController {
    private List<Reserva> reservas;

    public Cliente(String nombre, String apellido, String dni, String telefono, String email, String contacto) {
        super(nombre, apellido, dni, telefono, email, contacto);
        this.reservas = new ArrayList<>();
    }

    public Reserva realizarReserva(Date fechaCheckIn, Date fechaCheckOut, HabitacionComponent habitacion, 
                                   FormaPago medioPago, List<Huesped> huespedes) {
        if (habitacion.verificarDisponibilidad(fechaCheckIn, fechaCheckOut)) {
            Reserva reserva = new Reserva(fechaCheckIn, fechaCheckOut, habitacion, this, huespedes, medioPago);
            habitacion.actualizarDisponibilidad(fechaCheckIn, fechaCheckOut, false);
            reservas.add(reserva);
            return reserva;
        }
        return null;
    }

    public void verificarEstadoReserva(Reserva reserva) {
        System.out.println("Estado de la reserva: " + reserva.getEstado());
    }

    public void recibirNotificacion(String notificacion) {
        System.out.println("Notificación recibida: " + notificacion);
    }
}
