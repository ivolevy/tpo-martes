package com.mycompany.app;

import java.util.Date;
import java.util.List;

public class Cliente extends UserController {
    public Cliente(String nombre, String apellido, String dni, String telefono, String email, String contacto) {
        super(nombre, apellido, dni, telefono, email, contacto);
    }

    public void realizarReserva(Date fechaCheckin, Date fechaCheckout, HabitacionComponent habitacion, FormaPago medioPago, List<Huesped> huespedes) {
        // Lógica para realizar reserva
    }

    public void verEstadoReserva(Reserva reserva) {
        // Lógica para ver estado de la reserva
    }

    public void cancelarReserva(Reserva reserva) {
        // Lógica para cancelar reserva
    }

    public void recibirNotificacion(String notificacion) {
        // Lógica para recibir notificaciones
    }
}
