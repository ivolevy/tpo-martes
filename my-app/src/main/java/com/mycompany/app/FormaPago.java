package com.mycompany.app;

import java.util.List;

public abstract class FormaPago {
    @SuppressWarnings("unused")
    private List<String> extras;

    public FormaPago(List<String> extras) {
        this.extras = extras;
    }

    public abstract void pagar(float monto);

    // Getters y Setters
}

