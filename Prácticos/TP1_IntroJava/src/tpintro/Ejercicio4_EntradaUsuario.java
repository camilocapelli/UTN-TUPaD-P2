package tpintro;

import java.util.Scanner; // Importación necesaria para usar Scanner

public class Ejercicio4_EntradaUsuario {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer desde teclado
        Scanner sc = new Scanner(System.in);

        // Leer nombre
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        // Leer edad (forma robusta: leer String y convertir a int)
        System.out.print("Ingrese su edad: ");
        String edadTexto = sc.nextLine();
        int edad = Integer.parseInt(edadTexto);

        // Mostrar los datos
        System.out.println("Hola " + nombre + ", tu edad es " + edad + " años.");
    }
}
