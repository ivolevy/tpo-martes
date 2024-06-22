package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ReservaTest {

    private Reserva reserva;
    private Cliente cliente;
    private HabitacionComponent habitacion;
    private List<Huesped> huespedes;
    private List<PoliticaPrecios> politicasPrecios;
    private FormaPago formaPago;

    @BeforeEach
    public void setUp() {
        cliente = new Cliente(null, null, null, null, null, null);
        habitacion = new HabitacionComponent() {
            // Implementación anónima para la prueba
            @Override
            public void agregarHabitacion(HabitacionComponent habitacion) {}
            @Override
            public String obtenerDescripcion() { return null; }
            @Override
            public double obtenerPrecio() { return 0; }
            @Override
            public int getNumeroHabitacion() {
                throw new UnsupportedOperationException("Unimplemented method 'getNumeroHabitacion'");
            }
            @Override
            public int getCapacidad() {
                throw new UnsupportedOperationException("Unimplemented method 'getCapacidad'");
            }
            @Override
            public String getTipoHabitacion() {
                throw new UnsupportedOperationException("Unimplemented method 'getTipoHabitacion'");
            }
            @Override
            public List<Extras> getExtras() {
                throw new UnsupportedOperationException("Unimplemented method 'getExtras'");
            }
            @Override
            public void removerHabitacion(HabitacionComponent habitacionComponent) {
                throw new UnsupportedOperationException("Unimplemented method 'removerHabitacion'");
            }
            @Override
            public void actualizarDisponibilidad(boolean disponible) {
                throw new UnsupportedOperationException("Unimplemented method 'actualizarDisponibilidad'");
            }
            @Override
            public void quitarHabitacion(HabitacionComponent habitacionComponent) {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'quitarHabitacion'");
            }
        };
        huespedes = new ArrayList<>();
        politicasPrecios = new ArrayList<>();
        formaPago = new PagoEfectivo(null); // Utilizando PagoEfectivo como método de pago
        reserva = new Reserva();
        reserva.setCliente(cliente);
        reserva.setHabitacion(habitacion);
        reserva.setHuespedes(huespedes);
        reserva.setPoliticasPrecios(politicasPrecios);
        reserva.setFormaPago(formaPago);
    }

    @Test
    public void testSetAndGetIdReserva() {
        reserva.setIdReserva(1);
        assertEquals(1, reserva.getIdReserva());
    }

    @Test
    public void testSetAndGetFechaCheckin() {
        Date fechaCheckin = new Date(System.currentTimeMillis());
        reserva.setFechaCheckin(fechaCheckin);
        assertEquals(fechaCheckin, reserva.getFechaCheckin());
    }

    @Test
    public void testSetAndGetFechaCheckout() {
        Date fechaCheckout = new Date(System.currentTimeMillis());
        reserva.setFechaCheckout(fechaCheckout);
        assertEquals(fechaCheckout, reserva.getFechaCheckout());
    }

    @Test
    public void testSetAndGetCliente() {
        Cliente cliente = new Cliente(null, null, null, null, null, null);
        reserva.setCliente(cliente);
        assertEquals(cliente, reserva.getCliente());
    }

    @Test
    public void testSetAndGetHuespedes() {
        List<Huesped> huespedes = new ArrayList<>();
        reserva.setHuespedes(huespedes);
        assertEquals(huespedes, reserva.getHuespedes());
    }

    @Test
    public void testSetAndGetHabitacion() {
        HabitacionComponent habitacion = new HabitacionComponent() {
            @Override
            public void agregarHabitacion(HabitacionComponent habitacion) {}
            @Override
            public void quitarHabitacion(HabitacionComponent habitacion) {}
            @Override
            public String obtenerDescripcion() { return null; }
            @Override
            public double obtenerPrecio() { return 0; }
            @Override
            public int getNumeroHabitacion() {
                throw new UnsupportedOperationException("Unimplemented method 'getNumeroHabitacion'");
            }
            @Override
            public int getCapacidad() {
                throw new UnsupportedOperationException("Unimplemented method 'getCapacidad'");
            }
            @Override
            public String getTipoHabitacion() {
                throw new UnsupportedOperationException("Unimplemented method 'getTipoHabitacion'");
            }
            @Override
            public List<Extras> getExtras() {
                throw new UnsupportedOperationException("Unimplemented method 'getExtras'");
            }
            @Override
            public void removerHabitacion(HabitacionComponent habitacionComponent) {
                throw new UnsupportedOperationException("Unimplemented method 'removerHabitacion'");
            }
            @Override
            public void actualizarDisponibilidad(boolean disponible) {
                throw new UnsupportedOperationException("Unimplemented method 'actualizarDisponibilidad'");
            }
        };
        reserva.setHabitacion(habitacion);
        assertEquals(habitacion, reserva.getHabitacion());
    }

    @Test
    public void testSetAndGetMontoReserva() {
        reserva.setMontoReserva(1000.0f);
        assertEquals(1000.0f, reserva.getMontoReserva());
    }

    @Test
    public void testSetAndGetEstado() {
        reserva.setEstado("Pendiente");
        assertEquals("Pendiente", reserva.getEstado());
    }

    @Test
    public void testSetAndGetFormaPago() {
        reserva.setFormaPago(formaPago);
        assertEquals(formaPago, reserva.getFormaPago());
    }

    @Test
    public void testSetAndGetPoliticasPrecios() {
        List<PoliticaPrecios> politicasPrecios = new ArrayList<>();
        reserva.setPoliticasPrecios(politicasPrecios);
        assertEquals(politicasPrecios, reserva.getPoliticasPrecios());
    }

    @Test
    public void testConfirmarReserva() {
        reserva.confirmarReserva();
        assertEquals("Confirmada", reserva.getEstado());
    }

    @Test
    public void testCancelarReserva() {
        reserva.cancelarReserva();
        assertEquals("Cancelada", reserva.getEstado());
    }
}
