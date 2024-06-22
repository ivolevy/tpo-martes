package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente cliente;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente(null, null, null, null, null, null);
    }

    @Test
    public void testSetAndGetNombre() {
        cliente.setNombre("Juan");
        assertEquals("Juan", cliente.getNombre());
    }

    @Test
    public void testSetAndGetApellido() {
        cliente.setApellido("Perez");
        assertEquals("Perez", cliente.getApellido());
    }

    @Test
    public void testSetAndGetDni() {
        cliente.setDni("12345678");
        assertEquals("12345678", cliente.getDni());
    }

    @Test
    public void testSetAndGetTelefono() {
        cliente.setTelefono("555-1234");
        assertEquals("555-1234", cliente.getTelefono());
    }

    @Test
    public void testSetAndGetEmail() {
        cliente.setEmail("juan.perez@example.com");
        assertEquals("juan.perez@example.com", cliente.getEmail());
    }

    @Test
    public void testSetAndGetContacto() {
        cliente.setContacto("WhatsApp");
        assertEquals("WhatsApp", cliente.getContacto());
    }
}
