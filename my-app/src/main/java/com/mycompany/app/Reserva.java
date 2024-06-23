package com.mycompany.app;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
    private List<Extras> extras; // Añadido para la lista de extras

    public Reserva(int idReserva, Date fechaCheckin, Date fechaCheckout, Date fechaReserva, HabitacionComponent habitacion, Cliente cliente, List<Huesped> huespedes, FormaPago formaPago, List<PoliticaPrecios> politicas, List<Extras> extras) {
        this.idReserva = idReserva;
        this.fechaCheckin = fechaCheckin;
        this.fechaCheckout = fechaCheckout;
        this.fechaReserva = fechaReserva;
        this.habitacion = habitacion;
        this.cliente = cliente;
        this.huespedes = huespedes;
        this.formaPago = formaPago;
        this.politicas = politicas;
        this.extras = extras;
        this.estado = "pendiente de pago"; // Estado inicial de la reserva
    }

    public Reserva(Cliente cliente2, String string, String string2, String string3) {
        //TODO Auto-generated constructor stub
    }

    public long getDuracionEstancia() {
        long diffInMillies = Math.abs(fechaCheckout.getTime() - fechaCheckin.getTime());
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }

    // Métodos getters y setters
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

    public List<Extras> getExtras() {
        return extras;
    }

    public void setExtras(List<Extras> extras) {
        this.extras = extras;
    }
}