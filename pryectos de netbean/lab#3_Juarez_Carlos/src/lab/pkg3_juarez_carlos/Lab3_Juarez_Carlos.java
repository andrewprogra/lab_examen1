/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab.pkg3_juarez_carlos;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carlo
 */
public class Lab3_Juarez_Carlos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //llamamos a Scanner
        Scanner lea = new Scanner(System.in);

        int opcion = 0;
        //creamos menu
        String continuar = "si";
        while (opcion != 4) {
            System.out.println("\nSeleccion el ejercicio:" + "\n1='PIEDRA, PAPEL O TIJERA'\n2=ejercicio de suma\n3=ejercicio piramide\n4=salir");
            opcion = lea.nextInt();

            switch (opcion) {
                //opcion 1
                case 1:

                    do {
                        System.out.println("Ingresaste al juego de Piedra,papel o tiejera");

                        String usuario = "";
                        Random random = new Random();
                        int computadora;

                        System.out.println("\nBienvenido");

                        System.out.println("\nSeleccione que desea usar:\nTijeras\nPapel\nPiedra");
                        usuario = lea.next().toLowerCase();

                        computadora = random.nextInt(3) + 1;
                        if (computadora == 1) {
                            System.out.print("Computadora eligio: Tijera");
                        } else if (computadora == 2) {
                            System.out.print("Computadora eligio: Papel");
                        } else {
                            System.out.print("computadora eligio: Piedra");
                        }

                        if (usuario.equalsIgnoreCase("tijeras")) {
                            if (computadora == 1) {
                                System.out.println("\nEmpate");

                            } else if (computadora == 2) {
                                System.out.println("\nGanaste");

                            } else {
                                System.out.println("\nPerdiste\nla computadora ha Ganado");

                            }

                        }

                        if (usuario.equalsIgnoreCase("papel")) {
                            if (computadora == 1) {
                                System.out.println("\nPerdiste\nla computadora ha Ganado");

                            } else if (computadora == 2) {
                                System.out.println("\nEmpate");

                            } else if (computadora == 3) {
                                System.out.println("\nPerdiste\nla computadora ha Ganado");

                            }
                        }
                        if (usuario.equalsIgnoreCase("piedra")) {
                            if (computadora == 1) {
                                System.out.println("\nGanaste");

                            } else if (computadora == 2) {
                                System.out.println("\nPerdiste\nla computadora ha Ganado");

                            } else if (computadora == 3) {
                                System.out.println("\nEmpate");

                            }
                        }

                        System.out.println("\nDesea volver a jugar?:(si/no)");
                        continuar = lea.next();

                    } while (continuar.equalsIgnoreCase("si"));

                //opcion 2
                case 2:

        // Solicitar al usuario que ingrese números
        System.out.print("Ingrese números: ");
        String entrada = lea.next();

        int sumaTotal = 0;

        // Recorrer cada carácter en la cadena de entrada
        for (int i = 0; i < entrada.length(); i++) {
            // Convertir el carácter a número entero restando '0'
            int digito = entrada.charAt(i) - '0';
            sumaTotal += digito;

            // Imprimir el número
            System.out.print(digito);
            
            // Imprimir el signo '+' si no es el último número
            if (i < entrada.length() - 1) {
                System.out.print(" + ");
            }
        }

        // Imprimir el resultado de la suma
        System.out.println(" = " + sumaTotal);

      
break;

                //opcion 3
                case 3:

                    // número de filas
                    System.out.println("\nIngrese el numero de filas: ");
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

                    break;

                case 4:
                    System.out.println("Adios, Vuelve pronto :D");
                    break;
            }

        }

    }

}
