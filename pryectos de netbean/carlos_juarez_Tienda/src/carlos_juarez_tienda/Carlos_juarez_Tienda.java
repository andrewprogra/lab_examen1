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
        int dineroCaja = 0, opcionMenu = 0, decicion = 0, gananciasAzucar = 0, gananciasAvena = 0, gananciasTrigo = 0, gananciasMaiz = 0, TotaldeCompras = 0, TotaldeVentas = 0, cantidadkg = 0, kgVenta = 0, totalventa = 0, totalCompras = 0, totalVentas = 0, kgAzucar = 0, kgAvena = 0, kgTrigo = 0, kgMaiz = 0, numeroCompras = 0, numeroVentas = 0;
        int precio1 = 25,
                precio2 = 20,
                precio2C = 22,
                precio3 = 30,
                precio4 = 18;
        int precioAzucar = 30,
                precioAvena = 25,
                precioTrigo = 32,
                precioMaiz = 20;

        double cantidad = 0;
        double costoCompra;
        double preciokg = 0, dineroDia = 0, dineroBanco = 0, cantidadComprada = 0, subtotalTotal = 0, descuentoTotal = 0, impuestoTotal = 0, totalFinal = 0, subTotalDes = 0, kgMaizVendido = 0, kgTrigoVendido = 0, kgAvenaVendido = 0, kgAzucarVendido = 0, cantidadProductoEstrella = 0, precioVenta = 0, compraMayorGasto = 0, ventaMayorGanancia = 0, valorMedioVenta = 0, compraTotal = 0, totalCaja = 0, volumenCompras = 0, valorMedioCompra = 0, volumenVentas = 0, margenGanancia = 0;

        String nombreProducto = "";

        String productoEstrella = "";

        boolean cajaAbierta = false;
        String facturaDetalles = "";
        do {
            try {
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
                            cajaAbierta = true;
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

//variable para suma del precio del producto * cantidad deseada
                            int compraAzucar = 0,
                                    compraAvena = 0,
                                    compraTrigo = 0,
                                    compraMaiz = 0;

                            switch (proveedor) {
                                case 1:

                                    // Proveedor A
                                    numeroCompras++;
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
                                        costoCompra = compraTotal;
                                        volumenCompras += costoCompra; // Actualiza el volumen total de compras
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
                                        costoCompra = compraTotal;
                                        volumenCompras += costoCompra; // Actualiza el volumen total de compras
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
                                        costoCompra = compraTotal;
                                        volumenCompras += costoCompra; // Actualiza el volumen total de compras
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
                                        costoCompra = compraTotal;
                                        volumenCompras += costoCompra; // Actualiza el volumen total de compras
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
                                        costoCompra = compraTotal;
                                        volumenCompras += costoCompra; // Actualiza el volumen total de compras
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
                                        costoCompra = compraTotal;
                                        volumenCompras += costoCompra; // Actualiza el volumen total de compras
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
                                        costoCompra = compraTotal;
                                        volumenCompras += costoCompra; // Actualiza el volumen total de compras
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
                            TotaldeCompras += (cantidadkg * preciokg);
                        } catch (InputMismatchException ex) {
                            System.out.println("Erro,no puede ingresar letras");
                            lea.next(); // Limpia el buffer del scanner
                        }
                        break;

                    case 2:
                        try {
                            //ventas
                            numeroVentas++;

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
                                                    if (cantidadComprada > kgAzucar || cantidadComprada < 0) {
                                                        System.out.println("\nlo sentimos pero no tenemos suficiente cantidada de azucar,solo contamos con:" + kgAzucar + "de azucar");
                                                    } else {
                                                        kgAzucar -= cantidadComprada;
                                                        precio = precioAzucar;
                                                        gananciasAzucar = (precioAzucar - precio1) * (int) cantidadComprada;
                                                        
                                                        if (kgAzucar == 0) {
                                                            break;
                                                        }
                                                        if (kgAzucar < 0) {
                                                            System.out.println("porfavor ingrese valores positivos");
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 2:
                                                    nombreProducto = "Avena";
                                                    System.out.print("\nCuantos kilogramos de avena desea comprar? ");
                                                    cantidadComprada = lea.nextDouble();
                                                    if (cantidadComprada > kgAvena || cantidadComprada < 0) {
                                                        System.out.println("\nlo sentimos pero no tenemos suficiente cantidad de azucar,solo contamos con:" + kgAvena + "de avena");
                                                    } else {
                                                        kgAvena -= cantidadComprada;
                                                        precio = precioAvena;
                                                        gananciasAvena = (precioAvena - precio2) * (int) cantidadComprada;
                                                        if (kgAvena == 0) {
                                                            break;
                                                        }
                                                        if (kgAvena < 0) {
                                                            System.out.println("porfavor ingrese valores positivos");
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    nombreProducto = "Trigo";
                                                    System.out.print("\nCuantos kilogramos de trigo desea comprar? ");
                                                    cantidadComprada = lea.nextDouble();
                                                    if (cantidadComprada > kgTrigo || cantidadComprada < 0) {
                                                        System.out.println("\nlo sentimos pero no tenemos suficiente cantidad de azucar,solo contamos con:" + kgTrigo + "de trigo");
                                                    } else {
                                                        kgTrigo -= cantidadComprada;
                                                        precio = precioTrigo;
                                                        gananciasTrigo = (precioTrigo - precio3) * (int) cantidadComprada;
                                                        if (kgTrigo == 0) {
                                                            break;
                                                        }
                                                        if (kgTrigo < 0) {
                                                            System.out.println("porfavor ingrese valores positivos");
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 4:
                                                    nombreProducto = "Maiz";
                                                    System.out.print("\nCuantos kilogramos de maiz desea comprar? ");
                                                    cantidadComprada = lea.nextDouble();
                                                    if (cantidadComprada > kgMaiz || cantidadComprada < 0) {
                                                        System.out.println("\nlo sentimos pero no tenemos suficiente cantidad de azucar,solo contamos con:" + kgMaiz + "de  maiz");
                                                    } else {
                                                        kgMaiz -= cantidadComprada;
                                                        precio = precioMaiz;
                                                        gananciasMaiz = (precioMaiz - precio4) * (int) cantidadComprada;
                                                        if (kgMaiz == 0) {
                                                            break;
                                                        }
                                                        if (kgMaiz < 0) {
                                                            System.out.println("porfavor ingrese valores positivos");
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }

                                            // Calcular el subtotal y mostrar el producto comprado
                                            subtotal = cantidadComprada * precio;
                                            if (subtotal >= 1000) {
                                                descuento = subtotal * 0.05;
                                            } else if (subtotal > 5000) {
                                                descuento = subtotal * 0.10;
                                            } else {

                                                descuento = 0;
                                            }

                                            subtotalConDescuento = subtotal - descuento;
                                            impuesto = subtotalConDescuento * 0.07;
                                            totalPagar = subtotalConDescuento + impuesto;
                                            facturaDetalles += "\nProducto: " + nombreProducto
                                                    + "\nCantidad de kilogramos: " + cantidadComprada
                                                    + "\nPrecio unitario: " + precio + " Lps"
                                                    + "\nSubtotal: " + String.format("%.2f", subtotal) + " Lps"
                                                    + "\nDescuento: " + String.format("%.2f", descuento) + " Lps"
                                                    + "\nSubtotal con descuento: " + String.format("%.2f", subtotalConDescuento) + " Lps"
                                                    + "\nImpuesto (7%): " + String.format("%.2f", impuesto) + " Lps"
                                                    + "\nTotal a pagar: " + String.format("%.2f", totalPagar) + " Lps\n";

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
                                    System.out.println("*******************************************************");
                                    System.out.println("\n*** Factura Final ***");
                                    System.out.println("*******************************************************");
                                    System.out.println(facturaDetalles);
                                    System.out.printf("Subtotal total: %.2f Lps\n", subtotalTotal);
                                    System.out.printf("Descuento total: %.2f Lps\n", descuentoTotal);
                                    System.out.printf("Impuesto total (7%%): %.2f Lps\n", impuestoTotal);
                                    System.out.println("--------------------------------------------------------");
                                    System.out.printf("Total a pagar: %.2f Lps\n", totalFinal);

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
                                                    if (cantidadComprada > kgAzucar || cantidadComprada < 0) {
                                                        System.out.println("\nlo sentimos pero no tenemos suficiente cantidad de azucar,solo contamos con:" + kgAzucar + "de azucar");
                                                    } else {
                                                        kgAzucar -= cantidadComprada;
                                                        precio = precioAzucar;
                                                        gananciasAzucar = (precioAzucar - precio1) * (int) cantidadComprada;
                                                        if (kgAzucar == 0) {
                                                            break;
                                                        }
                                                        if (kgAzucar < 0) {
                                                            System.out.println("porfavor ingrese valores positivos");
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 2:
                                                    nombreProducto = "Avena";
                                                    System.out.print("\nCuantos kilogramos de avena desea comprar? ");
                                                    cantidadComprada = lea.nextDouble();
                                                    if (cantidadComprada > kgAvena || cantidadComprada < 0) {
                                                        System.out.println("\nlo sentimos pero no tenemos suficiente cantidad de azucar,solo contamos con:" + kgAvena + "de  avena");
                                                    } else {
                                                        kgAvena -= cantidadComprada;
                                                        precio = precioAvena;
                                                        gananciasAvena = (precioAvena - precio2) * (int) cantidadComprada;
                                                        if (kgAvena == 0) {
                                                            break;
                                                        }
                                                        if (kgAvena < 0) {
                                                            System.out.println("porfavor ingrese valores positivos");
                                                            break;
                                                        }
                                                    }
                                                    break;
                                                case 3:
                                                    nombreProducto = "Trigo";
                                                    System.out.print("\nCuantos kilogramos de trigo desea comprar? ");
                                                    cantidadComprada = lea.nextDouble();
                                                    if (cantidadComprada > kgTrigo || cantidadComprada < 0) {
                                                        System.out.println("\nlo sentimos pero no tenemos suficiente cantidad de azucar,solo contamos con:" + kgTrigo + "de trigo");
                                                    } else {
                                                        kgTrigo -= cantidadComprada;
                                                        precio = precioTrigo;
                                                        gananciasTrigo = (precioTrigo - precio3) * (int) cantidadComprada;
                                                        if (kgTrigo == 0) {
                                                            break;
                                                        }
                                                        if (kgTrigo < 0) {
                                                            System.out.println("porfavor ingrese valores positivos");
                                                            break;
                                                        }
                                                    }
                                                    break;

                                            }

                                            // Calcular el subtotal y mostrar el producto comprado
                                            subtotal = cantidadComprada * precio;
                                            if (subtotal >= 1000) {
                                                descuento = subtotal * 0.05;
                                            } else if (subtotal > 5000) {
                                                descuento = subtotal * 0.10;
                                            } else {
                                                descuento = 0;
                                            }

                                            subtotalConDescuento = subtotal - descuento;
                                            impuesto = subtotalConDescuento * 0.07;
                                            totalPagar = subtotalConDescuento + impuesto;
                                            facturaDetalles += "\nProducto: " + nombreProducto
                                                    + "\nCantidad de kilogramos: " + cantidadComprada
                                                    + "\nPrecio unitario: " + precio + " Lps"
                                                    + "\nSubtotal: " + String.format("%.2f", subtotal) + " Lps"
                                                    + "\nDescuento: " + String.format("%.2f", descuento) + " Lps"
                                                    + "\nSubtotal con descuento: " + String.format("%.2f", subtotalConDescuento) + " Lps"
                                                    + "\nImpuesto (7%): " + String.format("%.2f", impuesto) + " Lps"
                                                    + "\nTotal a pagar: " + String.format("%.2f", totalPagar) + " Lps\n";

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
                                    System.out.println("*******************************************************");
                                    System.out.println("\n*** Factura Final ***");
                                    System.out.println("*******************************************************");
                                    System.out.println(facturaDetalles);
                                    System.out.printf("Subtotal total: %.2f Lps\n", subtotalTotal);
                                    System.out.printf("Descuento total: %.2f Lps\n", descuentoTotal);
                                    System.out.printf("Impuesto total (7%%): %.2f Lps\n", impuestoTotal);
                                    System.out.println("----------------------------------------------------------");
                                    System.out.printf("Total a pagar: %.2f Lps\n", totalFinal);

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
                                                    if (cantidadComprada > kgMaiz || cantidadComprada < 0) {
                                                        System.out.println("\nlo sentimos pero no tenemos suficiente cantidad de azucar,solo contamos con:" + kgMaiz + "de  maiz");
                                                    } else {
                                                        kgMaiz -= cantidadComprada;
                                                        precio = precioTrigo;
                                                        gananciasMaiz = (precioMaiz - precio4) * (int) cantidadComprada;
                                                        if (kgMaiz == 0) {
                                                            break;
                                                        }
                                                        if (kgMaiz < 0) {
                                                            System.out.println("porfavor ingrese valores positivos");
                                                            break;
                                                        }
                                                    }
                                                    break;
                                            }

                                            // Calcular el subtotal y mostrar el producto comprado
                                            subtotal = cantidadComprada * precio;
                                            if (subtotal >= 1000) {
                                                descuento = subtotal * 0.05;
                                            } else if (subtotal > 5000) {
                                                descuento = subtotal * 0.10;
                                            } else {
                                                descuento = 0;
                                            }

                                            subtotalConDescuento = subtotal - descuento;
                                            impuesto = subtotalConDescuento * 0.07;
                                            totalPagar = subtotalConDescuento + impuesto;
                                            facturaDetalles += "\nProducto: " + nombreProducto
                                                    + "\nCantidad de kilogramos: " + cantidadComprada
                                                    + "\nPrecio unitario: " + precio + " Lps"
                                                    + "\nSubtotal: " + String.format("%.2f", subtotal) + " Lps"
                                                    + "\nDescuento: " + String.format("%.2f", descuento) + " Lps"
                                                    + "\nSubtotal con descuento: " + String.format("%.2f", subtotalConDescuento) + " Lps"
                                                    + "\nImpuesto (7%): " + String.format("%.2f", impuesto) + " Lps"
                                                    + "\nTotal a pagar: " + String.format("%.2f", totalPagar) + " Lps\n";

                                            // Acumular los valores en las variables totales
                                            subtotal += subtotal;
                                            descuentoTotal += descuento;

                                            subTotalDes = subtotal - descuentoTotal;
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
                                    System.out.println("\n*******************************************************");
                                    System.out.println("  *** Factura Final ***");
                                    System.out.println("*******************************************************");
                                    System.out.println(facturaDetalles);
                                    System.out.printf("Subtotal total: %.2f Lps\n", subtotalTotal);
                                    System.out.printf("Descuento total: %.2f Lps\n", descuentoTotal);
                                    System.out.printf("Impuesto total (7%%): %.2f Lps\n", impuestoTotal);
                                    System.out.println("------------------------------------------------");
                                    System.out.printf("Total a pagar: %.2f Lps\n", totalFinal);

                                    // Sumar el total final a la caja
                                    dineroCaja += totalFinal;
                                    System.out.println("El dinero en la caja después de la venta es: " + dineroCaja + " Lps");

                                    break;
                            }
                            TotaldeVentas += (cantidadComprada * precio);
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

// Actualiza datos para el producto específico
                        kgAzucarVendido += cantidadComprada;
                        totalCaja += totalFinal;
                        margenGanancia += (totalFinal - subTotalDes); // Ejemplo de cálculo de margen de ganancia

// Determina la venta con mayor ganancia
                        
                        if(gananciasAzucar>gananciasAvena){
                            ventaMayorGanancia=gananciasAzucar;
                        }else if(gananciasAvena>gananciasTrigo){
                        ventaMayorGanancia=gananciasAvena; 
                        }else if(gananciasTrigo>gananciasMaiz){
                        ventaMayorGanancia=gananciasTrigo;
                        }else{
                        ventaMayorGanancia=gananciasMaiz;
                        }
                       

// Determina el producto estrella
                        if (kgAzucarVendido > cantidadProductoEstrella) {
                            productoEstrella = nombreProducto;
                            cantidadProductoEstrella = kgAzucarVendido;
                        }

                        kgAvenaVendido += cantidadComprada;
                        totalCaja += totalFinal;
                        margenGanancia += (totalFinal - subTotalDes);

                        

                        if (kgAvenaVendido > cantidadProductoEstrella) {
                            productoEstrella = nombreProducto;
                            cantidadProductoEstrella = kgAvenaVendido;
                        }

                        kgTrigoVendido += cantidadComprada;
                        totalCaja += totalFinal;
                        margenGanancia += (totalFinal - subTotalDes);

                      

                        if (kgTrigoVendido > cantidadProductoEstrella) {
                            productoEstrella = nombreProducto;
                            cantidadProductoEstrella = kgTrigoVendido;
                        }

                        kgMaizVendido += cantidadComprada;
                        totalCaja += totalFinal;
                        margenGanancia += (totalFinal - subTotalDes);

                      

                        if (kgMaizVendido > cantidadProductoEstrella) {
                            productoEstrella = nombreProducto;
                            cantidadProductoEstrella = kgMaizVendido;
                        }

// Ejemplo de cálculo para valor medio
                        volumenVentas = totalCaja;
                        valorMedioVenta = volumenVentas / numeroVentas;
                        valorMedioCompra = volumenCompras / numeroCompras;

// Generación del reporte
                        System.out.println("*******************************************************");
                        System.out.println("\n*** Reporte del Día ***");
                        System.out.println("*******************************************************");
                        System.out.println("*Cantidad Actual en Caja: " + totalCaja + " Lps");
                        System.out.println("----------------------------------------------------");
                        System.out.println("*Número de Compras: " + numeroCompras); // Número total de compras
                        System.out.println("----------------------------------------------------");
                        System.out.println(" *Número de Ventas: " + numeroVentas); // Número total de ventas
                        System.out.println("----------------------------------------------------");
                        System.out.println(" *Volumen Total de Compras: " + volumenCompras + " Lps*");
                        System.out.println("----------------------------------------------------");
                        System.out.println(" *Volumen Total de Ventas: " + volumenVentas + " Lps*");
                        System.out.println("----------------------------------------------------");
                        System.out.println(" *Margen de Ganancia: " + margenGanancia + " Lps*");
                        System.out.println("----------------------------------------------------");
                        System.out.println(" *Valor Medio de Compra: " + valorMedioCompra + " Lps*");
                        System.out.println("----------------------------------------------------");
                        System.out.println(" *Valor Medio de Venta: " + valorMedioVenta + " Lps*");
                        System.out.println("----------------------------------------------------");
                        System.out.println(" *Venta con Mayor Ganancia: " + ventaMayorGanancia + " Lps*");
                        System.out.println("----------------------------------------------------");
                        System.out.println(" *Producto Estrella: " + productoEstrella + " con " + cantidadProductoEstrella + " kg vendidos*");
                        System.out.println("----------------------------------------------------");
                        System.out.println(" *Ranking:");
                        System.out.println("   1. " + productoEstrella + " con " + cantidadProductoEstrella + " kg*");
                        System.out.println("*********************************************************");
                        break;

                    case 5: // Cierre de Caja
                        if (!cajaAbierta) {
                            System.out.println("La caja ya está cerrada.");
                        } else {
                            cajaAbierta = false;
                            System.out.println("Cierre de Caja:");
                            System.out.println("Total en caja: " + dineroCaja + " Lps");

                            // Calcular depósito
                            double maxDeposito = dineroCaja * 0.60;
                            System.out.println("¿Cuánto desea depositar en el banco? (Máximo: " + maxDeposito + " Lps)");
                            double deposito = lea.nextDouble();

                            if (deposito > maxDeposito) {
                                System.out.println("No puede depositar más del 60%.");
                                deposito = maxDeposito;
                            }

                            dineroBanco += deposito;
                            dineroCaja -= deposito;
                            System.out.println("Deposito realizado. Dinero en banco: " + dineroBanco + " Lps");
                            System.out.println("Dinero restante en caja: " + dineroCaja + " Lps");

                            // Reiniciar contadores y acumuladores de día
                            dineroDia = 0;
                            // Otros acumuladores que tienes para las ventas y compras del día

                            System.out.println("Caja cerrada exitosamente.");
                        }
                        break;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Error,no acepta letras");
                lea.next();
            }
        } while (opcionMenu != 6);

    }
}
