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
        int decicion = 0;
        int kilogramoAzucar = 0,kilogramoAvena = 0,kilogramoTrigo = 0,kilogramoMaiz = 0;
        int kilogramoAzucarVenta = 0, kilogramoAvenaVenta = 0, kilogramosTrigoVenta = 0, kilogramosMaizVenta = 0;
        int precioUnitarioAzucar = 30, precioUnitarioAvena = 25, precioUnitarioTrigo = 32, precioUnitarioMaiz = 20;
        String producto1 = "Azúcar";
        String producto2 = "Avena";
        String producto3 = "Trigo";
        String producto4 = "Maíz";
       
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

                    int precio1 = 25,
                     precio2 = 20,
                     precio2C = 22,
                     precio3 = 30,
                     precio4 = 18;

                    int compraAzucar = 0,
                     compraAvena = 0,
                     compraTrigo = 0,
                     compraMaiz = 0;

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
                                kilogramoAzucar += lea.nextInt();
                                compraAzucar = kilogramoAzucar * precio1;

                                if (compraAzucar <= dineroCaja) {
                                    dineroCaja -= compraAzucar;
                                    System.out.println("Compra realizada. ");
                                } else {
                                    System.out.println("No se puede pagar compra.");
                                }
                            } else if (productoA == 2) {
                                System.out.print("\n¿Cuántos kilogramos de avena desea comprar? ");
                                kilogramoAvena = lea.nextInt();
                                compraAvena = kilogramoAvena * precio2;

                                if (compraAvena <= dineroCaja) {
                                    dineroCaja -= compraAvena;
                                    System.out.println("Compra realizada. ");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }
                            }
                            if (productoA == 3) {
                                System.out.print("\n¿Cuántos kilogramos de trigo desea comprar? ");
                                kilogramoTrigo += lea.nextInt();
                                compraTrigo = kilogramoTrigo * precio3;

                                if (compraTrigo <= dineroCaja) {
                                    dineroCaja -= compraTrigo;
                                    System.out.println("Compra realizada.");
                                } else {
                                    System.out.println("No se puede pagar compra.");
                                }
                            }
                            if (productoA == 4) {
                                System.out.print("\n¿Cuántos kilogramos de maiz desea comprar? ");
                                kilogramoMaiz += lea.nextInt();
                                compraMaiz = kilogramoMaiz * precio4;

                                if (compraMaiz <= dineroCaja) {
                                    dineroCaja -= compraMaiz;
                                    System.out.println("Compra realizada.");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }
                            } else {
                                System.out.println("proveedor no vende dico producto");
                            }
                            System.out.println("\n***FACTURA****");
                            System.out.println("producto:");
                            if (productoA == 1) {
                                System.out.println(producto1 + "\nCantidad en kilogramos de:" + producto1 + " : " + kilogramoAzucar + " Kg" + "\nTotal a pagar:" + compraAzucar + " .Lps");
                            } else if (productoA == 2) {
                                System.out.println("\n" + producto2 + "\nCantidad en kilogramos de:" + producto2 + " : " + kilogramoAvena + " Kg" + "\nTotal a pagar:" + compraAvena + " .Lps");
                            } else if (productoA == 3) {
                                System.out.println("\n" + producto3 + "\nCantidad en kilogramos de:" + producto3 + " : " + kilogramoTrigo + " Kg" + "\nTotal a pagar:" + compraTrigo + " .Lps");
                            } else {
                                System.out.println("\n" + producto4 + "\nCantidad en kilogramos de:" + producto4 + " : " + kilogramoMaiz + " Kg" + "\nTotal a pagar:" + compraMaiz + " .Lps");
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
                                kilogramoAvena += lea.nextInt();
                                compraAvena = kilogramoAvena * precio2;

                                if (compraAvena <= dineroCaja) {
                                    dineroCaja -= compraAvena;
                                    System.out.println("Compra realizada. Total: " + compraAvena + " Lps");
                                } else {
                                    System.out.println("No se puede pagar compra.");
                                }
                            } else if (productoB == 3) {
                                System.out.print("\n¿Cuántos kilogramos de trigo desea comprar? ");
                                kilogramoTrigo += lea.nextInt();
                                compraTrigo = kilogramoTrigo * precio3;

                                if (compraTrigo <= dineroCaja) {
                                    dineroCaja -= compraTrigo;
                                    System.out.println("Compra realizada. Total: " + compraTrigo + " Lps");
                                } else {
                                    System.out.println("No hay suficiente dinero en la caja.");
                                }
                            } else {
                                System.out.println("proveedor no vende dico producto");
                            }
                            System.out.println("\n***FACTURA****");
                            System.out.println("producto:");
                            if (productoB == 2) {
                                System.out.println(producto2 + "\nCantidad en kilogramos de:" + producto2 + " : " + kilogramoAvena + " Kg" + "\nTotal a pagar:" + compraAvena + " .Lps");
                            } else {
                                System.out.println("\n" + producto3 + "\nCantidad en kilogramos de:" + producto3 + " : " + kilogramoTrigo + " Kg" + "\nTotal a pagar:" + compraTrigo + " .Lps");
                            }
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
                                kilogramoAvena += lea.nextInt();
                                compraAvena = kilogramoAvena * precio2C;

                                if (compraAvena <= dineroCaja) {
                                    dineroCaja -= compraAvena;
                                    System.out.println("Compra realizada. Total: " + compraAvena + " Lps");
                                } else {
                                    System.out.println("No se puede pagar compra");
                                }
                            } else {
                                System.out.println("proveedor no vende dico producto");
                            }
                            System.out.println("producto:");
                            if (productoC == 2) {
                                System.out.println("\n" + producto2 + "\nCantidad en kilogramos de:" + producto2 + " : " + kilogramoAvena + " Kg" + "\nTotal a pagar:" + compraAvena + " .Lps");
                            }

                            break;

                        default:
                            System.out.println("Proveedor no válido.");
                            break;

                    }
                    break;

                case 2://ventas
                    if (kilogramoAzucar > 0 || kilogramoAvena > 0 || kilogramoTrigo > 0 || kilogramoMaiz > 0) {

                        System.out.println("\n\n***aprovecha nuestros descuentos****");

                        System.out.println("|----------------------------------------------------------------------------------------"
                                + "\nSi el subtotal es mayor o igual que 1000.Lps --------Descuento:5% sobre el subtotal"
                                + "\nSi el subtotal es mayor o igual que 5000.Lps--------Descuento:10% sobre el subtotal"
                                + "\nsi el subtotal es menor que 1000.Lps----------------No aplica descuento"
                                + "\n-------------------------------------------------------------------------------------");

                        int clienteA = 0,
                                clienteB = 0,
                                clienteC = 0;;

                        System.out.println("Ingresaste a Ventas\nSelecciona el tipo de cliente:\n1=cliente A\n2=cliente B\n3=cliente C\nSeleccione:");
                        int cliente = lea.nextInt();

                        switch (cliente) {

                            case 1:

                                //cliente A
                                System.out.println("El cliente A solo puede comprar los siguientes productos:"
                                        + "\nCodigo          producto           precio de venta            kilogramos disponibles");
                                System.out.println("\n1                Azucar                30                         " + kilogramoAzucar);
                                System.out.println("\n2                Avena                25                          " + kilogramoAvena);
                                System.out.println("\n3                Trigo                32                          " + kilogramoTrigo);
                                System.out.println("\n4                Maiz                  20                         " + kilogramoMaiz);
                                System.out.println("seleccione que producto desea comprar");
                                clienteA = lea.nextInt();

                                if (clienteA == 1) {

                                    System.out.println("cuantos kilogramos de azucar desea comprar:");
                                    kilogramoAzucarVenta = lea.nextInt();

                                    if (kilogramoAzucarVenta >= kilogramoAzucar) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantidad de kilogramo deseada");
                                    } else {
                                        System.out.println("Desea comprar otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                        if (decicion == 1) {

                                            continue;
                                        } else if(decicion==2){
                                            double subtotalAzucar=0, subtotalAvena=0,subtotalTrigo=0,subtotalMaiz=0;
                                        System.out.println("\n\n***FACTURA***");
                                            if (clienteA == 1 || clienteB == 1 || clienteC == 1) {
                                                System.out.println("\nproducto:" + producto1);
                                            } else if (clienteA == 2 || clienteB == 2 || clienteC == 2) {
                                                System.out.println("\nproducto:" + producto2);
                                            } else if (clienteA == 3 || clienteB == 3 || clienteC == 3) {
                                                System.out.println("\nproducto:" + producto3);
                                            } else if (clienteA == 4 || clienteB == 4 || clienteC == 4) {
                                                System.out.println("\nproducto" + producto4);
                                            }

                                            if (clienteA == 1 || clienteB == 1 || clienteC == 1) {
                                                System.out.println("\ncantidad kilogramos:" + kilogramoAzucar);

                                            } else if (clienteA == 2 || clienteB == 2 || clienteC == 2) {
                                                System.out.println("\ncantidad kilogramos:" + kilogramoAvena);

                                            } else if (clienteA == 3 || clienteB == 3 || clienteC == 3) {
                                                System.out.println("\ncantidad kilogramos:" + kilogramoTrigo);
                                            } else if (clienteA == 4 || clienteB == 4 || clienteC == 4) {
                                                System.out.println("\ncantidad kilogramos:" + kilogramoMaiz);
                                            }

                                            if (clienteA == 1 || clienteB == 1 || clienteC == 1) {
                                               
                                                System.out.println("precio unitario:" + precioUnitarioAzucar + " .Lps");
                                            } else if (clienteA == 2 || clienteB == 2 || clienteC == 2) {
                                               
                                                System.out.println("precio unitario:" + precioUnitarioAvena + " .Lps");
                                            } else if (clienteA == 3 || clienteB == 3 || clienteC == 3) {
                                              
                                                System.out.println("precio unitario:" + precioUnitarioTrigo + " .Lps");
                                            } else if (clienteA == 4 || clienteB == 4 || clienteC == 4) {
                                              
                                                System.out.println("precio unitario:" + precioUnitarioMaiz + " .Lps");
                                            }

                                            if (clienteA == 1 || clienteB == 1 || clienteC == 1) {
                                                subtotalAzucar = kilogramoAzucarVenta * precioUnitarioAzucar;
                                                System.out.println("Subtotal: " + subtotalAzucar + " .Lps");
                                            } else if (clienteA == 2 || clienteB == 2 || clienteC == 2) {
                                                 subtotalAvena = kilogramoAvenaVenta * precioUnitarioAvena;
                                                System.out.println("Subtotal: " + subtotalAvena + " .Lps");
                                            } else if (clienteA == 3 || clienteB == 3 || clienteC == 3) {
                                                 subtotalTrigo = kilogramosTrigoVenta * precioUnitarioTrigo;
                                                System.out.println("Subtotal: " + subtotalTrigo + " .Lps");
                                            } else if (clienteA == 4 || clienteB == 4 || clienteC == 4) {
                                                 subtotalMaiz = kilogramosMaizVenta * precioUnitarioMaiz;
                                                System.out.println("Subtotal: " + subtotalMaiz + " .Lps");
                                            }
                                            
                                            if(subtotalAzucar>=1000  || subtotalAvena>=1000 || subtotalTrigo>=1000 || subtotalMaiz>=0){
                                            
                                            
                                            }
                                     
                                       

                                    }
                                    }

                                } else if (clienteA == 2) {
                                    System.out.println("\ncuantos kilogramos de avena desea comprar");
                                    kilogramoAvenaVenta = lea.nextInt();

                                    if (kilogramoAvenaVenta >= kilogramoAvena) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantidad de kilogramos deseada");
                                    } else {
                                        System.out.println("\nDesea compra otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                    }
                                    if (decicion == 2) {
                                        continue;
                                    }
                                } else if (clienteA == 3) {
                                    System.out.println("\ncuantos kilogramos de Trigo desea comprar");
                                    kilogramosTrigoVenta = lea.nextInt();

                                    if (kilogramosTrigoVenta >= kilogramoTrigo) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantida de kilogramos deseada ");
                                    } else {
                                        System.out.println("\nDesea comprar otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                        if (decicion == 2) {
                                            continue;
                                        }
                                    }
                                } else if (clienteA == 4) {
                                    System.out.println("\ncuantos kilogramos de maiz desea comprar");
                                    kilogramosMaizVenta = lea.nextInt();

                                    if (kilogramosMaizVenta >= kilogramoMaiz) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantida de kilogramos deseada ");
                                    } else {
                                        System.out.println("\nDesea comprar otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                        if (decicion == 2) {
                                            continue;
                                        } else if (decicion == 2) {

                                            System.out.println("\n\n***FACTURA***");
                                        }
                                    }
                                } else {
                                    System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO");
                                    break;
                                }

                            case 2:
                                //cliente B
                                System.out.println("El cliente B solo puede comprar los siguientes productos:"
                                        + "\nCodigo          producto           precio de venta            kilogramos disponibles");
                                System.out.println("\n1                Azucar                30                         " + kilogramoAzucar);
                                System.out.println("\n2                Avena                25                          " + kilogramoAvena);
                                System.out.println("\n3                Trigo                32                          " + kilogramoTrigo);
                                System.out.println("seleccione que producto desea comprar");
                                clienteB = lea.nextInt();

                                if (clienteB == 1) {

                                    System.out.println("cuantos kilogramos de azucar desea comprar:");
                                    kilogramoAzucarVenta = lea.nextInt();

                                    if (kilogramoAzucarVenta >= kilogramoAzucar) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantidad de kilogramo deseada");
                                    } else {
                                        System.out.println("Desea comprar otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                        if (decicion == 2) {

                                            break;
                                        }
                                    }

                                } else if (clienteB == 2) {
                                    System.out.println("\ncuantos kilogramos de avena desea comprar");
                                    kilogramoAvenaVenta = lea.nextInt();

                                    if (kilogramoAvenaVenta >= kilogramoAvena) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantidad de kilogramos deseada");
                                    } else {
                                        System.out.println("\nDesea compra otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                    }
                                    if (decicion == 2) {
                                        break;
                                    }
                                } else if (clienteB == 3) {
                                    System.out.println("\ncuantos kilogramos de Trigo desea comprar");
                                    kilogramosTrigoVenta = lea.nextInt();

                                    if (kilogramosTrigoVenta >= kilogramoTrigo) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantida de kilogramos deseada ");
                                    } else {
                                        System.out.println("\nDesea comprar otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                        if (decicion == 2) {
                                            break;
                                        }
                                    }
                                } else {
                                    System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO");
                                    break;
                                }

                            case 3:

                                System.out.println("El cliente C solo puede comprar los siguientes productos:"
                                        + "\nCodigo          producto           precio de venta            kilogramos disponibles");
                                System.out.println("\n4                Maiz                  20                         " + kilogramoMaiz);
                                System.out.println("seleccione que producto desea comprar");
                                clienteC = lea.nextInt();

                                if (clienteC == 4) {
                                    System.out.println("\ncuantos kilogramos de maiz desea comprar");
                                    kilogramosMaizVenta = lea.nextInt();

                                    if (kilogramosMaizVenta >= kilogramoMaiz) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantida de kilogramos deseada ");
                                    } else {
                                        System.out.println("\nDesea comprar otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                        if (decicion == 1) {
                                            break;
                                        }
                                        
        
                                    }
                                } else {
                                    System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO");
                                    break;
                                }

                                break;
                        }

                    } else {

                        System.out.println("primero debe de comprar producto para ingresar a esta opcion");
                        break;
                    }

                    break;

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
