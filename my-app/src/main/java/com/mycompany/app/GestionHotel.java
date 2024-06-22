package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class GestionHotel {
    private List<Cliente> clientes;
    private List<HabitacionComponent> habitaciones;
    private List<Reserva> reservas;

    public GestionHotel() {
        this.clientes = new ArrayList<>();
        this.habitaciones = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }

    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregarHabitacion(HabitacionComponent habitacion) {
        habitaciones.add(habitacion);
    }

    public void agregarReserva(Reserva reserva) {
        reservas.add(reserva);
    }
}
