package com.mycompany.app;

import java.util.ArrayList;
import java.util.List;

public class Contabilidad {

    private List<Double> ingresos;
    private List<Double> gastos;

    public Contabilidad() {
        this.ingresos = new ArrayList<>();
        this.gastos = new ArrayList<>();
    }

    public void registrarIngreso(double monto) {
        ingresos.add(monto);
    }

    public void registrarGasto(double monto) {
        gastos.add(monto);
    }

    public double calcularIngresos() {
        double totalIngresos = 0;
        for (double ingreso : ingresos) {
            totalIngresos += ingreso;
        }
        return totalIngresos;
    }

    public double calcularGastos() {
        double totalGastos = 0;
        for (double gasto : gastos) {
            totalGastos += gasto;
        }
        return totalGastos;
    }
}
