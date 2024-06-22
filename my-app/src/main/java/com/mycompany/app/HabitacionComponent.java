package com.hotelmanagement;

import java.util.List;

public interface HabitacionComponent {
    int getNumeroHabitacion();
    int getCapacidad();
    String getTipoHabitacion();
    List<Extras> getExtras();

    double obtenerPrecio();
    String obtenerDescripcion();
    void agregarHabitacion(HabitacionComponent habitacionComponent);
    void removerHabitacion(HabitacionComponent habitacionComponent);
    void actualizarDisponibilidad(boolean disponible);
}

