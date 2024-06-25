package com.mycompany.app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
    private Habitacion habitacion;
    private Cliente cliente;
    private Date fechaInicio;
    private Date fechaFin;

    public Reserva(Habitacion habitacion, Cliente cliente, String fechaInicio, String fechaFin) {
        this.habitacion = habitacion;
        this.cliente = cliente;
        try {
            this.fechaInicio = new SimpleDateFormat("dd/MM/yyyy").parse(fechaInicio);
            this.fechaFin = new SimpleDateFormat("dd/MM/yyyy").parse(fechaFin);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public boolean seSolapan(Date otraFechaInicio, Date otraFechaFin) {
        return (fechaInicio.before(otraFechaFin) && fechaFin.after(otraFechaInicio));
    }
}
