package com.mycompany.app;

import java.util.Date;
import java.util.List;

public class Reserva {
    private int idReserva;
    private Date fechaCheckin;
    private Date fechaCheckout;
    private Date fechaReserva;
    private HabitacionComponent habitacion;
    private Cliente cliente;
    private List<Huesped> huespedes;
    private FormaPago formaPago;
    private double monto;
    private String estado;
    private List<PoliticaPrecios> politicas;

    public Reserva(int idReserva, Date fechaReserva, Date fechaCheckin, Date fechaCheckout, HabitacionComponent habitacion, Cliente cliente, List<Huesped> huespedes, FormaPago formaPago, double monto, String estado, List<PoliticaPrecios> politicas) {
        this.idReserva = idReserva;
        this.fechaReserva = fechaReserva;
        this.fechaCheckin = fechaCheckin;
        this.fechaCheckout = fechaCheckout;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.huespedes = huespedes;
        this.formaPago = formaPago;
        this.monto = monto;
        this.estado = estado;
        this.politicas = politicas;
    }

    // Getters y setters

    public Reserva(int i, Date date, Date date2, HabitacionComponent habitacion2, Cliente cliente2,
            List<Huesped> huespedes2, FormaPago pago, double d, String string, List<Object> asList) {
        //TODO Auto-generated constructor stub
    }

    public Reserva(Cliente cliente2, Habitacion habitacion2, java.sql.Date date, java.sql.Date date2, String string) {
        //TODO Auto-generated constructor stub
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Date getFechaCheckin() {
        return fechaCheckin;
    }

    public void setFechaCheckin(Date fechaCheckin) {
        this.fechaCheckin = fechaCheckin;
    }

    public Date getFechaCheckout() {
        return fechaCheckout;
    }

    public void setFechaCheckout(Date fechaCheckout) {
        this.fechaCheckout = fechaCheckout;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public HabitacionComponent getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(HabitacionComponent habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<Huesped> getHuespedes() {
        return huespedes;
    }

    public void setHuespedes(List<Huesped> huespedes) {
        this.huespedes = huespedes;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<PoliticaPrecios> getPoliticas() {
        return politicas;
    }

    public void setPoliticas(List<PoliticaPrecios> politicas) {
        this.politicas = politicas;
    }
}
