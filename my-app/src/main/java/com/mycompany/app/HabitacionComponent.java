package com.mycompany.app;

import java.util.Date;
import java.util.List;

public interface HabitacionComponent {
    int getNumeroHabitacion();
    int getCapacidad();
    String getTipo();
    List<String> getExtras();
    float obtenerPrecio();
    void agregarHabitacion(HabitacionComponent habitacion);
    void removerHabitacion(HabitacionComponent habitacion);
    boolean verificarDisponibilidad(Date fechaCheckIn, Date fechaCheckOut);
    void actualizarDisponibilidad(Date fechaCheckIn, Date fechaCheckOut, boolean disponible);
    void setDisponible(boolean disponible);
}
