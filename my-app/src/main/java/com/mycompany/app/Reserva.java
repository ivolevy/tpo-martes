package com.mycompany.app;

import java.sql.Date;
import java.util.List;

public class Reserva {
    int idReserva;
    Date fechaCheckin;
    private Date fechaCheckout;
    private HabitacionComponent habitacion;
    private Cliente cliente;
    private List<Huesped> huespedes;
    private float montoReserva;
    private String estado;
    private List<PoliticaPrecios> politicasPrecios;
    private FormaPago formaPago;

    public void confirmarReserva() {
        // Lógica para confirmar reserva
    }

    public FormaPago getFormaPago() {
        return formaPago;
        
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
        
    }

    public List<PoliticaPrecios> getPoliticasPrecios() {
        return politicasPrecios;
        
    }

    public void setPoliticasPrecios(List<PoliticaPrecios> politicasPrecios) {
        this.politicasPrecios = politicasPrecios;
        
    }

    public String getEstado() {
        return estado;
        
    }

    public void setEstado(String estado) {
        this.estado = estado;
        
    }

    public float getMontoReserva() {
        return montoReserva;
        
    }

    public void setMontoReserva(float montoReserva) {
        this.montoReserva = montoReserva;
        
    }

    public List<Huesped> getHuespedes() {
        return huespedes;
        
    }

    public void setHuespedes(List<Huesped> huespedes) {
        this.huespedes = huespedes;
        
    }

    public Cliente getCliente() {
        return cliente;
        
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        
    }

    public HabitacionComponent getHabitacion() {
        return habitacion;
        
    }

    public void setHabitacion(HabitacionComponent habitacion) {
        this.habitacion = habitacion;
        
    }

    public Date getFechaCheckout() {
        return fechaCheckout;
        
    }

    public void setFechaCheckout(Date fechaCheckout) {
        this.fechaCheckout = fechaCheckout;
        
    }

    public void cancelarReserva() {
        // Lógica para cancelar reserva
    }

    public void pagarReserva() {
        // Lógica para pagar reserva
    }

    public boolean verificarDisponibilidad() {
        // Lógica para verificar disponibilidad
        return false;
    }

    public void setIdReserva(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setIdReserva'");
    }

    public void setFechaCheckin(Date valueOf) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFechaCheckin'");
    }

    public String getIdReserva() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getIdReserva'");
    }

    public String getFechaCheckin() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFechaCheckin'");
    }
}
