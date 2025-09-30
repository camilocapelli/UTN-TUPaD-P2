package tpintro;

import java.util.Scanner;

public class Ejercicio5_Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese primer entero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese segundo entero: ");
        int b = sc.nextInt();

        // Operaciones 
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicación: " + (a * b));

        // División 
        double division = (double) a / b;
        System.out.printf("División: %.2f%n", division);

        sc.close();
    }
}
