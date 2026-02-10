package org.cristhianlopez;

import java.util.Scanner; //ESTA CLASE ME AYUDA A LEER DATOS DESDE EL TECLADO
import java.util.*; // PAQUETE PARA QUE ACEPTE . COMO DECIMAL

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // FORZAMOS EL PUNTO COMO DECIMAL

        // Leer texto
        System.out.print("Ingresa tu nombre: ");
        String nombre = entrada.nextLine();

        // Leer números
        System.out.print("Ingresa tu edad: ");
        int edad = entrada.nextInt();


        //LEER CIUDAD
        entrada.nextLine(); // ESTO ME AYUDA A CONSUMIR EL SALTO DE LINEA
        System.out.print("Ingresa tu ciudad de nacimiento: ");
        String ciudad = entrada.nextLine();


        System.out.print("Ingresa tu promedio CON PUNTO: ");
        double promedio = entrada.nextDouble();

        // Mostrar los datos leídos
        System.out.println("\n###### INFORMACION PERSONAL ######"); // \n BAJAR UNA LIENA LA CONSOLA
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Ciudad de nacimiento : " + ciudad);
        System.out.println("Promedio: " + promedio);

        entrada.close(); // Cerrar el Scanner
    }
}

// ESE COMENTARIO LO REALIZA ESTUDIANTE1



// ESTE ES EL SEGUNDO COMENTARIO DE ESTUDIANTE1