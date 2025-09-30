package tpintro;

import java.util.Scanner;

public class Ejercicio9_ErrorEjemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine(); //  corregido

        System.out.println("Hola, " + nombre);
    }
 }

