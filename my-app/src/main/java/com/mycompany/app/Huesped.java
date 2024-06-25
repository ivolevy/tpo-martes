package com.mycompany.app;

public class Huesped extends UserController {
    public Huesped(String nombre, String apellido, String dni, String telefono, String email, String contacto) {
        super(nombre, apellido, dni, telefono, email, contacto);
    }

    public void solicitarServicio(String servicio) {
        System.out.println("Servicio solicitado: " + servicio);
    }
}