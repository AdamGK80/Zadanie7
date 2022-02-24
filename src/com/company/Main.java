package com.company;

public class Main {

    /*
     * Zadania:
     * 1. Dodaj nowa klase dziedziczaca z klasy Figura, reprezentujaca np. romb, ktora
     * posiada atrybuty a (dlugosc boku) oraz h (wysokosc) oraz uzyj jej w programie
     * tak samo jak mialo to miejsce w przypadku klas Kolo i Prostokat. Pole rombu = a*h.
     */

    public static void main(String[] args) {
        Prostokat p1 = new Prostokat(new Punkt(1, 2), 3 , 4);
        Prostokat p2 = new Prostokat(new Punkt(2, 1), 4 , 3);
        Kolo k1 = new Kolo(new Punkt(0, 0), 3);
        Kolo k2 = new Kolo(new Punkt(5, 5), 2);
        Romb r1 = new Romb(new Punkt(10, 10), 2, 5);
        Romb r2 = new Romb(new Punkt(15, 15), 5,10);

        Model m = new Model();
        m.dodaj(p1);
        m.dodaj(p2);
        m.dodaj(k1);
        m.dodaj(k2);
        m.dodaj(r1);
        m.dodaj(r2);

        System.out.println(m);

        m.powieksz(2.5);

        System.out.println(m);
    }
}
