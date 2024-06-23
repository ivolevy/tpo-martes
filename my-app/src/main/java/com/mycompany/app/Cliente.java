package com.mycompany.app;

import java.util.Date;

public class Cliente {

    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String preferenciaContacto;
    private PoliticaPrecios politicaPrecios;

    public Cliente(String nombre, String apellido, String dni, String email, String preferenciaContacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.email = email;
        this.preferenciaContacto = preferenciaContacto;
        this.politicaPrecios = new PoliticaPrecios();
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getPreferenciaContacto() {
        return preferenciaContacto;
    }

    public double obtenerDescuento(Date fechaReserva, Date fechaCheckIn) {
        return politicaPrecios.calcularDescuento(fechaReserva, fechaCheckIn);
    }
}
