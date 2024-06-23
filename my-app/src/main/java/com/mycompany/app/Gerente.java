package com.mycompany.app;

public class Gerente extends UserController {

    public Gerente(String nombre, String apellido, String dni, String telefono, String email, String contacto) {
        super(nombre, apellido, dni, telefono, email, contacto);
    }

    public void actualizarPrecioHabitacion(HabitacionComponent habitacion, double nuevoPrecio) {
        habitacion.setPrecio(nuevoPrecio);
    }

    public void agregarHabitacion(HabitacionComponent suite, HabitacionComponent habitacion) {
        suite.agregarHabitacion(habitacion);
    }

    public void removerHabitacion(HabitacionComponent suite, HabitacionComponent habitacion) {
        suite.removerHabitacion(habitacion);
    }

    public void gestionarReservas(Reserva reserva) {
        // Implementación de la lógica para gestionar reservas
        System.out.println("Gestionando reserva número: " + reserva.getIdReserva());
    }

    public void revisarHabitaciones(HabitacionComponent habitacion) {
        // Implementación de la lógica para revisar habitaciones
        System.out.println("Revisando habitación número: " + habitacion.getNumeroHabitacion());
    }
}
