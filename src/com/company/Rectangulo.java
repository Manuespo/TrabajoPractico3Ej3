package com.company;

public class Rectangulo extends Figura{
    private double alto;
    private double largo;

    public Rectangulo( double alto, double largo ,String color) {
        super(color);
        this.alto = alto;
        this.largo = largo;
    }

    public Rectangulo(double alto, double largo) {
        this.alto = alto;
        this.largo = largo;
    }

    @Override
    public double area() {
        return alto*largo;
    }

    @Override
    public double perimetro() {
        return 2*alto + 2*largo;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "color= '" + color + '\'' +
                ", alto= " + alto +
                ", largo= " + largo +
                ", Perimetro= " + perimetro() +
                ", Area= " + area() +
                '}';
    }
}
