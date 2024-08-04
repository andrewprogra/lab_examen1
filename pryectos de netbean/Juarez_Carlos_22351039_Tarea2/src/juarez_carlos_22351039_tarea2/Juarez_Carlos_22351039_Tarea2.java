/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juarez_carlos_22351039_tarea2;

import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Juarez_Carlos_22351039_Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamamos a Scanner
 Scanner lea = new Scanner(System.in);
        int usuario = 0;
        String continuar = "";
        String respuesta;
        String palabra;

        while (usuario != 4) {
            System.out.println("\nSeleccione el tipo de ejercicio que desea hacer:");
            System.out.println("1 = Ejercicio en diagonal");
            System.out.println("2 = Pirámide de números");
            System.out.println("3 = Ejercicio de palíndromo");
            System.out.println("4 = Salir del programa");
            usuario = lea.nextInt();
            lea.nextLine(); 

            if (usuario == 1) {
                
                System.out.print("Ingrese palabra: ");
                palabra = lea.nextLine().toUpperCase();

              
                int longitud = palabra.length();

               
                for (int i = 0; i < longitud; i++) {
                   
                    for (int s = 0; s < i; s++) {
                        System.out.print(" ");
                    }
                    
                    System.out.println(palabra.charAt(i));
                }

              
                for (int i = longitud - 2; i >= 0; i--) {
                    // Imprimir espacios en blanco para crear la diagonal
                    for (int s = 0; s < i; s++) {
                        System.out.print(" ");
                    }
                    
                    System.out.println(palabra.charAt(i));
                }
            }

            if (usuario == 2) {
                System.out.println("\nIngrese el número de filas: ");
                int filas = lea.nextInt();

                for (int i = 0; i < filas; i++) {
                    for (int s = 0; s < i; s++) {
                        System.out.print("");
                    }
                    for (int contador = filas - i; contador > 1; contador--) {
                        System.out.print(contador + " ");
                    }
                    System.out.println();
                }
            }

            if (usuario == 3) {
                do {
                    System.out.println("Ingrese palabra: ");
                    palabra = lea.next().toLowerCase();
                    String palabraIn = "";
                    int contador = palabra.length() - 1;

                    while (contador >= 0) {
                        char letra = palabra.charAt(contador);
                        palabraIn += letra;
                        contador--;
                    }
                    System.out.println(palabraIn + " " + palabra + " " + palabraIn.equals(palabra));
                    respuesta = (palabraIn.equals(palabra) ? "ES PALÍNDROMO" : "NO ES PALÍNDROMO");
                    System.out.println("La respuesta es: " + respuesta);

                    System.out.println("\n¿Desea otra palabra a evaluar (si/no)?:");
                    continuar = lea.next();
                } while (!continuar.equalsIgnoreCase("no"));
            }
        }
       
    }
}