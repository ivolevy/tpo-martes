package com.mycompany.app;

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

    // Ajustamos el método quitarHabitacion para que coincida con la implementación esperada
    void quitarHabitacion(HabitacionComponent habitacionComponent);
}
