/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juarez_carlos_e1;

import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author carlo
 */
public class Juarez_Carlos_E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //llamamos a Scanner
        Scanner lea = new Scanner(System.in);

        int opcion = 0;
        
   
        do {
            System.out.println("\nMenu de examen");
            System.out.println("1=piramide\n2=El mayor\n3=Venta de cajas\n4=Caracteres vocales\n5=Salir");
            System.out.println("ingrese opcion:");
            opcion = lea.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\ningresaste a piramide");
                  
                    System.out.println("ingrese cantidad de filas que desea tener la piramide:");
                    int filas = lea.nextInt();
                    
                int numero=1;
                    for (int i = 1; i <=filas; i ++) {
                        int suma = 0;
                        for (int j = 0; j <i; j++) {
                            System.out.print(numero +" ");
                        suma+=numero;
                        numero+=2;
                        }
                       System.out.println("= "+suma);
                            
                    }
                        
                    

                    break;
                case 2:
                  
                    System.out.println("\nhas ingresado a El mayor");
                   
                   String detenerse;
                   int numeroMayor=0;
                   int numeros=0;
                   int contador=0;
                   int numeropromedio=0;
                   int sumanumeros=0;
                   do{
                     System.out.println("ingrese numeros");
                      numeros=lea.nextInt();
                     sumanumeros+=numeros;
                      contador++;
                     
                       System.out.println("si gustas deneterte ingresa 'No' ingrese otra letra para continuar:");
                       detenerse=lea.next().toLowerCase();
                       
                     
                   }while(!detenerse.equalsIgnoreCase("no"));
                    
                   if(numeros>numeroMayor){
                   numeroMayor=numeros;
                       System.out.println("numero mayor:"+numeroMayor);
                       
                      numeropromedio=sumanumeros/contador;
                      
                       System.out.println("numero promedio:"+numeropromedio);
                       
                       
                   }

                    break;

                case 3:
                    System.out.println("ingresaste a Venta de caja");
                    break;

                case 4:
                    System.out.println("ingresaste a Caracteres vocales");

                    break;
                case 5:
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("ingrese una opcion valida");

            }
        } while (opcion != 5);
  
            
           
    
       
    }
}
