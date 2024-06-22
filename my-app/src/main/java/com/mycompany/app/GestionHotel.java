package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class GestionHotel {
    private static GestionHotel instance;
    private List<HabitacionComponent> habitaciones;
    private List<Reserva> reservas;
    private List<Factura> facturas;
    private List<PoliticaPrecios> politicas;

    private GestionHotel() {
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
        this.facturas = new ArrayList<>();
        this.politicas = new ArrayList<>();
    }

    public static GestionHotel getInstance() {
        if (instance == null) {
            instance = new GestionHotel();
        }
        return instance;
    }

    public void agregarHabitacion(HabitacionComponent habitacion) {
        habitaciones.add(habitacion);
    }

    public void eliminarHabitacion(HabitacionComponent habitacion) {
        habitaciones.remove(habitacion);
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void eliminarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public void agregarFactura(Factura factura) {
        facturas.add(factura);
    }

    public void agregarPolitica(PoliticaPrecios politica) {
        politicas.add(politica);
    }

    public void generarReporteHabitaciones() {
        for (HabitacionComponent habitacion : habitaciones) {
            System.out.println("Habitación " + habitacion.getNumeroHabitacion() + ": " + (habitacion.verificarDisponibilidad(null, null) ? "Disponible" : "Ocupada"));
        }
    }

    // Getters y Setters
}
