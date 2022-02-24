package com.company;

public abstract class Figura {
    protected Punkt polozenie;

    protected Figura(Punkt p) {
        polozenie = new Punkt(p);
    }

    public abstract double pole();

    public abstract void powieksz(double ile);

    public void przesun(double dx, double dy) {
        polozenie.przesun(dx, dy);
    }

    public String toString() {
        return " @ " + polozenie;
    }
}
