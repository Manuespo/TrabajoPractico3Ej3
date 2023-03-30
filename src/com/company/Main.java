package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figura> figuras=new ArrayList<Figura>();
        figuras.add(new Circulo(2,"Rojo"));
        figuras.add(new Rectangulo(5,4,"Verde"));
        figuras.add(new Circulo(2));
        figuras.add(new Circulo(3,"Amarillo"));
        figuras.add(new Rectangulo(2,3));
        System.out.println(figuras);

    }
}
