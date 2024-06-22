package com.mycompany.app;

import java.util.List;

public interface HabitacionComponent {
    int getNumeroHabitacion();
    int getCapacidad();
    String getTipoHabitacion();
    double obtenerPrecio();
    String obtenerDescripcion();
    void actualizarDisponibilidad(boolean disponibilidad);
    void agregarHabitacion(HabitacionComponent habitacionComponent);
    void removerHabitacion(HabitacionComponent habitacionComponent);
    List<HabitacionComponent> getHabitaciones();
    void setPrecio(double nuevoPrecio);
}
