package com.hotelmanagement;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Crear objetos necesarios para la reserva
        HabitacionComponent habitacion = new Habitacion(0, 0, null, null); // Suponiendo que Habitacion tiene un constructor por defecto
        Cliente cliente = new Cliente(null, null, null, null, null, null); // Suponiendo que Cliente tiene un constructor por defecto
        List<Huesped> huespedes = new ArrayList<>();
        List<PoliticaPrecios> politicasPrecios = new ArrayList<>();
        FormaPago formaPago = new PagoEfectivo(null); // Suponiendo un método de pago por defecto

        // Configurar la reserva
        Reserva reserva = new Reserva();
        reserva.idReserva = 1;
        reserva.fechaCheckin = Date.valueOf("2024-07-01");
        reserva.setFechaCheckout(Date.valueOf("2024-07-10"));
        reserva.setHabitacion(habitacion);
        reserva.setCliente(cliente);
        reserva.setHuespedes(huespedes);
        reserva.setMontoReserva(1000.0f);
        reserva.setEstado("pendiente");
        reserva.setPoliticasPrecios(politicasPrecios);
        reserva.setFormaPago(formaPago);

        // Imprimir detalles de la reserva
        System.out.println("Reserva creada con los siguientes detalles:");
        System.out.println("ID: " + reserva.idReserva);
        System.out.println("Check-in: " + reserva.fechaCheckin);
        System.out.println("Check-out: " + reserva.getFechaCheckout());
        System.out.println("Habitación: " + reserva.getHabitacion());
        System.out.println("Cliente: " + reserva.getCliente());
        System.out.println("Monto: " + reserva.getMontoReserva());
        System.out.println("Estado: " + reserva.getEstado());

        // Confirmar la reserva
        reserva.confirmarReserva();
        System.out.println("Estado después de confirmar: " + reserva.getEstado());

        // Cancelar la reserva
        reserva.cancelarReserva();
        System.out.println("Estado después de cancelar: " + reserva.getEstado());

        // Pagar la reserva
        reserva.pagarReserva();
        System.out.println("Estado después de pagar: " + reserva.getEstado());

        // Verificar disponibilidad
        boolean disponibilidad = reserva.verificarDisponibilidad();
        System.out.println("Disponibilidad de la habitación: " + disponibilidad);
    }
}
