package com.company;

public abstract class Figura {
    protected String color;

    public Figura(String color) {
        this.color = color;
    }

    public Figura() {
    }

    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "Figura{" +
                "color='" + color + '\'' +
                '}';
    }
}
