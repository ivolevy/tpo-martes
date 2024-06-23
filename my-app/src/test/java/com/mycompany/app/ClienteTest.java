package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

public class ClienteTest {

    private Cliente cliente;

    @Before
    public void setUp() {
        cliente = new Cliente("Juan", "Perez", "12345678", "juan.perez@example.com", "SMS");
        System.out.println("Cliente creado para pruebas: " + cliente);
    }

    @Test
    public void testGetNombreCompleto() {
        System.out.println("Ejecutando testGetNombreCompleto...");
        
        // Datos de prueba
        String resultadoEsperado = "Juan Perez";
        
        // Ejecución de la prueba
        String resultadoObtenido = cliente.getNombreCompleto();
        
        // Imprimir datos de prueba y resultado esperado
        System.out.println("Nombre completo esperado: " + resultadoEsperado);
        System.out.println("Nombre completo obtenido: " + resultadoObtenido);
        
        // Aserción
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testPreferenciaContacto() {
        System.out.println("Ejecutando testPreferenciaContacto...");
        
        // Datos de prueba
        String resultadoEsperado = "SMS";
        
        // Ejecución de la prueba
        String resultadoObtenido = cliente.getPreferenciaContacto();
        
        // Imprimir datos de prueba y resultado esperado
        System.out.println("Preferencia de contacto esperada: " + resultadoEsperado);
        System.out.println("Preferencia de contacto obtenida: " + resultadoObtenido);
        
        // Aserción
        assertEquals(resultadoEsperado, resultadoObtenido);
    }

    @Test
    public void testObtenerDescuento() {
        System.out.println("Ejecutando testObtenerDescuento...");
        
        // Datos de prueba
        Calendar cal = Calendar.getInstance();
        Date fechaReserva = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, 10);
        Date fechaCheckIn = cal.getTime();
        double descuentoEsperado = 0.15; // 15% de descuento por defecto
        
        // Ejecución de la prueba
        double descuentoObtenido = cliente.obtenerDescuento(fechaReserva, fechaCheckIn);
        
        // Imprimir datos de prueba y resultado esperado
        System.out.println("Fecha de reserva: " + fechaReserva);
        System.out.println("Fecha de check-in: " + fechaCheckIn);
        System.out.println("Descuento esperado: " + descuentoEsperado);
        System.out.println("Descuento obtenido: " + descuentoObtenido);
        
        // Aserción
        assertEquals(descuentoEsperado, descuentoObtenido, 0.01);
    }

    @Test
    public void testObtenerAumento() {
        System.out.println("Ejecutando testObtenerAumento...");
        
        // Datos de prueba
        Calendar cal = Calendar.getInstance();
        Date fechaReserva = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, 70);
        Date fechaCheckIn = cal.getTime();
        double aumentoEsperado = 0.20; // 20% de aumento por defecto
        
        // Ejecución de la prueba
        double aumentoObtenido = cliente.obtenerDescuento(fechaReserva, fechaCheckIn);
        
        // Imprimir datos de prueba y resultado esperado
        System.out.println("Fecha de reserva: " + fechaReserva);
        System.out.println("Fecha de check-in: " + fechaCheckIn);
        System.out.println("Aumento esperado: " + aumentoEsperado);
        System.out.println("Aumento obtenido: " + aumentoObtenido);
        
        // Aserción
        assertEquals(aumentoEsperado, aumentoObtenido, 0.01);
    }

    @Test
    public void testSinCambioEnPrecio() {
        System.out.println("Ejecutando testSinCambioEnPrecio...");
        
        // Datos de prueba
        Calendar cal = Calendar.getInstance();
        Date fechaReserva = cal.getTime();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date fechaCheckIn = cal.getTime();
        double sinCambioEsperado = 0.0; // Sin cambios
        
        // Ejecución de la prueba
        double resultadoObtenido = cliente.obtenerDescuento(fechaReserva, fechaCheckIn);
        
        // Imprimir datos de prueba y resultado esperado
        System.out.println("Fecha de reserva: " + fechaReserva);
        System.out.println("Fecha de check-in: " + fechaCheckIn);
        System.out.println("Resultado esperado: " + sinCambioEsperado);
        System.out.println("Resultado obtenido: " + resultadoObtenido);
        
        // Aserción
        assertEquals(sinCambioEsperado, resultadoObtenido, 0.01);
    }
}
