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
        int kilogramoAzucar = 0, kilogramoAvena = 0, kilogramoTrigo = 0, kilogramoMaiz = 0;
        int kilogramoAzucarVenta = 0, kilogramoAvenaVenta = 0, kilogramosTrigoVenta = 0, kilogramosMaizVenta = 0;
        int totalventa = 0, totalcompra = 0;
        String producto1 = "Azucar";
        String producto2 = "Avena";
        String producto3 = "Trigo";
        String producto4 = "Maiz";

        do {
            // Crear el menú
            System.out.println("\nBienvenido a la Tienda Juarez\n\n****Menu****");
            System.out.println("1 = Abrir caja\n2 = Ventas\n3 = Compras\n4 = Reportes\n5 = Cierre de caja\n6 = Salir del programa");
            System.out.print("\nQue desea hacer?: ");
            opcionMenu = lea.nextInt();
           
            switch (opcionMenu) {
                case 1: // Abrir caja
                   
                    System.out.println("\nAbriste la caja.");
                    System.out.println("***************************");
                    System.out.println("*La caja cuenta con:      *\n*  " + dineroCaja + " .Lps                 *");
                    System.out.println("***************************");
                    System.out.print("\nIngrese dinero(ingrese 0 si desea volver al menu): ");
                    cantidad = lea.nextDouble();
                   

                    
                   
                    if (cantidad == 0) {
                        break;
                    } else if (cantidad < 0) {
                        while (cantidad < 0) {
                            System.out.print("\n\nLa caja no acepta numeros negativos. Por favor, ingresa un valor valido: ");
                            cantidad = lea.nextDouble();
                        } }
                    dineroCaja += cantidad;
                    System.out.println("\n***************************");
                    System.out.println("*La caja cuenta con:      *\n*  " + dineroCaja + " .Lps                 *");
                    System.out.println("***************************");
                    break;

                case 3: // Compras
                    if (dineroCaja <= 0) {
                        System.out.println("\nALERTA!Debe ingresar dinero en la caja para entrar a esta opcion.");
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
                            System.out.print("Ingrese el codigo del producto que desea comprar(ingrese 0 para volver al menu): ");
                            int productoA = lea.nextInt();

                            if (productoA == 0) {
                                break;
                            } else if (productoA == 1) {
                                System.out.print("\nCuantos kilogramos de azucar desea comprar? ");
                                kilogramoAzucar += lea.nextInt();
                                compraAzucar = kilogramoAzucar * precio1;

                                 if (compraAzucar > dineroCaja) {
                                    int dineroFalta = kilogramoAzucar - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea" + kilogramoAzucar + " kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            } else if (productoA == 2) {
                                System.out.print("\n¿Cuantos kilogramos de avena desea comprar? ");
                                kilogramoAvena = lea.nextInt();
                                compraAvena = kilogramoAvena * precio2;

                               if (compraAvena > dineroCaja) {
                                    int dineroFalta = kilogramoAvena - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea" + kilogramoAvena + " kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            }
                            else  if (productoA == 3) {
                                System.out.print("\n¿Cuantos kilogramos de trigo desea comprar? ");
                                kilogramoTrigo += lea.nextInt();
                                compraTrigo = kilogramoTrigo * precio3;

                                if (compraTrigo > dineroCaja) {
                                    int dineroFalta = kilogramoTrigo - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea" + kilogramoTrigo + " kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            }
                            else if (productoA == 4) {
                                System.out.print("\n¿Cuantos kilogramos de maiz desea comprar? ");
                                kilogramoMaiz += lea.nextInt();
                                compraMaiz = kilogramoMaiz * precio4;
                                  
                                 if (compraMaiz > dineroCaja) {
                                    int dineroFalta = kilogramoMaiz - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea" + kilogramoMaiz + " kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            } else if (productoA != 1 || productoA != 2 || productoA != 3 || productoA != 4) {
                                System.out.println("proveedor no vende dico producto");
                                continue;
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
                            System.out.print("\nIngrese el codigo del producto que desea comprar(ingrese 0 para volver al menu): ");
                            int productoB = lea.nextInt();

                            if (productoB == 0) {
                                break;
                            } else if (productoB == 2) {
                                System.out.print("\n¿Cuantos kilogramos de avena desea comprar? ");
                                kilogramoAvena += lea.nextInt();
                                compraAvena = kilogramoAvena * precio2;

                               if (compraAvena > dineroCaja) {
                                    int dineroFalta = kilogramoAvena - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea" + kilogramoAvena + " kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            } else if (productoB == 3) {
                                System.out.print("\n¿Cuantos kilogramos de trigo desea comprar? ");
                                kilogramoTrigo += lea.nextInt();
                                compraTrigo = kilogramoTrigo * precio3;

                                 if (compraTrigo > dineroCaja) {
                                    int dineroFalta = kilogramoTrigo - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps\nUsted desea" + kilogramoTrigo + " kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            } else if (productoB != 1 || productoB != 2 || productoB != 3 || productoB != 4) {
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

                               if (compraAvena > dineroCaja) {
                                    int dineroFalta = kilogramoAvena - dineroCaja;
                                    System.out.println("\n!No se puede pagar compra¡.\n\nLa caja cuenta con:" + dineroCaja + " .Lps" + "\nUsted desea" + kilogramoAvena + " kg\nDinero nesesario para realizar la compra:" + dineroFalta + " .lps");
                                    break;
                                }
                            } else if (productoC != 2) {
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

                        System.out.println("\n**  Aprovecha nuestros descuentos  **");

                        System.out.println("\n***********************************************************************************");
                        System.out.println("*Si el subtotal es mayor o igual que 1000.Lps  | Descuento:5% sobre el subtotal    *");
                        System.out.println("-----------------------------------------------|-----------------------------------*");
                        System.out.println("*Si el subtotal es mayor o igual que 5000.Lps | Descuento:10% sobre el subtotal   *");
                        System.out.println("*----------------------------------------------|-----------------------------------*");
                        System.out.println("*si el subtotal es menor que 1000.Lps         | No aplica descuento               *");
                        System.out.println("************************************************************************************");

                        int clienteA = 0,
                                clienteB = 0,
                                clienteC = 0;;

                        //precios de venta de los productos
                        int precioAzucar = 30, precioAvena = 25, precioTrigo = 32, precioMaiz = 20;
                        System.out.println("\n\nIngresaste a Ventas\nSelecciona el tipo de cliente:\n1=cliente A\n2=cliente B\n3=cliente C\nSeleccione:");
                        int cliente = lea.nextInt();

                        switch (cliente) {

                            case 1:

                                kilogramoAzucar -= kilogramoAzucarVenta;
                                kilogramoAvena -= kilogramoAvenaVenta;
                                kilogramoTrigo -= kilogramosTrigoVenta;
                                kilogramoMaiz -= kilogramosMaizVenta;

                                //cliente A
                                do {
                                    System.out.println("\n******************************************************************************************");
                                    System.out.println("                                  El cliente A                                            "
                                            + "-------------------------------------------------------------------------------------------"
                                            + " Codigo     |     producto      |     precio de venta      |      kilogramos disponibles ");
                                    System.out.println("-------------|-------------------|--------------------------|-----------------------------");
                                    System.out.println("    1        |      Azucar       |        30                |          " + kilogramoAzucar);
                                    System.out.println("    2        |      Avena        |        25                |          " + kilogramoAvena);
                                    System.out.println("    3        |      Trigo        |        32                |          " + kilogramoTrigo);
                                    System.out.println("    4        |      Maiz         |        20                |          " + kilogramoMaiz);
                                    System.out.println("*******************************************************************************************");
                                    System.out.println("\nseleccione que producto desea comprar(Ingrese 0 para volver al menu)");
                                    clienteA = lea.nextInt();

                                    if (clienteA == 0) {
                                        break;
                                    } else if (clienteA == 1) {

                                        System.out.println("cuantos kilogramos de azucar desea comprar:");
                                        kilogramoAzucarVenta = lea.nextInt();

                                        if (kilogramoAzucarVenta >= kilogramoAzucar) {
                                            System.out.println("\nNo puede comprar este producto, no hay suficiente cantidad de kilogramo deseada");
                                        } else {
                                            kilogramoAzucar -= kilogramoAzucarVenta;
                                            System.out.println("Desea comprar otro producto?\n1=si\n2=no");
                                            decicion = lea.nextInt();

                                           

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
                                            } 
                                        }

                                    } else {
                                        System.out.println("\nNO PUEDE COMPRAR DICHO PRODUCTO");
                                        break;
                                    }
                                } while (decicion == 1);
                                break;
                            case 2:
                                //cliente B
                                do {
                                    kilogramoAzucar -= kilogramoAzucarVenta;
                                    kilogramoAvena -= kilogramoAvenaVenta;
                                    kilogramoTrigo -= kilogramosTrigoVenta;
                                    System.out.println("\n******************************************************************************************");
                                    System.out.println("**                            El cliente B                                                **");
                                    System.out.println("-------------------------------------------------------------------------------------------");
                                    System.out.println(" Codigo     |    producto      |     precio de venta       |     kilogramos disponibles");
                                    System.out.println("------------|------------------|---------------------------|--------------------------------");
                                    System.out.println("   1         |      Azucar      |          30               |        " + kilogramoAzucar);
                                    System.out.println("   2         |      Avena       |          25               |        " + kilogramoAvena);
                                    System.out.println("   3         |      Trigo       |          32               |        " + kilogramoTrigo);
                                    System.out.println("--------------------------------------------------------------------------------------------");
                                    System.out.println("seleccione que producto desea comprar");
                                    clienteB = lea.nextInt();

                                    if (clienteB == 1) {

                                        System.out.println("\ncuantos kilogramos de azucar desea comprar:");
                                        kilogramoAzucarVenta = lea.nextInt();

                                        if (kilogramoAzucarVenta >= kilogramoAzucar) {
                                            System.out.println("\nNo puede comprar este producto, no hay suficiente cantidad de kilogramo deseada");
                                        } else {
                                            System.out.println("\nDesea comprar otro producto?\n1=si\n2=no");
                                            decicion = lea.nextInt();
                                            if (decicion == 2) {

                                                continue;
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
                                        if (decicion == 1) {
                                            continue;
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
                                            } 
                                        }
                                    } else {
                                        System.out.println("NO PUEDE COMPRAR DICHO PRODUCTO");
                                        break;
                                    }
                                } while (decicion == 1);
                                break;
                            case 3:
                                do {
                                    kilogramoMaiz -= kilogramosMaizVenta;
                                    System.out.println("\n******************************************************************************************");
                                    System.out.println("*                                El cliente C*                                              ");
                                    System.out.println("--------------------------------------------------------------------------------------------");
                                    System.out.println(" Codigo    |      producto      |     precio de venta     |       kilogramos disponibles");
                                    System.out.println("------------|--------------------|-------------------------|--------------------------------");
                                    System.out.println("   4        |        Maiz        |          20             |            " + kilogramoMaiz);
                                    System.out.println("---------------------------------------------------------------------------------------------");
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
                                            
                                            }
                                        }

                                    } else {
                                        System.out.println("!NO PUEDE COMPRAR DICHO PRODUCTO¡");
                                        break;
                                    }
                                } while (decicion == 1);
                                break;

                            //Reporte
                            case 4:
                                System.out.println("*********************************************");
                                System.out.println("*          Reportes                *");
                                System.out.println("*Dinero actual en caja:" + dineroCaja + " .Lps *");

                                break;
                        }

                    } else {

                        System.out.println("\nprimero debe de comprar producto para ingresar a esta opcion");
                        break;
                    }

                    break;

                case 6:
                    System.out.println("\nMuchas Gracias por usar la Tienda Juarez,Vuelva pronto");
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (opcionMenu != 6);
    }
}
