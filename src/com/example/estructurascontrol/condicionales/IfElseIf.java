package com.example.estructurascontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Domingo";

        // ejemplos comprarar
        boolean resultadoComprararNum = 5 == 5;
        boolean resultado = dia.equals("Martes");

        // if else if

        if (dia.equals("Lunes")) {
            System.out.println("Animo con la semana campeón!");

        } else if (dia.equals("Martes")) {
            System.out.println("Martes con M de Me besas");

        } else if (dia.equals("Miercoles")) {
            System.out.println("Estoy en medio");

        } else if (dia.equals("Jueves")) {
            System.out.println("Ya es juernes");

        } else if (dia.equals("Viernes")) {
            System.out.println("Esta noche toca fiesta");

        } else if (dia.equals("Sabado")) {
            System.out.println("Feliz sábado");

        } else if (dia.equals("Domingo")) {
            System.out.println("Día del señor");
        } else {
            System.out.println("El día introducido no es un día válido.");
        }
    }
}
