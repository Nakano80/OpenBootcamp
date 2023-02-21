package com.openbootcamp;

public class Tema2 {
    public static void main(String[] args) {
        double precioIva=getPrecioIva( 200);
        System.out.println("El precio mas IVA es: $"+precioIva);
    }

    private static double getPrecioIva(double valor) {
        return valor*3.88;
    }
}
