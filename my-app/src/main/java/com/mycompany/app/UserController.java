package com.mycompany.app;

public abstract class UserController {
    protected String nombre;
    protected String apellido;
    protected String dni;
    protected String telefono;
    protected String email;
    protected String contacto;

    public UserController(String nombre, String apellido, String dni, String telefono, String email, String contacto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.email = email;
        this.contacto = contacto;
    }

    // Getters y Setters
}
