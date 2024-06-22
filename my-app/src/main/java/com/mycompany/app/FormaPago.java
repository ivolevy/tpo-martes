package com.mycompany.app;

public abstract class FormaPago {
    private Extras extras;

    public FormaPago(Extras extras) {
        this.extras = extras;
    }

    public abstract void pagar(double monto);

    public Extras getExtras() {
        return extras;
    }
}
