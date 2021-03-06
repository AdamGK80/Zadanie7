package com.company;

public class Punkt {
    private double x, y;

    public Punkt(double nx, double ny) {
        x = nx;
        y = ny;
    }

    public Punkt(Punkt p) {
        x = p.x;
        y = p.y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public void setX(double nx) { x = nx; }
    public void setY(double ny) { y = ny; }

    public void przesun(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
