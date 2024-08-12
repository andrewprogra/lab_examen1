/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carlos_juarez_tienda;

import java.util.Scanner;
import java.util.InputMismatchException;

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
        int cantidadkg = 0;
        int kgVenta = 0;

        int totalventa = 0;
        double preciokg = 0;

        int totalCompras = 0;
        int totalVentas = 0;
        double precioVenta = 0;
        double compraTotal = 0;

        String nombreProducto = "";
        int kgAzucar = 0, kgAvena = 0, kgTrigo = 0, kgMaiz = 0;

        int contadorVenta = 0;
        int contadorCompra = 0;

        
        do {
            try{
            // Crear el menú
            System.out.println("\nBienvenido a la Tienda Juarez\n\n****Menu****");
            System.out.println("1 = Abrir caja\n2 = Ventas\n3 = Compras\n4 = Reportes\n5 = Cierre de caja\n6 = Salir del programa");
            System.out.print("\nQue desea hacer?: ");
            opcionMenu = lea.nextInt();

            switch (opcionMenu) {
                case 1: // Abrir caja
                    try {
                        System.out.println("\nAbriste la caja.");
                        System.out.println("***************************");
                        System.out.println("*La caja cuenta con:      *\n*  " + dineroCaja + " Lps                 *");
                        System.out.println("***************************");
                        System.out.print("\nIngrese dinero (ingrese 0 si desea volver al menu): ");
                        cantidad = lea.nextDouble();

                        if (cantidad == 0) {
                            break; // Vuelve al menú
                        } else if (cantidad < 0) {
                            do {
                                System.out.print("\n\nLa caja no acepta números negativos. Por favor, ingresa un valor valido: ");
                                cantidad = lea.nextDouble();
                            } while (cantidad < 0);
                        }

                        dineroCaja += cantidad;
                        System.out.println("\n***************************");
                        System.out.println("*La caja cuenta con:      *\n*  " + dineroCaja + " Lps                 *");
                        System.out.println("***************************");

                    } catch (InputMismatchException ex) {
                        System.out.println("Error: Entrada invalida. Intentalo de nuevo.");
                        lea.next(); // Limpia el buffer del scanner
                    }
                    break;
                case 3: // Compras
                    try {
                        if (dineroCaja <= 0) {
                            System.out.println("\nALERTA!Debe ingresar dinero en la caja para entrar a esta opcion.");
                            break;
                        }

                        System.out.println("\nIngresaste a compras.");
                        System.out.println("*********************************");
                        System.out.println("*Seleccione el tipo de proveedor:");
                        System.out.println("*********************************");
                        System.out.println("*    1 | Proveedor A            *");
                        System.out.println("*-------------------------------*");
                        System.out.println("*    2 | Proveedor B            *");
                        System.out.println("*-------------------------------*");
                        System.out.println("*    3 | Proveedor C            *");
                        System.out.println("**********************************");
                        System.out.print("\n*Seleccione: ");
                        int proveedor = lea.nextInt();
//precio que nos brinda el proveedor de los productos
                        int precio1 = 25,
                                precio2 = 20,
                                precio2C = 22,
                                precio3 = 30,
                                precio4 = 18;

//variable para suma del precio del producto * cantidad deseada
                        int compraAzucar = 0,
                                compraAvena = 0,
                                compraTrigo = 0,
                                compraMaiz = 0;

                        switch (proveedor) {
                            case 1:

                                // Proveedor A
                                contadorCompra++;
                                int productoA;
                                do {
                                    System.out.println("\n************************************");
                                    System.out.println("*            Proveedor A             *");
                                    System.out.println("**************************************");
                                    System.out.println("* Codigo  |  Producto |  Precio      *");
                                    System.out.println("======================================");
                                    System.out.println("* 1       | Azucar    | 25 Lps       *");
                                    System.out.println("--------------------------------------");
                                    System.out.println("* 2       | Avena     | 20 Lps       *");
                                    System.out.println("--------------------------------------");
                                    System.out.println("* 3       | Trigo     | 30 Lps       *");
                                    System.out.println("--------------------------------------");
                                    System.out.println("* 4       | Maiz      | 18 Lps       *");
                                    System.out.println("**************************************");
                                    System.out.print("Ingrese el codigo del producto que desea comprar(ingrese 0 para volver al menu): ");
                                    productoA = lea.nextInt();

                                    if (productoA == 0) {
                                        break;
                                    } else if (productoA < 1 || productoA > 4) {
                                        System.out.println("proveedor no vende dicho producto,porfavor ingrese el codigo de un producto existente");
                                    }

                                } while (productoA < 1 || productoA > 4);

                                if (productoA == 1) {
                                    nombreProducto = "Azucar";

                                    System.out.print("\nCuantos kilogramos de azucar desea comprar? ");
                                    kgAzucar += lea.nextInt();

                                    compraTotal = kgAzucar * precio1;
                                    if (kgAzucar == 0) {
                                        break;
                                    }
                                    if (kgAzucar < 0) {
                                        System.out.println("porfavor ingrese valores positivos");
                                        break;
                                    }
                                    if (compraTotal > dineroCaja) {
                                        int dineroFalta = (int) (compraTotal - dineroCaja);
                                        System.out.println("\n¡No se puede pagar la compra!\n\nLa caja cuenta con: " + dineroCaja + " Lps\nUsted desea comprar por un total de: " + compraTotal + " Lps\nDinero necesario para realizar la compra: " + dineroFalta + " Lps");
                                        kgAzucar -= kgAzucar;
                                        break;
                                    }
                                }
                                if (productoA == 2) {
                                    nombreProducto = "Avena";

                                    System.out.print("\n¿Cuantos kilogramos de avena desea comprar? ");
                                    kgAvena = lea.nextInt();
                                    compraTotal = kgAvena * precio2;

                                    if (kgAvena == 0) {
                                        break;
                                    }
                                    if (kgAvena < 0) {
                                        System.out.println("porfavor ingrese valores positivos");
                                        break;
                                    }
                                    if (compraTotal > dineroCaja) {
                                        int dineroFalta = (int) (compraTotal - dineroCaja);
                                        System.out.println("\n¡No se puede pagar la compra!\n\nLa caja cuenta con: " + dineroCaja + " Lps\nUsted desea comprar por un total de: " + compraTotal + " Lps\nDinero necesario para realizar la compra: " + dineroFalta + " Lps");
                                        kgAvena -= kgAvena;
                                        break;
                                    }
                                }
                                if (productoA == 3) {
                                    nombreProducto = "Trigo";
                                    ;
                                    System.out.print("\nCuantos kilogramos de trigo desea comprar? ");
                                    kgTrigo += lea.nextInt();
                                    compraTotal = kgTrigo * precio3;

                                    if (kgTrigo == 0) {
                                        break;
                                    }
                                    if (kgTrigo < 0) {
                                        System.out.println("porfavor ingrese valores positivos");
                                        break;
                                    }
                                    if (compraTotal > dineroCaja) {
                                        int dineroFalta = (int) (compraTotal - dineroCaja);
                                        System.out.println("\n¡No se puede pagar la compra!\n\nLa caja cuenta con: " + dineroCaja + " Lps\nUsted desea comprar por un total de: " + compraTotal + " Lps\nDinero necesario para realizar la compra: " + dineroFalta + " Lps");
                                        kgTrigo -= kgTrigo;
                                        break;
                                    }
                                }
                                if (productoA == 4) {
                                    nombreProducto = "Maiz";

                                    System.out.print("\nCuantos kilogramos de maiz desea comprar? ");
                                    kgMaiz += lea.nextInt();
                                    compraTotal = kgMaiz * precio4;

                                    if (kgMaiz == 0) {
                                        break;
                                    }
                                    if (kgMaiz < 0) {
                                        System.out.println("porfavor ingrese valores positivos");
                                        break;
                                    }
                                    if (compraTotal > dineroCaja) {
                                        int dineroFalta = (int) (compraTotal - dineroCaja);
                                        System.out.println("\n¡No se puede pagar la compra!\n\nLa caja cuenta con: " + dineroCaja + " Lps\nUsted desea comprar por un total de: " + compraTotal + " Lps\nDinero necesario para realizar la compra: " + dineroFalta + " Lps");
                                        kgMaiz -= kgMaiz;
                                        break;
                                    }
                                }

                                if (productoA == 1) {
                                    preciokg = precio1;
                                    cantidadkg = kgAzucar;
                                } else if (productoA == 2) {
                                    preciokg = precio2;
                                    cantidadkg = kgAvena;
                                } else if (productoA == 3) {
                                    preciokg = precio3;
                                    cantidadkg = kgTrigo;
                                } else if (productoA == 4) {
                                    preciokg = precio4;
                                    cantidadkg = kgMaiz;
                                }

                                System.out.println("\n*******************************");
                                System.out.println("*         Factura             *");
                                System.out.println("*******************************");
                                System.out.println("Producto: " + nombreProducto);
                                System.out.println("Cantidad: " + cantidadkg + " kg");
                                System.out.println("Precio por kg: " + preciokg + " Lps");
                                System.out.println("Total a pagar: " + compraTotal + " Lps");
                                System.out.println("**************************************");
                                dineroCaja -= compraTotal;
                                System.out.println("caja cuenta con:" + dineroCaja + " .Lps");

                                break;

                            case 2:
                                // Proveedor B
                                int productoB;
                                do {
                                    System.out.println("\n***************************");
                                    System.out.println("*        Proveedor B         *");
                                    System.out.println("*****************************");
                                    System.out.println("Codigo |   Producto |  Precio");
                                    System.out.println("=============================");
                                    System.out.println("2      |   Avena    |  20 Lps");
                                    System.out.println("-----------------------------");
                                    System.out.println("3      |   Trigo    |  30 Lps");
                                    System.out.println("**************************************");
                                    System.out.print("\nIngrese el codigo del producto que desea comprar(ingrese 0 para volver al menu): ");
                                    productoB = lea.nextInt();

                                    if (productoB == 0) {
                                        break;
                                    } else if (productoB < 2 || productoB > 3) {
                                        System.out.println("proveedor no vende dicho producto,porfavor ingrese el codigo de un producto existente");
                                    }
                                } while (productoB < 1 || productoB > 4);
                                if (productoB == 2) {
                                    nombreProducto = "Avena";

                                    System.out.print("\nCuantos kilogramos de avena desea comprar? ");
                                    kgAvena += lea.nextInt();
                                    compraTotal = kgAvena * precio2;

                                    if (kgAvena == 0) {
                                        break;
                                    }
                                    if (kgAvena < 0) {
                                        System.out.println("porfavor ingrese valores positivos");
                                        break;
                                    }
                                    if (compraTotal > dineroCaja) {
                                        int dineroFalta = (int) (compraTotal - dineroCaja);
                                        System.out.println("\n¡No se puede pagar la compra!\n\nLa caja cuenta con: " + dineroCaja + " Lps\nUsted desea comprar por un total de: " + compraTotal + " Lps\nDinero necesario para realizar la compra: " + dineroFalta + " Lps");
                                        kgAvena -= kgAvena;
                                        break;
                                    }
                                }
                                if (productoB == 3) {
                                    nombreProducto = "Trigo";

                                    System.out.print("\nCuantos kilogramos de trigo desea comprar? ");
                                    kgTrigo += lea.nextInt();
                                    compraTotal = kgTrigo * precio3;

                                    if (kgTrigo == 0) {
                                        break;
                                    }
                                    if (kgTrigo < 0) {
                                        System.out.println("porfavor ingrese valores positivos");
                                        break;
                                    }
                                    if (compraTotal > dineroCaja) {
                                        int dineroFalta = (int) (compraTotal - dineroCaja);
                                        System.out.println("\n¡No se puede pagar la compra!\n\nLa caja cuenta con: " + dineroCaja + " Lps\nUsted desea comprar por un total de: " + compraTotal + " Lps\nDinero necesario para realizar la compra: " + dineroFalta + " Lps");
                                        kgTrigo -= kgTrigo;
                                        break;
                                    }
                                }
                                if (productoB == 2) {
                                    preciokg = precio2;
                                    cantidadkg = kgAvena;
                                } else if (productoB == 3) {
                                    preciokg = precio3;
                                    cantidadkg = kgTrigo;
                                }
                                System.out.println("\n*******************************");
                                System.out.println("*         Factura             *");
                                System.out.println("*******************************");
                                System.out.println("Producto: " + nombreProducto);
                                System.out.println("Cantidad: " + cantidadkg + " kg");
                                System.out.println("Precio por kg: " + preciokg + " Lps");
                                System.out.println("Total a pagar: " + compraTotal + " Lps");
                                System.out.println("**************************************");
                                dineroCaja -= compraTotal;
                                System.out.println("caja cuenta con:" + dineroCaja + " .Lps");

                                break;

                            case 3:
                                // Proveedor C
                                int productoC;
                                do {
                                    System.out.println("\n***************************");
                                    System.out.println("*       Proveedor C         *");
                                    System.out.println("*****************************");
                                    System.out.println("Codigo |   Producto |  Precio");
                                    System.out.println("=============================");
                                    System.out.println("2      |   Avena    |  22 Lps");
                                    System.out.println("*****************************");
                                    System.out.print("\nIngrese el codigo del producto que desea comprar(ingrese 0 para volver al menu): ");
                                    productoC = lea.nextInt();

                                    if (productoC == 0) {
                                        break;
                                    } else if (productoC < 2 || productoC > 2) {
                                        System.out.println("proveedor no vende dicho producto,porfavor ingrese el codigo de un producto existente");
                                    }
                                } while (productoC < 2 || productoC > 2);
                                if (productoC == 2) {
                                    nombreProducto = "Avena";

                                    System.out.print("\nCuantos kilogramos de avena desea comprar? ");
                                    kgAvena += lea.nextInt();
                                    compraTotal = kgAvena * precio2C;

                                    if (kgAvena == 0) {
                                        break;
                                    }
                                    if (kgAvena < 0) {
                                        System.out.println("porfavor ingrese valores positivos");
                                        break;
                                    }
                                    if (compraTotal > dineroCaja) {
                                        int dineroFalta = (int) (compraTotal - dineroCaja);
                                        System.out.println("\n¡No se puede pagar la compra!\n\nLa caja cuenta con: " + dineroCaja + " Lps\nUsted desea comprar por un total de: " + compraTotal + " Lps\nDinero necesario para realizar la compra: " + dineroFalta + " Lps");
                                        kgAvena -= kgAvena;
                                        break;
                                    }
                                }

                                if (productoC == 2) {
                                    preciokg = precio2C;
                                    cantidadkg = kgAvena;
                                }
                                System.out.println("\n************************************");
                                System.out.println("*             Factura                *");
                                System.out.println("**************************************");
                                System.out.println("Producto: " + nombreProducto);
                                System.out.println("Cantidad: " + cantidadkg + " kg");
                                System.out.println("Precio por kg: " + preciokg + " Lps");
                                System.out.println("-------------------------------------");
                                System.out.println("Total a pagar: " + compraTotal + " Lps");
                                System.out.println("**************************************");
                                dineroCaja -= compraTotal;
                                System.out.println("caja cuenta con:" + dineroCaja + " .Lps");

                                break;

                            default:
                                System.out.println("Proveedor no valido.");
                                break;
                        }

                    } catch (InputMismatchException ex) {
                        System.out.println("Erro,no puede ingresar letras");
                        lea.next(); // Limpia el buffer del scanner
                    }
                    break;

                case 2:
                    try {
                        //ventas
                        contadorVenta++;
                        double subtotalTotal = 0, descuentoTotal = 0, impuestoTotal = 0, totalFinal = 0;
                        double cantidadComprada = 0;
                        int precio = 0;

                        if (cantidadkg == 0) {
                            System.out.println("Alerta!,debe de comprar producto para ingresar a esta opcion");
                            break;
                        }

                        System.out.println("\nIngresaste a ventas.");
                        System.out.println("*********************************");
                        System.out.println("*Seleccione el tipo de cliente:");
                        System.out.println("*********************************");
                        System.out.println("*    1 | cliente A            *");
                        System.out.println("*-------------------------------*");
                        System.out.println("*    2 | cliente B            *");
                        System.out.println("*-------------------------------*");
                        System.out.println("*    3 | cliente C            *");
                        System.out.println("**********************************");
                        System.out.print("\n*Seleccione: ");
                        int cliente = lea.nextInt();

                        int precioAzucar = 30,
                                precioAvena = 25,
                                precioTrigo = 32,
                                precioMaiz = 20;
                        switch (cliente) {

                            case 1://cliente A

                                int clienteA;
                                do {
                                    System.out.println("\n************************************************");
                                    System.out.println("*                 Cliente A                    *");
                                    System.out.println("************************************************");
                                    System.out.println("* Codigo  |  Producto |  Precio   |  kilogramos  *");
                                    System.out.println("*================================================*");
                                    System.out.println("* 1       | Azucar    | 30 Lps    |   " + kgAzucar);
                                    System.out.println("*------------------------------------------------*");
                                    System.out.println("* 2       | Avena     | 25 Lps    |   " + kgAvena);
                                    System.out.println("*------------------------------------------------*");
                                    System.out.println("* 3       | Trigo     | 32 Lps    |   " + kgTrigo);
                                    System.out.println("*------------------------------------------------*");
                                    System.out.println("* 4       | Maiz      | 20 Lps    |   " + kgMaiz);
                                    System.out.println("*************************************************");
                                    System.out.print("Ingrese el codigo del producto que desea comprar(ingrese 0 para volver al menu): ");
                                    clienteA = lea.nextInt();

                                    if (clienteA == 0) {
                                        break;
                                    } else if (clienteA < 1 || clienteA > 4) {
                                        System.out.println("Disculpe, no vendemos dicho producto, por favor ingrese el codigo de un producto existente.");
                                    } else {
                                        cantidadComprada = 0;
                                        nombreProducto = "";
                                        precio = 0;
                                        double subtotal = 0, descuento = 0, subtotalConDescuento = 0, impuesto = 0, totalPagar = 0;

                                        switch (clienteA) {
                                            case 1:
                                                nombreProducto = "Azucar";
                                                System.out.print("\nCuantos kilogramos de azucar desea comprar? ");
                                                cantidadComprada = lea.nextDouble();
                                                kgAzucar -= cantidadComprada;
                                                precio = precioAzucar;
                                                if (kgAzucar == 0) {
                                                    break;
                                                }
                                                if (kgAzucar < 0) {
                                                    System.out.println("porfavor ingrese valores positivos");
                                                    break;
                                                }
                                                break;
                                            case 2:
                                                nombreProducto = "Avena";
                                                System.out.print("\nCuantos kilogramos de avena desea comprar? ");
                                                cantidadComprada = lea.nextDouble();
                                                kgAvena -= cantidadComprada;
                                                precio = precioAvena;
                                                if (kgAvena == 0) {
                                                    break;
                                                }
                                                if (kgAvena < 0) {
                                                    System.out.println("porfavor ingrese valores positivos");
                                                    break;
                                                }
                                                break;
                                            case 3:
                                                nombreProducto = "Trigo";
                                                System.out.print("\nCuantos kilogramos de trigo desea comprar? ");
                                                cantidadComprada = lea.nextDouble();
                                                kgTrigo -= cantidadComprada;
                                                precio = precioTrigo;
                                                if (kgTrigo == 0) {
                                                    break;
                                                }
                                                if (kgTrigo < 0) {
                                                    System.out.println("porfavor ingrese valores positivos");
                                                    break;
                                                }
                                                break;
                                            case 4:
                                                nombreProducto = "Maiz";
                                                System.out.print("\nCuantos kilogramos de maiz desea comprar? ");
                                                cantidadComprada = lea.nextDouble();
                                                kgMaiz -= cantidadComprada;
                                                precio = precioMaiz;
                                                if (kgMaiz == 0) {
                                                    break;
                                                }
                                                if (kgMaiz < 0) {
                                                    System.out.println("porfavor ingrese valores positivos");
                                                    break;
                                                }
                                                break;
                                        }

                                        // Calcular el subtotal y mostrar el producto comprado
                                        subtotal = cantidadComprada * precio;
                                        System.out.println("\nProducto: " + nombreProducto);
                                        System.out.println("Cantidad de kilogramos: " + cantidadComprada);
                                        System.out.println("Precio unitario: " + precio + " Lps");
                                        System.out.println("Subtotal: " + subtotal + " Lps");

                                        // Calcular descuento
                                        if (subtotal >= 5000) {
                                            descuento = subtotal * 0.10;
                                        } else if (subtotal >= 1000) {
                                            descuento = subtotal * 0.05;
                                        } else {
                                            descuento = 0;
                                        }

                                        // Calcular subtotal con descuento
                                        subtotalConDescuento = subtotal - descuento;
                                        System.out.println("Descuento: " + descuento + " Lps");
                                        System.out.println("Subtotal con descuento: " + subtotalConDescuento + " Lps");

                                        // Calcular impuesto
                                        impuesto = subtotalConDescuento * 0.07;
                                        System.out.println("Impuesto (7%): " + impuesto + " Lps");

                                        // Calcular total a pagar
                                        totalPagar = subtotalConDescuento + impuesto;
                                        System.out.println("Total a pagar: " + totalPagar + " Lps");

                                        // Acumular los valores en las variables totales
                                        subtotalTotal += subtotal;
                                        descuentoTotal += descuento;
                                        impuestoTotal += impuesto;
                                        totalFinal += totalPagar;

                                        System.out.println("\nDesea comprar otro producto?\n1 = si\n2 = no\nSeleccione:");
                                        int seleccion = lea.nextInt();

                                        if (seleccion == 2) {
                                            break;
                                        }
                                    }
                                } while (true);

                                // Mostrar la factura final con todos los productos comprados
                                System.out.println("\n*** Factura Final ***");
                                System.out.println("Subtotal total: " + subtotalTotal + " Lps");
                                System.out.println("Descuento total: " + descuentoTotal + " Lps");
                                System.out.println("Subtotal con descuento: " + (subtotalTotal - descuentoTotal) + " Lps");
                                System.out.println("Impuesto total (7%): " + impuestoTotal + " Lps");
                                System.out.println("Total a pagar: " + totalFinal + " Lps");

                                // Sumar el total final a la caja
                                dineroCaja += totalFinal;
                                System.out.println("El dinero en la caja después de la venta es: " + dineroCaja + " Lps");

                                break;
                            case 2://cliente B

                                int clienteB;
                                do {
                                    System.out.println("\n************************************************");
                                    System.out.println("*                 Cliente B                    *");
                                    System.out.println("************************************************");
                                    System.out.println("* Codigo  |  Producto |  Precio   |  kilogramos  *");
                                    System.out.println("*================================================*");
                                    System.out.println("* 1       | Azucar    | 30 Lps    |   " + kgAzucar);
                                    System.out.println("*------------------------------------------------*");
                                    System.out.println("* 2       | Avena     | 25 Lps    |   " + kgAvena);
                                    System.out.println("*------------------------------------------------*");
                                    System.out.println("* 3       | Trigo     | 32 Lps    |   " + kgTrigo);
                                    System.out.println("*************************************************");
                                    System.out.print("Ingrese el codigo del producto que desea comprar(ingrese 0 para volver al menu): ");
                                    clienteB = lea.nextInt();

                                    if (clienteB == 0) {
                                        break;
                                    } else if (clienteB < 1 || clienteB > 3) {
                                        System.out.println("Disculpe, no vendemos dicho producto, por favor ingrese el codigo de un producto existente.");
                                    } else {
                                        cantidadComprada = 0;
                                        nombreProducto = "";
                                        precio = 0;
                                        double subtotal = 0, descuento = 0, subtotalConDescuento = 0, impuesto = 0, totalPagar = 0;

                                        switch (clienteB) {
                                            case 1:
                                                nombreProducto = "Azucar";
                                                System.out.print("\nCuantos kilogramos de azucar desea comprar? ");
                                                cantidadComprada = lea.nextDouble();
                                                kgAzucar -= cantidadComprada;
                                                precio = precioAzucar;
                                                if (kgAzucar == 0) {
                                                    break;
                                                }
                                                if (kgAzucar < 0) {
                                                    System.out.println("porfavor ingrese valores positivos");
                                                    break;
                                                }
                                                break;
                                            case 2:
                                                nombreProducto = "Avena";
                                                System.out.print("\nCuantos kilogramos de avena desea comprar? ");
                                                cantidadComprada = lea.nextDouble();
                                                kgAvena -= cantidadComprada;
                                                precio = precioAvena;
                                                if (kgAvena == 0) {
                                                    break;
                                                }
                                                if (kgAvena < 0) {
                                                    System.out.println("porfavor ingrese valores positivos");
                                                    break;
                                                }
                                                break;
                                            case 3:
                                                nombreProducto = "Trigo";
                                                System.out.print("\nCuantos kilogramos de trigo desea comprar? ");
                                                cantidadComprada = lea.nextDouble();
                                                kgTrigo -= cantidadComprada;
                                                precio = precioTrigo;
                                                if (kgTrigo == 0) {
                                                    break;
                                                }
                                                if (kgTrigo < 0) {
                                                    System.out.println("porfavor ingrese valores positivos");
                                                    break;
                                                }
                                                break;

                                        }

                                        // Calcular el subtotal y mostrar el producto comprado
                                        subtotal = cantidadComprada * precio;
                                        System.out.println("\nProducto: " + nombreProducto);
                                        System.out.println("Cantidad de kilogramos: " + cantidadComprada);
                                        System.out.println("Precio unitario: " + precio + " Lps");
                                        System.out.println("Subtotal: " + subtotal + " Lps");

                                        // Calcular descuento
                                        if (subtotal >= 5000) {
                                            descuento = subtotal * 0.10;
                                        } else if (subtotal >= 1000) {
                                            descuento = subtotal * 0.05;
                                        } else {
                                            descuento = 0;
                                        }

                                        // Calcular subtotal con descuento
                                        subtotalConDescuento = subtotal - descuento;
                                        System.out.println("Descuento: " + descuento + " Lps");
                                        System.out.println("Subtotal con descuento: " + subtotalConDescuento + " Lps");

                                        // Calcular impuesto
                                        impuesto = subtotalConDescuento * 0.07;
                                        System.out.println("Impuesto (7%): " + impuesto + " Lps");

                                        // Calcular total a pagar
                                        totalPagar = subtotalConDescuento + impuesto;
                                        System.out.println("Total a pagar: " + totalPagar + " Lps");

                                        // Acumular los valores en las variables totales
                                        subtotalTotal += subtotal;
                                        descuentoTotal += descuento;
                                        impuestoTotal += impuesto;
                                        totalFinal += totalPagar;

                                        System.out.println("\nDesea comprar otro producto?\n1 = si\n2 = no\nSeleccione:");
                                        int seleccion = lea.nextInt();

                                        if (seleccion == 2) {
                                            break;
                                        }
                                    }
                                } while (true);

                                // Mostrar la factura final con todos los productos comprados
                                System.out.println("\n*** Factura Final ***");
                                System.out.println("Subtotal total: " + subtotalTotal + " Lps");
                                System.out.println("Descuento total: " + descuentoTotal + " Lps");
                                System.out.println("Subtotal con descuento: " + (subtotalTotal - descuentoTotal) + " Lps");
                                System.out.println("Impuesto total (7%): " + impuestoTotal + " Lps");
                                System.out.println("Total a pagar: " + totalFinal + " Lps");

                                // Sumar el total final a la caja
                                dineroCaja += totalFinal;
                                System.out.println("El dinero en la caja después de la venta es: " + dineroCaja + " Lps");

                                break;
                            case 3://cienteC

                                int clienteC;
                                do {
                                    System.out.println("\n************************************************");
                                    System.out.println("*                 Cliente C                    *");
                                    System.out.println("************************************************");
                                    System.out.println("* Codigo  |  Producto |  Precio   |  kilogramos  *");
                                    System.out.println("*================================================*");
                                    System.out.println("* 4       | Maiz      | 20 Lps    |   " + kgMaiz);
                                    System.out.println("*************************************************");
                                    System.out.print("Ingrese el codigo del producto que desea comprar(ingrese 0 para volver al menu): ");
                                    clienteC = lea.nextInt();

                                    if (clienteC == 0) {
                                        break;
                                    } else if (clienteC < 4 || clienteC > 4) {
                                        System.out.println("Disculpe, no vendemos dicho producto, por favor ingrese el codigo de un producto existente.");
                                    } else {
                                        cantidadComprada = 0;
                                        nombreProducto = "";
                                        precio = 0;
                                        double subtotal = 0, descuento = 0, subtotalConDescuento = 0, impuesto = 0, totalPagar = 0;

                                        switch (clienteC) {

                                            case 4:
                                                nombreProducto = "Maiz";
                                                System.out.print("\nCuantos kilogramos de maiz desea comprar? ");
                                                cantidadComprada = lea.nextDouble();
                                                kgMaiz -= cantidadComprada;
                                                precio = 20;
                                                if (kgMaiz == 0) {
                                                    break;
                                                }
                                                if (kgMaiz < 0) {
                                                    System.out.println("porfavor ingrese valores positivos");
                                                    break;
                                                }
                                                break;
                                        }

                                        // Calcular el subtotal y mostrar el producto comprado
                                        subtotal = cantidadComprada * precio;
                                        System.out.println("\nProducto: " + nombreProducto);
                                        System.out.println("Cantidad de kilogramos: " + cantidadComprada);
                                        System.out.println("Precio unitario: " + precio + " Lps");
                                        System.out.println("Subtotal: " + subtotal + " Lps");

                                        // Calcular descuento
                                        if (subtotal >= 5000) {
                                            descuento = subtotal * 0.10;
                                        } else if (subtotal >= 1000) {
                                            descuento = subtotal * 0.05;
                                        } else {
                                            descuento = 0;
                                        }

                                        // Calcular subtotal con descuento
                                        subtotalConDescuento = subtotal - descuento;
                                        System.out.println("Descuento: " + descuento + " Lps");
                                        System.out.println("Subtotal con descuento: " + subtotalConDescuento + " Lps");

                                        // Calcular impuesto
                                        impuesto = subtotalConDescuento * 0.07;
                                        System.out.println("Impuesto (7%): " + impuesto + " Lps");

                                        // Calcular total a pagar
                                        totalPagar = subtotalConDescuento + impuesto;
                                        System.out.println("Total a pagar: " + totalPagar + " Lps");

                                        // Acumular los valores en las variables totales
                                        subtotalTotal += subtotal;
                                        descuentoTotal += descuento;
                                        impuestoTotal += impuesto;
                                        totalFinal += totalPagar;

                                        System.out.println("\nDesea comprar otro producto?\n1 = si\n2 = no\nSeleccione:");
                                        int seleccion = lea.nextInt();

                                        if (seleccion == 2) {
                                            break;
                                        }
                                    }
                                } while (true);

                                // Mostrar la factura final con todos los productos comprados
                                System.out.println("\n*** Factura Final ***");
                                System.out.println("Subtotal total: " + subtotalTotal + " Lps");
                                System.out.println("Descuento total: " + descuentoTotal + " Lps");
                                System.out.println("Subtotal con descuento: " + (subtotalTotal - descuentoTotal) + " Lps");
                                System.out.println("Impuesto total (7%): " + impuestoTotal + " Lps");
                                System.out.println("Total a pagar: " + totalFinal + " Lps");

                                // Sumar el total final a la caja
                                dineroCaja += totalFinal;
                                System.out.println("El dinero en la caja después de la venta es: " + dineroCaja + " Lps");

                                break;
                        }
                    } catch (InputMismatchException ex) {
                        System.out.println("Error, no permitimos ingresar letras");
                        lea.next(); // Limpia el buffer del scanner
                    }
                    break;

                case 4://reporte
                    if (dineroCaja <= 0 || cantidadkg <= 0) {
                        System.out.println("Alert!,debe de iniciar caja primero y comprar productos");
                        break;
                    }

                    System.out.println("\n\nIngresaste a reportes");
                    System.out.println("**************************");
                    System.out.println("la caja cuenta con" + dineroCaja + " .Lps");
                    System.out.println("compras realizadas en el dia:" + contadorCompra);
                    System.out.println("ventas realizadas en el dia:" + contadorVenta);
                    System.out.println("volumen total de compras" + totalCompras);
                    System.out.println("Volumen total de ventas:" + totalVentas);
                    int ganancias = totalVentas - totalCompras;
                    System.out.println("Margen de Ganancias" + ganancias);
                    //valor medio compra y venta(promedio)
                    //cantidad de compra/cantidad de productos
                    int medioCompra=totalCompras/4;
                    int medioVenta=totalVentas/4;
                    
                    System.out.println("Valor medio de compra"+medioCompra);
                    System.out.println("Valor medio de venta"+medioVenta);
                    

                    break;
            }
        }catch(InputMismatchException ex){
            System.out.println("Error,no acepta letras");
            lea.next();
    }
        }while (opcionMenu != 6);
        
}
}