package com.mycompany.app;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class GerenteTest {

    private Gerente gerente;

    @Before
    public void setUp() {
        gerente = new Gerente("Carlos", "ID123");
        System.out.println("Gerente creado para pruebas: " + gerente);
    }

    @Test
    public void testGetNombre() {
        System.out.println("Ejecutando testGetNombre...");

        // Datos de prueba
        String nombreEsperado = "Carlos";

        // Ejecución de la prueba
        String nombreObtenido = gerente.getNombre();

        // Imprimir datos de prueba y resultado esperado
        System.out.println("Nombre esperado: " + nombreEsperado);
        System.out.println("Nombre obtenido: " + nombreObtenido);

        // Aserción
        assertEquals(nombreEsperado, nombreObtenido);
    }
@Test
    public void testSetNombre() {
        System.out.println("Ejecutando testSetNombre...");

        // Datos de prueba
        String nuevoNombre = "Ana";
        gerente.setNombre(nuevoNombre);

        // Ejecución de la prueba
        String nombreObtenido = gerente.getNombre();

        // Imprimir datos de prueba y resultado esperado
        System.out.println("Nuevo nombre esperado: " + nuevoNombre);
        System.out.println("Nombre obtenido: " + nombreObtenido);

        // Aserción
        assertEquals(nuevoNombre, nombreObtenido);
    }

    @Test
    public void testGetIdentificacion() {
        System.out.println("Ejecutando testGetIdentificacion...");

        // Datos de prueba
        String identificacionEsperada = "ID123";

        // Ejecución de la prueba
        String identificacionObtenida = gerente.getIdentificacion();

        // Imprimir datos de prueba y resultado esperado
        System.out.println("Identificación esperada: " + identificacionEsperada);
        System.out.println("Identificación obtenida: " + identificacionObtenida);

        // Aserción
        assertEquals(identificacionEsperada, identificacionObtenida);
    }

    @Test
    public void testSetIdentificacion() {
        System.out.println("Ejecutando testSetIdentificacion...");

        // Datos de prueba
        String nuevaIdentificacion = "ID456";
        gerente.setIdentificacion(nuevaIdentificacion);
// Ejecución de la prueba
        String identificacionObtenida = gerente.getIdentificacion();

        // Imprimir datos de prueba y resultado esperado
        System.out.println("Nueva identificación esperada: " + nuevaIdentificacion);
        System.out.println("Identificación obtenida: " + identificacionObtenida);

        // Aserción
        assertEquals(nuevaIdentificacion, identificacionObtenida);
    }

    @Test
    public void testAutorizarOperacion() {
        System.out.println("Ejecutando testAutorizarOperacion...");

        // Datos de prueba
        String resultadoEsperado = "Operación autorizada";

        // Ejecución de la prueba
        String resultadoObtenido = gerente.autorizarOperacion();

        // Imprimir datos de prueba y resultado esperado
        System.out.println("Resultado esperado: " + resultadoEsperado);
        System.out.println("Resultado obtenido: " + resultadoObtenido);

        // Aserción
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}