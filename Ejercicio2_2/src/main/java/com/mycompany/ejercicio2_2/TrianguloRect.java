package com.mycompany.ejercicio2_2;

public class TrianguloRect extends FiguraRecta {

    public TrianguloRect(int alto, int ancho) {
        this.alto = alto;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return (double) (base() * alto) / 2.0;
    }

    private int base() {
        return ancho;
    }

    @Override
    public double calcularPerimetro() {
        double hipotenusa = Math.sqrt(Math.pow(ancho, 2) + Math.pow(alto, 2));
        return ancho + alto + hipotenusa;
    }

    @Override
    public String imprimeFigura() {
        return super.imprimeFigura() + "\n" +
               String.format("Se imprime un Triangulo con alto: %d, ancho: %d, area: %.2f, perimetro: %.2f",
                             alto, ancho, calcularArea(), calcularPerimetro());
    }
}