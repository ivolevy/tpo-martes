package com.mycompany.app;

public class Gerente {

    private String nombre;
    private String identificacion;

    public Gerente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String autorizarOperacion() {
        return "Operación autorizada";
    }
}