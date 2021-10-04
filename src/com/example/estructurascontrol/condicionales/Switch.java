package com.example.estructurascontrol.condicionales;

public class Switch {

    public static void main(String[] args) {

        String dia = "Viernes";

        switch(dia){
            case "Lunes":
                System.out.println("Hoy es Lunes! Ánimo!");
                break;
            case "Martes":
                System.out.println("Hoy es Martes! Ánimo!");
                break;
            case "Miercoles":
                System.out.println("Hoy es Miercoles! Ánimo!");
                break;
            case "Jueves":
                System.out.println("Hoy es Jueves! Ánimo!");
                break;
            case "Viernes":
                System.out.println("Hoy es Viernes! Ánimo!");
                break;
            case "Sabado":
                System.out.println("Hoy es Sabado! Ánimo!");
                break;
            case "Domingo":
                System.out.println("Hoy es Domingo! Ánimo!");
                break;
            default:
                System.out.println("No es un día válido");
        }

    }
}
