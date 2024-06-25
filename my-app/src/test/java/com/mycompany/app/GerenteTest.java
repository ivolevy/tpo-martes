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

        String nombreEsperado = "Carlos";

        String nombreObtenido = gerente.getNombre();

        System.out.println("Nombre esperado: " + nombreEsperado);
        System.out.println("Nombre obtenido: " + nombreObtenido);

        assertEquals(nombreEsperado, nombreObtenido);
    }
@Test
    public void testSetNombre() {
        System.out.println("Ejecutando testSetNombre...");

        String nuevoNombre = "Ana";
        gerente.setNombre(nuevoNombre);

        String nombreObtenido = gerente.getNombre();

        System.out.println("Nuevo nombre esperado: " + nuevoNombre);
        System.out.println("Nombre obtenido: " + nombreObtenido);

        assertEquals(nuevoNombre, nombreObtenido);
    }

    @Test
    public void testGetIdentificacion() {
        System.out.println("Ejecutando testGetIdentificacion...");

        String identificacionEsperada = "ID123";

        String identificacionObtenida = gerente.getIdentificacion();

        System.out.println("Identificación esperada: " + identificacionEsperada);
        System.out.println("Identificación obtenida: " + identificacionObtenida);

        assertEquals(identificacionEsperada, identificacionObtenida);
    }

    @Test
    public void testSetIdentificacion() {
        System.out.println("Ejecutando testSetIdentificacion...");

        String nuevaIdentificacion = "ID456";
        gerente.setIdentificacion(nuevaIdentificacion);
        String identificacionObtenida = gerente.getIdentificacion();

        System.out.println("Nueva identificación esperada: " + nuevaIdentificacion);
        System.out.println("Identificación obtenida: " + identificacionObtenida);

        assertEquals(nuevaIdentificacion, identificacionObtenida);
    }

    @Test
    public void testAutorizarOperacion() {
        System.out.println("Ejecutando testAutorizarOperacion...");

        String resultadoEsperado = "Operación autorizada";

        String resultadoObtenido = gerente.autorizarOperacion();

        System.out.println("Resultado esperado: " + resultadoEsperado);
        System.out.println("Resultado obtenido: " + resultadoObtenido);

        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}