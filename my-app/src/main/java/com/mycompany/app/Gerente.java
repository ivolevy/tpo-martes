package com.mycompany.app;

public class Gerente extends UserController {
    public Gerente(String nombre, String apellido, String dni, String telefono, String email, String contacto) {
        super(nombre, apellido, dni, telefono, email, contacto);
    }

    public void crearHabitacion(Habitacion habitacion) {
        // Lógica para crear habitación
    }

    public void actualizarHabitacion(Habitacion habitacion) {
        // Lógica para actualizar habitación
    }

    public void eliminarHabitacion(Habitacion habitacion) {
        // Lógica para eliminar habitación
    }

    public void confirmarReserva(Reserva reserva) {
        // Lógica para confirmar reserva
    }

    public void cancelarReserva(Reserva reserva) {
        // Lógica para cancelar reserva
    }

    public void pagarReserva(Reserva reserva) {
        // Lógica para pagar reserva
    }

    public void actualizarPrecioPolitica(PoliticaPrecios politica) {
        // Lógica para actualizar política de precios
    }
}
