package com.mycompany.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GestionHotel {
    private List<Habitacion> habitaciones;
    private List<Cliente> clientes;
    private List<Reserva> reservas;

    public GestionHotel() {
        this.habitaciones = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public void eliminarHabitacion(Habitacion habitacion) {
        habitaciones.remove(habitacion);
    }

    public Habitacion buscarHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumeroHabitacion() == numero) {
                return habitacion;
            }
        }
        return null;
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente buscarCliente(String email) {
        for (Cliente cliente : clientes) {
            if (cliente.getEmail().equals(email)) {
                return cliente;
            }
        }
        return null;
    }

    public void realizarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void cancelarReserva(Reserva reserva) {
        reservas.remove(reserva);
    }

    public List<Reserva> obtenerReservas() {
        return reservas;
    }

    public boolean verificarDisponibilidad(Habitacion habitacion, Date fechaInicio, Date fechaFin) {
        for (Reserva reserva : reservas) {
            if (reserva.getHabitacion().equals(habitacion) && reserva.seSolapan(fechaInicio, fechaFin)) {
                return false;
            }
        }
        return true;
    }

    public void generarEstadoHabitaciones() {
        for (Habitacion habitacion : habitaciones) {
            System.out.println("Habitación " + habitacion.getNumeroHabitacion() + " - Precio: " + habitacion.getPrecio());
            for (Reserva reserva : reservas) {
                if (reserva.getHabitacion().equals(habitacion)) {
                    System.out.println("Reservada del " + reserva.getFechaInicio() + " al " + reserva.getFechaFin());
                }
            }
        }
    }
}
