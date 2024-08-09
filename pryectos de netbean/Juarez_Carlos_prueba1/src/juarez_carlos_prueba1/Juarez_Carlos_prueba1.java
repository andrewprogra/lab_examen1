/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juarez_carlos_prueba1;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author carlo
 */
public class Juarez_Carlos_prueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamamos a Scanner
        Scanner lea = new Scanner(System.in);
          


       
        // Contadores para cada opción
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;

        // Crear el menú
        System.out.println("************************");
        System.out.println("*       Menu           *");
        System.out.println("1=palabras alrevez\n2=Numero perfecto\n3=Primos\n4=Votacion\n5=salir");
        System.out.println("*************************");
        System.out.println("\nseleccion: ");
        int usuario = lea.nextInt();

        do {
            switch (usuario) {
                case 1: // palabras alrevez
                    contador1++;
                    System.out.println("ingrese palabra:");
                    String palabra = lea.next();
                    String palabrareves = "";
                    for (int i = palabra.length() - 1; i >= 0; i--) {
                        palabrareves += palabra.charAt(i);
                    }
                    System.out.println(palabrareves);
                    break;

                case 2: // numero perfecto
                    contador2++;
                    System.out.println("ingrese numero: ");
                    int numero = lea.nextInt();
                    int suma = 0;
                    for (int i = 1; i <= numero / 2; i++) {
                        if (numero % i == 0) {
                            suma += i;
                        }
                    }
                    if (suma == numero) {
                        System.out.println(numero + " es un numero perfecto");
                    } else {
                        System.out.println(numero + " no es un numero perfecto");
                    }
                    break;

                case 3: // numero primo
                    contador3++;
                    Random aleatorio = new Random();
                    int numerorandom = aleatorio.nextInt(101); // Genera un número aleatorio entre 0 y 100
                    System.out.println("Numero aleatorio: " + numerorandom);

                    // Verificar si el número es menor o igual a 1
                    if (numerorandom <= 1) {
                        System.out.println("Numero NO es primo");
                    } else {
                        int divisores = 0;
                        System.out.print("Divisores: ");
                        for (int i = 1; i <= numerorandom; i++) {
                            if (numerorandom % i == 0) {
                                divisores++;
                                System.out.print(i + " "); // Imprimir cada divisor directamente
                            }
                        }
                        System.out.println(); // Salto de línea después de imprimir todos los divisores

                        // Determinar si el número es primo o no
                        if (divisores == 2) {
                            System.out.println("Numero es primo");
                        } else {
                            System.out.println("Numero NO es primo");
                        }
                    }
                    break;

                case 4: // votacion
                    contador4++;
                    int votoAzul = 0, votoRojo = 0, votoNegro = 0, votoAmarillo = 0;
                    System.out.println("Cuantos votantes hay en el pais?:");
                    int votantes = lea.nextInt();

                    int votosTotales = 0;
                    for (int i = 1; i <= votantes; i++) {
                        System.out.println("\nElija por quién votara:\n1=Azul\n2=Rojo\n3=Negro\n4=Amarillo");
                        int eleccion = lea.nextInt();

                        if (eleccion > 4 || eleccion < 1) {
                            System.out.println("Su voto fue contado como nulo");
                        } else {
                            votosTotales++;
                            switch (eleccion) {
                                case 1:
                                    votoAzul++;
                                    break;
                                case 2:
                                    votoRojo++;
                                    break;
                                case 3:
                                    votoNegro++;
                                    break;
                                case 4:
                                    votoAmarillo++;
                                    break;
                            }
                        }
                    }

                    // Calcular el porcentaje de votos válidos
                    double porcentajeVotosValidos = (double) votosTotales / votantes * 100;

                    if (porcentajeVotosValidos >= 60) {
                        System.out.println("Votacion valida");

                        // Determinar el ganador sin usar Math.max
                        int maxVotos = votoAzul;
                        String ganador = "Azul";

                        if (votoRojo > maxVotos) {
                            maxVotos = votoRojo;
                            ganador = "Rojo";
                        }
                        if (votoNegro > maxVotos) {
                            maxVotos = votoNegro;
                            ganador = "Negro";
                        }
                        if (votoAmarillo > maxVotos) {
                            maxVotos = votoAmarillo;
                            ganador = "Amarillo";
                        }

                        System.out.println("Ganador: " + ganador);
                    } else {
                        System.out.println("VOTACION FALLIDA");
                    }
                    break;

                case 5: // salir
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida. Por favor, ingrese un numero del 1 al 5.");
            }

            // Mostrar el menú nuevamente después de ejecutar una opción
            System.out.println("\n************************");
            System.out.println("*       Menu           *");
            System.out.println("1=palabras alrevez\n2=Numero perfecto\n3=Primos\n4=Votacion\n5=salir");
            System.out.println("*************************");
            System.out.println("\nseleccion: ");
            usuario = lea.nextInt();

        } while (usuario != 5);

        // Imprimir conteo de opciones
        System.out.println("\nNumero de veces que se ha seleccionado cada opcion:");
        System.out.println("1=palabras alrevez: " + contador1);
        System.out.println("2=Numero perfecto: " + contador2);
        System.out.println("3=Primos: " + contador3);
        System.out.println("4=Votacion: " + contador4);

        
    }
}


    


