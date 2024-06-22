package com.mycompany.app;

public class Gerente extends UserController {
    public Gerente(String nombre, String apellido, String dni, String telefono, String email, String contacto) {
        super(nombre, apellido, dni, telefono, email, contacto);
    }

    public void crearHabitacion(HabitacionComponent habitacion) {
        GestionHotel.getInstance().agregarHabitacion(habitacion);
    }

    public void eliminarHabitacion(HabitacionComponent habitacion) {
        GestionHotel.getInstance().eliminarHabitacion(habitacion);
    }

    public void actualizarDisponibilidad(HabitacionComponent habitacion, boolean disponible) {
        habitacion.setDisponible(disponible);
    }

    public void cancelarReserva(Reserva reserva) {
        reserva.setEstado("cancelada");
        reserva.getHabitacion().actualizarDisponibilidad(reserva.getFechaCheckIn(), reserva.getFechaCheckIn(), true);
    }

    public void actualizarPrecioPolitica(PoliticaPrecios politica, float porcentaje) {
        politica.setPorcentaje(porcentaje);
    }
}
