package com.mycompany.app;

public class Cliente {
    private String nombre;
    private String email;
    private String telefono;
    private String apellido;

    public Cliente(String nombre,String apellido, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.apellido = apellido;

    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getApellido(){
        return apellido;
    }
}
