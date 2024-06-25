package com.mycompany.app;

import org.junit.Test;
import static org.junit.Assert.*;

public class PagoEfectivoTest {

    @Test
    public void testPagar() {
        PagoEfectivo pagoEfectivo = new PagoEfectivo();
        double monto = 100.0;
        
        java.io.ByteArrayOutputStream outContent = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(outContent));

        pagoEfectivo.pagar(monto);
        
        assertEquals("Pago realizado en efectivo: 100.0\n", outContent.toString());
    }
}
