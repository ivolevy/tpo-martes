package com.mycompany.app;

import java.util.Date;
import java.util.List;

public class Reserva {
    @SuppressWarnings("unused")
    private int idReserva;
    private Date fechaCheckIn;
    private Date fechaCheckOut;
    private HabitacionComponent habitacion;
    @SuppressWarnings("unused")
    private Cliente cliente;
    @SuppressWarnings({ "unused" })
    private List<Huesped> huespedes;
    @SuppressWarnings("unused")
    private FormaPago formaPago;
    @SuppressWarnings("unused")
    private String estado;

    public Reserva(Date fechaCheckIn, Date fechaCheckOut, HabitacionComponent habitacion, Cliente cliente, 
                   List<Huesped> huespedes, FormaPago formaPago) {
        this.fechaCheckIn = fechaCheckIn;
        this.fechaCheckOut = fechaCheckOut;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.huespedes = huespedes;
        this.formaPago = formaPago;
        this.estado = "pendiente de pago";
    }

    public void confirmarReserva() {
        this.estado = "pagada";
    }

    public void cancelarReserva() {
        this.estado = "cancelada";
        habitacion.actualizarDisponibilidad(fechaCheckIn, fechaCheckOut, true);
    }

    public void verificarDisponibilidad() {
        habitacion.verificarDisponibilidad(fechaCheckIn, fechaCheckOut);
    }

    public String getEstado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEstado'");
    }

    public void setEstado(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEstado'");
    }

    public HabitacionComponent getHabitacion() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHabitacion'");
    }

    public Date getFechaCheckIn() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFechaCheckIn'");
    }

    // Getters y Setters
}
