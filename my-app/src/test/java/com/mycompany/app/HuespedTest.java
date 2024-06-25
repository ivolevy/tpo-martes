package com.mycompany.app;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class HuespedTest {

    private final java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
    private final java.io.PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new java.io.PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testSolicitarServicio() {
        Huesped huesped = new Huesped("Juan", "Perez", "12345678", "555-1234", "juan.perez@example.com", "555-4321");
        String servicio = "Room Service";

        huesped.solicitarServicio(servicio);
        
        assertEquals("Servicio solicitado: Room Service\n", outContent.toString());
    }
}
