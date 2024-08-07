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
        int kilogramoAzucar = 0, kilogramoAvena = 0, kilogramoTrigo = 0, kilogramoMaiz = 0;
        int kilogramoAzucarVenta = 0, kilogramoAvenaVenta = 0, kilogramosTrigoVenta = 0, kilogramosMaizVenta = 0;

        String producto1 = "Azucar";
        String producto2 = "Avena";
        String producto3 = "Trigo";
        String producto4 = "Maiz";

        do {
            // Crear el menú
            System.out.println("\nBienvenido a la Tienda Juarez\n\n****Menu****");
            System.out.println("1 = Abrir caja\n2 = Ventas\n3 = Compras\n4 = Reportes\n5 = Cierre de caja\n6 = Salir del programa");
            System.out.print("\n¿Que desea hacer?: ");
            opcionMenu = lea.nextInt();

            switch (opcionMenu) {
                case 1: // Abrir caja
                    System.out.println("\nAbriste la caja.");
                     System.out.println("***************************");
                    System.out.println("*La caja cuenta con:      *\n*  " +dineroCaja+ " .Lps                 *");
                    System.out.println("***************************");
                    System.out.print("\nIngrese dinero: ");
                    cantidad = lea.nextDouble();

                    while (cantidad < 0) {
                        System.out.print("\n\nLa caja no acepta numeros negativos. Por favor, ingresa un valor valido: ");
                        cantidad = lea.nextDouble();
                    }
                    dineroCaja += cantidad;
                     System.out.println("\n***************************");
                    System.out.println("*La caja cuenta con:      *\n*  " +dineroCaja+ " .Lps                 *");
                    System.out.println("***************************");
                    break;

                case 3: // Compras
                    if (dineroCaja <= 0) {
                        System.out.println("\n!ALERTA¡Debe ingresar dinero en la caja para entrar a esta opción.");
                        break;
                    }

                    System.out.println("\nIngresaste a compras.");
                    System.out.println("Seleccione el tipo de proveedor:");
                    System.out.println("\n1 = Proveedor A\n2 = Proveedor B\n3 = Proveedor C");
                    System.out.print("\nSeleccione: ");
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
                            System.out.println("\n**************************************");
                            System.out.println("*            Proveedor A             *");
                            System.out.println("**************************************");
                            System.out.println("* Codigo  |  Producto |  Precio      *");
                            System.out.println("--------------------------------------");
                            System.out.println("* 1       | Azucar    | 25 Lps       *");
                            System.out.println("* 2       | Avena     | 20 Lps       *");
                            System.out.println("* 3       | Trigo     | 30 Lps       *");
                            System.out.println("* 4       | Maiz      | 18 Lps       *");
                            System.out.println("**************************************");
                            System.out.print("Ingrese el codigo del producto que desea comprar: ");
                            int productoA = lea.nextInt();

                            if (productoA == 1) {
                                System.out.print("\n¿Cuantos kilogramos de azucar desea comprar? ");
                                kilogramoAzucar += lea.nextInt();
                                compraAzucar = kilogramoAzucar * precio1;

                                if (compraAzucar <= dineroCaja) {
                                    dineroCaja -= compraAzucar;
                                     System.out.println("***Compra realizada.*** ");
                                     System.out.println("-------------------------");
                                     System.out.println("\n\n**********************************");
                                     System.out.println("*              FACTURA                *");
                                     System.out.println("**************************************");
                                     System.out.println("*producto: ");
                                    if (productoA == 1) {
                                        System.out.println(producto1 + "\n*Cantidad en kilogramos de:" + producto1 + " : " + kilogramoAzucar + " Kg" + "\n--------------------------------------"+"\n*Total a pagar:" + compraAzucar + " .Lps");
                                    } else if (productoA == 2) {
                                        System.out.println("\n" + producto2 + "\n*Cantidad en kilogramos de:" + producto2 + " : " + kilogramoAvena + " Kg" + "\n--------------------------------------"+"\n*Total a pagar:" + compraAvena + " .Lps");
                                    } else if (productoA == 3) {
                                        System.out.println("\n" + producto3 + "\n*Cantidad en kilogramos de:" + producto3 + " : " + kilogramoTrigo + " Kg" + "\n--------------------------------------"+"\n*Total a pagar:" + compraTrigo + " .Lps");
                                    } else {
                                        System.out.println("\n" + producto4 + "\n*Cantidad en kilogramos de:" + producto4 + " : " + kilogramoMaiz + " Kg" + "\n--------------------------------------"+"\n*Total a pagar:" + compraMaiz + " .Lps");
                                    }
                                     System.out.println("*************************************");
                                    break;
                                } else if (compraAzucar > dineroCaja) {
                                    int dineroFalta = kilogramoAzucar - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea"+kilogramoAzucar+" kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            } else if (productoA == 2) {
                                System.out.print("\n¿Cuantos kilogramos de avena desea comprar? ");
                                kilogramoAvena = lea.nextInt();
                                compraAvena = kilogramoAvena * precio2;

                                if (compraAvena <= dineroCaja) {
                                    dineroCaja -= compraAvena;
                                    System.out.println("Compra realizada. ");
                                     System.out.println("-------------------------");
                                     System.out.println("\n\n**********************************");
                                     System.out.println("*              FACTURA                *");
                                     System.out.println("**************************************");
                                     System.out.println("*producto: ");
                                    if (productoA == 1) {
                                        System.out.println(producto1 + "\n*Cantidad en kilogramos de:" + producto1 + " : " + kilogramoAzucar + " Kg" + "\n*Total a pagar:" + compraAzucar + " .Lps");
                                    } else if (productoA == 2) {
                                        System.out.println("\n" + producto2 + "\n*Cantidad en kilogramos de:" + producto2 + " : " + kilogramoAvena + " Kg" + "\n*Total a pagar:" + compraAvena + " .Lps");
                                    } else if (productoA == 3) {
                                        System.out.println("\n" + producto3 + "\n*Cantidad en kilogramos de:" + producto3 + " : " + kilogramoTrigo + " Kg" + "\n*Total a pagar:" + compraTrigo + " .Lps");
                                    } else {
                                        System.out.println("\n" + producto4 + "\n*Cantidad en kilogramos de:" + producto4 + " : " + kilogramoMaiz + " Kg" + "\n*Total a pagar:" + compraMaiz + " .Lps");
                                    }
                                     System.out.println("*************************************");
                                    break;
                                } else if (compraAvena > dineroCaja) {
                                    int dineroFalta = kilogramoAvena - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea"+kilogramoAvena+" kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            }
                            if (productoA == 3) {
                                System.out.print("\n¿Cuantos kilogramos de trigo desea comprar? ");
                                kilogramoTrigo += lea.nextInt();
                                compraTrigo = kilogramoTrigo * precio3;

                                if (compraTrigo <= dineroCaja) {
                                    dineroCaja -= compraTrigo;
                                    System.out.println("Compra realizada.");
                                   System.out.println("-------------------------");
                                     System.out.println("\n\n**********************************");
                                     System.out.println("*              FACTURA                *");
                                     System.out.println("**************************************");
                                    System.out.println("*producto: ");
                                    if (productoA == 1) {
                                        System.out.println(producto1 + "\n*Cantidad en kilogramos de:" + producto1 + " : " + kilogramoAzucar + " Kg" + "\n*Total a pagar:" + compraAzucar + " .Lps");
                                    } else if (productoA == 2) {
                                        System.out.println("\n" + producto2 + "\n*Cantidad en kilogramos de:" + producto2 + " : " + kilogramoAvena + " Kg" + "\n*Total a pagar:" + compraAvena + " .Lps");
                                    } else if (productoA == 3) {
                                        System.out.println("\n" + producto3 + "\n*Cantidad en kilogramos de:" + producto3 + " : " + kilogramoTrigo + " Kg" + "\n*Total a pagar:" + compraTrigo + " .Lps");
                                    } else {
                                        System.out.println("\n" + producto4 + "\n*Cantidad en kilogramos de:" + producto4 + " : " + kilogramoMaiz + " Kg" + "\n*Total a pagar:" + compraMaiz + " .Lps");
                                    }
                                     System.out.println("*************************************");
                                    break;
                                } else if (compraTrigo > dineroCaja) {
                                    int dineroFalta = kilogramoTrigo - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea"+kilogramoTrigo+" kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            }
                            if (productoA == 4) {
                                System.out.print("\n¿Cuantos kilogramos de maiz desea comprar? ");
                                kilogramoMaiz += lea.nextInt();
                                compraMaiz = kilogramoMaiz * precio4;

                                if (compraMaiz <= dineroCaja) {
                                    dineroCaja -= compraMaiz;
                                    System.out.println("Compra realizada.");
                                     System.out.println("-------------------------");
                                     System.out.println("\n\n**********************************");
                                     System.out.println("*              FACTURA                *");
                                     System.out.println("**************************************");
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
                                    System.out.println("*************************************");
                                    break;

                                } else if (compraMaiz > dineroCaja) {
                                    int dineroFalta = kilogramoMaiz - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea"+kilogramoMaiz+" kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            } else if (productoA != 1 || productoA != 2 || productoA != 3 || productoA != 4) {
                                System.out.println("proveedor no vende dico producto");
                                break;
                            }

                        case 2:
                            // Proveedor B
                              System.out.println("\n**************************************");
                            System.out.println("*            Proveedor B            *");
                            System.out.println("**************************************");
                            System.out.println("Codigo |   Producto |  Precio");
                            System.out.println("-------------------------------");
                            System.out.println("2      |   Avena    |  20 Lps");
                            System.out.println("3      |   Trigo    |  30 Lps");
                            System.out.println("**************************************");
                            System.out.print("\nIngrese el codigo del producto que desea comprar: ");
                            int productoB = lea.nextInt();
                           
                                if (productoB == 2) {
                                    System.out.print("\n¿Cuantos kilogramos de avena desea comprar? ");
                                    kilogramoAvena += lea.nextInt();
                                    compraAvena = kilogramoAvena * precio2;

                                    if (compraMaiz <= dineroCaja) {
                                    dineroCaja -= compraMaiz;
                                    System.out.println("Compra realizada.");
                                     System.out.println("-------------------------");
                                     System.out.println("\n\n**********************************");
                                     System.out.println("*              FACTURA                *");
                                     System.out.println("**************************************");
                                    System.out.println("producto:");
                                     if (productoB == 2) {
                                        System.out.println("\n" + producto2 + "\nCantidad en kilogramos de:" + producto2 + " : " + kilogramoAvena + " Kg" + "\nTotal a pagar:" + compraAvena + " .Lps");
                                    } else if (productoB == 3) {
                                        System.out.println("\n" + producto3 + "\nCantidad en kilogramos de:" + producto3 + " : " + kilogramoTrigo + " Kg" + "\nTotal a pagar:" + compraTrigo + " .Lps");
                                    } 
                                    System.out.println("*************************************");
                                    break;

                                } else if (compraAvena > dineroCaja) {
                                       int dineroFalta = kilogramoAvena - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea"+kilogramoAvena+" kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                    }
                                } else if (productoB == 3) {
                                    System.out.print("\n¿Cuantos kilogramos de trigo desea comprar? ");
                                    kilogramoTrigo += lea.nextInt();
                                    compraTrigo = kilogramoTrigo * precio3;

                                    if (compraTrigo <= dineroCaja) {
                                        dineroCaja -= compraTrigo;
                                       System.out.println("Compra realizada.");
                                     System.out.println("-------------------------");
                                     System.out.println("\n\n**********************************");
                                     System.out.println("*              FACTURA                *");
                                     System.out.println("**************************************");
                                    System.out.println("producto:");
                                     if (productoB == 2) {
                                        System.out.println("\n" + producto2 + "\nCantidad en kilogramos de:" + producto2 + " : " + kilogramoAvena + " Kg" + "\nTotal a pagar:" + compraAvena + " .Lps");
                                    } else if (productoB == 3) {
                                        System.out.println("\n" + producto3 + "\nCantidad en kilogramos de:" + producto3 + " : " + kilogramoTrigo + " Kg" + "\nTotal a pagar:" + compraTrigo + " .Lps");
                                    } 
                                    System.out.println("*************************************");
                                    break;

                               
                                    } else if (compraTrigo > dineroCaja) {
                                        int dineroFalta = kilogramoTrigo - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea"+kilogramoTrigo+" kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                    }
                                } else if(productoB != 1 || productoB != 2 || productoB != 3 || productoB != 4){
                                    System.out.println("proveedor no vende dico producto");
                                    break;
                                }
                               
                            
                            break;

                        case 3:
                            // Proveedor C
                             System.out.println("\n**************************************");
                            System.out.println("*            Proveedor C            *");
                            System.out.println("**************************************");
                            System.out.println("Codigo |   Producto |  Precio");
                            System.out.println("---------------------------");
                            System.out.println("2      |   Avena    |  22 Lps");
                             System.out.println("**************************************");
                            System.out.print("Ingrese el codigo del producto que desea comprar: ");
                            int productoC = lea.nextInt();
                           
                                if (productoC == 2) {
                                    System.out.print("\n¿Cuantos kilogramos de avena desea comprar? ");
                                    kilogramoAvena += lea.nextInt();
                                    compraAvena = kilogramoAvena * precio2C;

                                    if (compraAvena <= dineroCaja) {
                                        dineroCaja -= compraAvena;
                                        System.out.println("Compra realizada.");
                                     System.out.println("-------------------------");
                                     System.out.println("\n\n**********************************");
                                     System.out.println("*              FACTURA                *");
                                     System.out.println("**************************************");
                                    System.out.println("producto:");
                                     if (productoC == 2) {
                                        System.out.println("\n" + producto2 + "\nCantidad en kilogramos de:" + producto2 + " : " + kilogramoAvena + " Kg" + "\nTotal a pagar:" + compraAvena + " .Lps");
                                    }  
                                    System.out.println("*************************************");
                                    break;
                                    } else if (compraAvena > dineroCaja) {
                                    int dineroFalta = kilogramoAvena - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja +" .Lps"+"\nUsted desea"+kilogramoAvena+" kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                                } else if(  productoC != 2 ){
                                    System.out.println("proveedor no vende dico producto");
                                    break;
                                }
                                

                                break;
                            
                        default:
                            System.out.println("Proveedor no valido.");
                            break;

                    }
                    break;

                case 2://ventas
                    if (kilogramoAzucar > 0 || kilogramoAvena > 0 || kilogramoTrigo > 0 || kilogramoMaiz > 0) {

                        System.out.println("\n\n**  Aprovecha nuestros descuentos  **");

                       System.out.println("\n***************************************************************************"
                                + "*\nSi el subtotal es mayor o igual que 1000.Lps | Descuento:5% sobre el subtotal    *"+
                                  "------------------------------------------------------------------------------------*"
                                + "*\nSi el subtotal es mayor o igual que 5000.Lps | Descuento:10% sobre el subtotal   *"+
                                  "*-----------------------------------------------------------------------------------*"
                                + "*\nsi el subtotal es menor que 1000.Lps         | No aplica descuento               *"
                                + "*************************************************************************************");

                        int clienteA = 0,
                                clienteB = 0,
                                clienteC = 0;;

                        //precios de venta de los productos
                        int precioAzucar = 30, precioAvena = 25, precioTrigo = 32, precioMaiz = 20;
                        System.out.println("Ingresaste a Ventas\nSelecciona el tipo de cliente:\n1=cliente A\n2=cliente B\n3=cliente C\nSeleccione:");
                        int cliente = lea.nextInt();

                        switch (cliente) {

                            case 1:

                                kilogramoAzucar -= kilogramoAzucarVenta;
                                kilogramoAvena -= kilogramoAvenaVenta;
                                kilogramoTrigo -= kilogramosTrigoVenta;
                                kilogramoMaiz -= kilogramosMaizVenta;
                                double totalPagarAcumulado = 0;
                                //cliente A
                                System.out.println("El cliente A solo puede comprar los siguientes productos:"
                                        + "\nCodigo          producto           precio de venta            kilogramos disponibles");
                                System.out.println("\n1                Azucar               30                         " + kilogramoAzucar);
                                System.out.println("\n2                Avena                25                          " + kilogramoAvena);
                                System.out.println("\n3                Trigo                32                          " + kilogramoTrigo);
                                System.out.println("\n4                Maiz                 20                         " + kilogramoMaiz);
                                System.out.println("seleccione que producto desea comprar");
                                clienteA = lea.nextInt();

                                if (clienteA == 1) {

                                    System.out.println("cuantos kilogramos de azucar desea comprar:");
                                    kilogramoAzucarVenta = lea.nextInt();

                                    if (kilogramoAzucarVenta >= kilogramoAzucar) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantidad de kilogramo deseada");
                                    } else {
                                        kilogramoAzucar -= kilogramoAzucarVenta;
                                        System.out.println("Desea comprar otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                        if (decicion == 1) {
                                            continue;

                                        } else if (decicion == 2) {

                                            double totalPagar = 0;
                                            System.out.println("\n\n************************************************");
                                            System.out.println("\n***FACTURA***");
                                            System.out.println("\nProducto" + producto1);
                                            System.out.println("\nCantidad de kilogramos:" + kilogramoAzucarVenta + " kg");
                                            System.out.println("\nprecio Unitario: 30.Lps");
                                            double subtotalAzucar = kilogramoAzucarVenta * precioAzucar;
                                            System.out.println("\nsubtotal:" + subtotalAzucar + " .Lps");
                                            //descuento
                                            double descuentoAzucar = subtotalAzucar - 0.05;
                                            double descuentoAzucar2 = subtotalAzucar - 0.10;
                                            if (subtotalAzucar >= 1000) {

                                                System.out.println("\nAplica Descuento del 5%\nDescuento:" + descuentoAzucar);
                                                double impuestoAzucar = descuentoAzucar * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoAzucar + " .Lps");
                                                totalPagar = descuentoAzucar + impuestoAzucar;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            } else if (subtotalAzucar > 5000) {

                                                System.out.println("\nAplica Descuento del 10%\nDescuento:" + descuentoAzucar2);
                                                double impuestoAzucar2 = descuentoAzucar * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoAzucar2 + " .Lps");
                                                totalPagar = descuentoAzucar + impuestoAzucar2;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("---------------------------------------------------------------------");
                                            } else {
                                                System.out.println("No aplica descuento");
                                                double impuestoAzucar = subtotalAzucar * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoAzucar + " .Lps");
                                                totalPagar = subtotalAzucar + impuestoAzucar;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
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
                                    if (decicion == 1) {
                                        continue;
                                    } else if (decicion == 2) {
                                        double subtotalAcumulado = 0;
                                        double totalPagar = 0;
                                        System.out.println("\n\n************************************************");
                                        System.out.println("\n***FACTURA***");
                                        System.out.println("\nProducto" + producto2);
                                        System.out.println("\nCantidad de kilogramos:" + kilogramoAvenaVenta + " kg");
                                        System.out.println("\nprecio Unitario: 30.Lps");
                                        double subtotalAvena = kilogramoAvenaVenta * precioAvena;
                                        System.out.println("\nsubtotal:" + subtotalAvena + " .Lps");
                                        //descuento
                                        double descuentoAvena = subtotalAvena - 0.05;
                                        double descuentoAvena2 = subtotalAvena - 0.10;
                                        if (subtotalAvena >= 1000) {

                                            System.out.println("\nAplica Descuento del 5%\nDescuento:" + descuentoAvena);
                                            double impuestoAvena = descuentoAvena * 0.07;
                                            System.out.println("\nimpuesto(7)%:" + impuestoAvena + " .Lps");
                                            totalPagar = descuentoAvena + impuestoAvena;
                                            System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                            System.out.println("-------------------------------------------------------------------");
                                        } else if (subtotalAvena > 5000) {

                                            System.out.println("\nAplica Descuento del 10%\nDescuento:" + descuentoAvena2);
                                            double impuestoAvena2 = descuentoAvena * 0.07;
                                            System.out.println("\nimpuesto(7)%:" + impuestoAvena2 + " .Lps");
                                            totalPagar = descuentoAvena + impuestoAvena2;
                                            System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                            System.out.println("---------------------------------------------------------------------");
                                        } else {
                                            System.out.println("No aplica descuento");
                                            double impuestoAvena = subtotalAvena * 0.07;
                                            System.out.println("\nimpuesto(7)%:" + impuestoAvena + " .Lps");
                                            totalPagar = subtotalAvena + impuestoAvena;
                                            System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                            System.out.println("-------------------------------------------------------------------");
                                        }

                                    }
                                } else if (clienteA == 3) {
                                    System.out.println("\ncuantos kilogramos de Trigo desea comprar");
                                    kilogramosTrigoVenta = lea.nextInt();

                                    if (kilogramosTrigoVenta >= kilogramoTrigo) {
                                        System.out.println("\nNo puede comprar este producto, no hay suficiente cantida de kilogramos deseada ");
                                    } else {
                                        System.out.println("\nDesea comprar otro producto?\n1=si\n2=no");
                                        decicion = lea.nextInt();
                                        if (decicion == 1) {
                                            continue;
                                        } else if (decicion == 2) {
                                            double subtotalAcumulado = 0;
                                            double totalPagar = 0;
                                            System.out.println("\n\n************************************************");
                                            System.out.println("\n***FACTURA***");
                                            System.out.println("\nProducto" + producto3);
                                            System.out.println("\nCantidad de kilogramos:" + kilogramosTrigoVenta + " kg");
                                            System.out.println("\nprecio Unitario: 30.Lps");
                                            double subtotalTrigo = kilogramosTrigoVenta * precioTrigo;
                                            System.out.println("\nsubtotal:" + subtotalTrigo + " .Lps");
                                            //descuento
                                            double descuentoTrigo = subtotalTrigo - 0.05;
                                            double descuentoTrigo2 = subtotalTrigo - 0.10;
                                            if (subtotalTrigo >= 1000) {

                                                System.out.println("\nAplica Descuento del 5%\nDescuento:" + descuentoTrigo);
                                                double impuestoTrigo = descuentoTrigo * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoTrigo + " .Lps");
                                                totalPagar = descuentoTrigo + impuestoTrigo;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            } else if (subtotalTrigo > 5000) {

                                                System.out.println("\nAplica Descuento del 10%\nDescuento:" + descuentoTrigo2);
                                                double impuestoTrigo2 = descuentoTrigo * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoTrigo2 + " .Lps");
                                                totalPagar = descuentoTrigo + impuestoTrigo2;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("---------------------------------------------------------------------");
                                            } else {
                                                System.out.println("No aplica descuento");
                                                double impuestoTrigo = subtotalTrigo * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoTrigo + " .Lps");
                                                totalPagar = subtotalTrigo + impuestoTrigo;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            }

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
                                        if (decicion == 1) {
                                            continue;
                                        } else if (decicion == 2) {
                                            double subtotalAcumulado = 0;
                                            double totalPagar = 0;
                                            System.out.println("\n\n************************************************");
                                            System.out.println("\n***FACTURA***");
                                            System.out.println("\nProducto" + producto4);
                                            System.out.println("\nCantidad de kilogramos:" + kilogramosMaizVenta + " kg");
                                            System.out.println("\nprecio Unitario: 30.Lps");
                                            double subtotalMaiz = kilogramosMaizVenta * precioMaiz;
                                            System.out.println("\nsubtotal:" + subtotalMaiz + " .Lps");
                                            //descuento
                                            double descuentoMaiz = subtotalMaiz - 0.05;
                                            double descuentoMaiz2 = subtotalMaiz - 0.10;
                                            if (subtotalMaiz >= 1000) {

                                                System.out.println("\nAplica Descuento del 5%\nDescuento:" + descuentoMaiz);
                                                double impuestoMaiz = descuentoMaiz * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoMaiz + " .Lps");
                                                totalPagar = descuentoMaiz + impuestoMaiz;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            } else if (subtotalMaiz > 5000) {

                                                System.out.println("\nAplica Descuento del 10%\nDescuento:" + descuentoMaiz2);
                                                double impuestoMaiz2 = descuentoMaiz * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoMaiz2 + " .Lps");
                                                totalPagar = descuentoMaiz + impuestoMaiz2;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("---------------------------------------------------------------------");
                                            } else {
                                                System.out.println("No aplica descuento");
                                                double impuestoMaiz = subtotalMaiz * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoMaiz + " .Lps");
                                                totalPagar = subtotalMaiz + impuestoMaiz;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            }

                                        }
                                    }
                                } else {
                                    System.out.println("\nNO PUEDE COMPRAR DICHO PRODUCTO");
                                    break;
                                }
                                break;
                            case 2:
                                //cliente B
                                kilogramoAzucar -= kilogramoAzucarVenta;
                                kilogramoAvena -= kilogramoAvenaVenta;
                                kilogramoTrigo -= kilogramosTrigoVenta;

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

                                            continue;
                                        } else if (decicion == 2) {

                                            double totalPagar = 0;
                                            System.out.println("\n\n************************************************");
                                            System.out.println("\n***FACTURA***");
                                            System.out.println("\nProducto" + producto1);
                                            System.out.println("\nCantidad de kilogramos:" + kilogramoAzucarVenta + " kg");
                                            System.out.println("\nprecio Unitario: 30.Lps");
                                            double subtotalAzucar = kilogramoAzucarVenta * precioAzucar;
                                            System.out.println("\nsubtotal:" + subtotalAzucar + " .Lps");
                                            //descuento
                                            double descuentoAzucar = subtotalAzucar - 0.05;
                                            double descuentoAzucar2 = subtotalAzucar - 0.10;
                                            if (subtotalAzucar >= 1000) {

                                                System.out.println("\nAplica Descuento del 5%\nDescuento:" + descuentoAzucar);
                                                double impuestoAzucar = descuentoAzucar * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoAzucar + " .Lps");
                                                totalPagar = descuentoAzucar + impuestoAzucar;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            } else if (subtotalAzucar > 5000) {

                                                System.out.println("\nAplica Descuento del 10%\nDescuento:" + descuentoAzucar2);
                                                double impuestoAzucar2 = descuentoAzucar * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoAzucar2 + " .Lps");
                                                totalPagar = descuentoAzucar + impuestoAzucar2;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("---------------------------------------------------------------------");
                                            } else {
                                                System.out.println("No aplica descuento");
                                                double impuestoAzucar = subtotalAzucar * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoAzucar + " .Lps");
                                                totalPagar = subtotalAzucar + impuestoAzucar;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            }

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
                                        continue;
                                    } else if (decicion == 2) {
                                        double subtotalAcumulado = 0;
                                        double totalPagar = 0;
                                        System.out.println("\n\n************************************************");
                                        System.out.println("\n***FACTURA***");
                                        System.out.println("\nProducto" + producto2);
                                        System.out.println("\nCantidad de kilogramos:" + kilogramoAvenaVenta + " kg");
                                        System.out.println("\nprecio Unitario: 30.Lps");
                                        double subtotalAvena = kilogramoAvenaVenta * precioAvena;
                                        System.out.println("\nsubtotal:" + subtotalAvena + " .Lps");
                                        //descuento
                                        double descuentoAvena = subtotalAvena - 0.05;
                                        double descuentoAvena2 = subtotalAvena - 0.10;
                                        if (subtotalAvena >= 1000) {

                                            System.out.println("\nAplica Descuento del 5%\nDescuento:" + descuentoAvena);
                                            double impuestoAvena = descuentoAvena * 0.07;
                                            System.out.println("\nimpuesto(7)%:" + impuestoAvena + " .Lps");
                                            totalPagar = descuentoAvena + impuestoAvena;
                                            System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                            System.out.println("-------------------------------------------------------------------");
                                        } else if (subtotalAvena > 5000) {

                                            System.out.println("\nAplica Descuento del 10%\nDescuento:" + descuentoAvena2);
                                            double impuestoAvena2 = descuentoAvena * 0.07;
                                            System.out.println("\nimpuesto(7)%:" + impuestoAvena2 + " .Lps");
                                            totalPagar = descuentoAvena + impuestoAvena2;
                                            System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                            System.out.println("---------------------------------------------------------------------");
                                        } else {
                                            System.out.println("No aplica descuento");
                                            double impuestoAvena = subtotalAvena * 0.07;
                                            System.out.println("\nimpuesto(7)%:" + impuestoAvena + " .Lps");
                                            totalPagar = subtotalAvena + impuestoAvena;
                                            System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                            System.out.println("-------------------------------------------------------------------");
                                        }

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
                                            continue;
                                        } else if (decicion == 2) {
                                            double subtotalAcumulado = 0;
                                            double totalPagar = 0;
                                            System.out.println("\n\n************************************************");
                                            System.out.println("\n***FACTURA***");
                                            System.out.println("\nProducto" + producto3);
                                            System.out.println("\nCantidad de kilogramos:" + kilogramosTrigoVenta + " kg");
                                            System.out.println("\nprecio Unitario: 30.Lps");
                                            double subtotalTrigo = kilogramosTrigoVenta * precioTrigo;
                                            System.out.println("\nsubtotal:" + subtotalTrigo + " .Lps");
                                            //descuento
                                            double descuentoTrigo = subtotalTrigo - 0.05;
                                            double descuentoTrigo2 = subtotalTrigo - 0.10;
                                            if (subtotalTrigo >= 1000) {

                                                System.out.println("\nAplica Descuento del 5%\nDescuento:" + descuentoTrigo);
                                                double impuestoTrigo = descuentoTrigo * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoTrigo + " .Lps");
                                                totalPagar = descuentoTrigo + impuestoTrigo;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            } else if (subtotalTrigo > 5000) {

                                                System.out.println("\nAplica Descuento del 10%\nDescuento:" + descuentoTrigo2);
                                                double impuestoTrigo2 = descuentoTrigo * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoTrigo2 + " .Lps");
                                                totalPagar = descuentoTrigo + impuestoTrigo2;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("---------------------------------------------------------------------");
                                            } else {
                                                System.out.println("No aplica descuento");
                                                double impuestoTrigo = subtotalTrigo * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoTrigo + " .Lps");
                                                totalPagar = subtotalTrigo + impuestoTrigo;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            }

                                        }
                                    }
                                } else {
                                    System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO");
                                    break;
                                }
                                break;
                            case 3:

                                kilogramoMaiz -= kilogramosMaizVenta;
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
                                            continue;
                                        } else if (decicion == 2) {
                                            double subtotalAcumulado = 0;
                                            double totalPagar = 0;
                                            System.out.println("\n\n************************************************");
                                            System.out.println("\n***FACTURA***");
                                            System.out.println("\nProducto" + producto4);
                                            System.out.println("\nCantidad de kilogramos:" + kilogramosMaizVenta + " kg");
                                            System.out.println("\nprecio Unitario: 30.Lps");
                                            double subtotalMaiz = kilogramosMaizVenta * precioMaiz;
                                            System.out.println("\nsubtotal:" + subtotalMaiz + " .Lps");
                                            //descuento
                                            double descuentoMaiz = subtotalMaiz - 0.05;
                                            double descuentoMaiz2 = subtotalMaiz - 0.10;
                                            if (subtotalMaiz >= 1000) {

                                                System.out.println("\nAplica Descuento del 5%\nDescuento:" + descuentoMaiz);
                                                double impuestoMaiz = descuentoMaiz * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoMaiz + " .Lps");
                                                totalPagar = descuentoMaiz + impuestoMaiz;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            } else if (subtotalMaiz > 5000) {

                                                System.out.println("\nAplica Descuento del 10%\nDescuento:" + descuentoMaiz2);
                                                double impuestoMaiz2 = descuentoMaiz * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoMaiz2 + " .Lps");
                                                totalPagar = descuentoMaiz + impuestoMaiz2;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("---------------------------------------------------------------------");
                                            } else {
                                                System.out.println("No aplica descuento");
                                                double impuestoMaiz = subtotalMaiz * 0.07;
                                                System.out.println("\nimpuesto(7)%:" + impuestoMaiz + " .Lps");
                                                totalPagar = subtotalMaiz + impuestoMaiz;
                                                System.out.println("Total a pagar:" + totalPagar + " .Lps");
                                                System.out.println("-------------------------------------------------------------------");
                                            }

                                        }

                                    }
                                } else {
                                    System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO");
                                    break;
                                }

                                break;

                            //Reporte
                            case 4:
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
