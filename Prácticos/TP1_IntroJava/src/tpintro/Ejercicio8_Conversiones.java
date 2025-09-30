package tpintro;

import java.util.Scanner;

public class Ejercicio8_Conversiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        int b = sc.nextInt();

        // División entera
        int divisionEntera = a / b;
        System.out.println("División entera: " + divisionEntera);

        // División con decimales (casting a double)
        double divisionDouble = (double) a / b;
        System.out.printf("División con decimales: %.2f%n", divisionDouble);

        sc.close();
    }
}
