/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carlos_juarez_tienda;

import java.util.Scanner;

public class Carlos_juarez_Tienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //llamamos a scanner
       Scanner lea = new Scanner(System.in);
        int dineroCaja = 0;
        int opcionMenu = 0;
        double cantidad = 0;

        do {
            // Crear el menú
            System.out.println("\nBienvenido a la Tienda Juarez\n\n****Menú****");
            System.out.println("1 = Abrir caja\n2 = Ventas\n3 = Compras\n4 = Reportes\n5 = Cierre de caja\n6 = Salir del programa");
            System.out.print("\n¿Qué desea hacer?: ");
            opcionMenu = lea.nextInt();

            switch (opcionMenu) {
                case 1: // Abrir caja
                    System.out.println("\nAbriste la caja.");
                    System.out.println("La caja cuenta con: " + dineroCaja + " Lps");
                    System.out.print("Ingrese dinero: ");
                    cantidad = lea.nextDouble();

                    while (cantidad < 0) {
                        System.out.print("\nLa caja no acepta números negativos. Por favor, ingresa un valor válido: ");
                        cantidad = lea.nextDouble();
                    }
                    dineroCaja += cantidad;
                    System.out.println("La caja cuenta con: " + dineroCaja + " Lps");
                    break;

                case 3: // Compras
                    if (dineroCaja <= 0) {
                        System.out.println("Debe ingresar dinero en la caja para entrar a esta opción.");
                        break;
                    }

                    System.out.println("\nIngresaste a compras.");
                    System.out.println("Seleccione el tipo de proveedor:");
                    System.out.println("\n1 = Proveedor A\n2 = Proveedor B\n3 = Proveedor C");
                    System.out.print("\nSeleccione: ");
                    int proveedor = lea.nextInt();

                    String producto1 = "Azúcar";
                    String producto2 = "Avena";
                    String producto3 = "Trigo";
                    String producto4 = "Maíz";
                    int precio1 = 25, precio2 = 20, precio2C = 22, precio3 = 30, precio4 = 18;
                    int kilogramoAzucar = 0, kilogramoAvena = 0, kilogramoTrigo = 0, kilogramoMaiz = 0;
                    int compraAzucar = 0, compraAvena = 0, compraTrigo = 0, compraMaiz = 0;

                    switch (proveedor) {
                        case 1:
                            // Proveedor A
                            System.out.println("\nProveedor A:");
                            System.out.println("Código    Producto   Precio");
                            System.out.println("1         Azúcar     25 Lps");
                            System.out.println("2         Avena      20 Lps");
                            System.out.println("3         Trigo      30 Lps");
                            System.out.println("4         Maíz       18 Lps");
                            System.out.print("Ingrese el código del producto que desea comprar: ");
                            int productoA = lea.nextInt();

                            if (productoA == 1) {
                                System.out.print("\n¿Cuántos kilogramos de azúcar desea comprar? ");
                                kilogramoAzucar = lea.nextInt();
                                compraAzucar = kilogramoAzucar * precio1;

                                if (compraAzucar <= dineroCaja) {
                                    dineroCaja -= compraAzucar;
                                    System.out.println("Compra realizada. Total: " + compraAzucar + " Lps");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }
                            } else if (productoA == 2) {
                                System.out.print("\n¿Cuántos kilogramos de avena desea comprar? ");
                                kilogramoAvena = lea.nextInt();
                                compraAvena = kilogramoAvena * precio2;

                                if (compraAvena <= dineroCaja) {
                                    dineroCaja -= compraAvena;
                                    System.out.println("Compra realizada. Total: " + compraAvena + " Lps");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }
                            } if (productoA == 3) {
                                System.out.print("\n¿Cuántos kilogramos de trigo desea comprar? ");
                                kilogramoTrigo = lea.nextInt();
                                compraTrigo = kilogramoTrigo * precio3;

                                if (compraTrigo <= dineroCaja) {
                                    dineroCaja -= compraTrigo;
                                    System.out.println("Compra realizada. Total: " + compraTrigo + " Lps");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }
                            } if (productoA == 4) {
                                System.out.print("\n¿Cuántos kilogramos de maiz desea comprar? ");
                                kilogramoMaiz = lea.nextInt();
                                compraMaiz = kilogramoMaiz * precio4;

                                if (compraMaiz <= dineroCaja) {
                                    dineroCaja -= compraMaiz;
                                    System.out.println("Compra realizada. Total: " + compraMaiz + " Lps");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }
                            }
                            
                            break;

                        case 2:
                            // Proveedor B
                            System.out.println("\nProveedor B:");
                            System.out.println("Código    Producto   Precio");
                            System.out.println("2         Avena      20 Lps");
                            System.out.println("3         Trigo      30 Lps");
                            System.out.print("Ingrese el código del producto que desea comprar: ");
                            int productoB = lea.nextInt();

                            if (productoB == 2) {
                                System.out.print("\n¿Cuántos kilogramos de avena desea comprar? ");
                                kilogramoAvena = lea.nextInt();
                                compraAvena = kilogramoAvena * precio2;

                                if (compraAvena <= dineroCaja) {
                                    dineroCaja -= compraAvena;
                                    System.out.println("Compra realizada. Total: " + compraAvena + " Lps");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }}
                            else if (productoB ==3) {
                                System.out.print("\n¿Cuántos kilogramos de trigo desea comprar? ");
                                kilogramoTrigo = lea.nextInt();
                                compraTrigo = kilogramoTrigo * precio3;

                                if (compraTrigo <= dineroCaja) {
                                    dineroCaja -= compraTrigo;
                                    System.out.println("Compra realizada. Total: " + compraTrigo + " Lps");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }}
                            break;

                        case 3:
                            // Proveedor C
                            System.out.println("\nProveedor C:");
                            System.out.println("Código    Producto   Precio");
                            System.out.println("2         Avena      22 Lps");
                           System.out.print("Ingrese el código del producto que desea comprar: ");
                            int productoC = lea.nextInt();

                            if (productoC == 2) {
                                System.out.print("\n¿Cuántos kilogramos de avena desea comprar? ");
                                kilogramoAvena = lea.nextInt();
                                compraAvena = kilogramoAvena * precio2C;

                                if (compraAvena <= dineroCaja) {
                                    dineroCaja -= compraAvena;
                                    System.out.println("Compra realizada. Total: " + compraAvena + " Lps");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }}
                            break;

                        default:
                            System.out.println("Proveedor no válido.");
                            break;
                    }
                    break;

                // Similar lógica para otras opciones del menú...

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcionMenu != 6);
    }
}
