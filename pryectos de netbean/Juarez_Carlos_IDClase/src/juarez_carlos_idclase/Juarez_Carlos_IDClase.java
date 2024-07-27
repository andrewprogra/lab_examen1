/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juarez_carlos_idclase;
import java.util.Scanner;

public class Juarez_Carlos_IDClase {

  
      
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("\nOperacion Ternaria:"+
                       "\nEs un operador condicional,este oprador se usa con frecuencia "+
                       "\ncomo atajo y mayor simplicidad para la instruccion if");
     
        
       //llamamos a Scanner
       Scanner lea=new Scanner (System.in);
      
      //escenario #1 
       System.out.println("\nEscenario 1:"+
                          "\nnumero1=8"+
                          "\nnumero2=10");
      int y=8;
      int x=10;
      int mayor;
      
     mayor=(x>y)?x:y;
     System.out.println("\nel mayor de los dos numeros es el "+mayor);
     
     
 
    //escenaio #2
    System.out.println("\nEscenario 2:");
   
    int mayorNum;
    
    System.out.println("ingrese numero:");
    int ingreso1=lea.nextInt();
    
    System.out.println("\ningrese numero:");
     int ingreso2=lea.nextInt();
    
    
    mayorNum=(ingreso1>ingreso2)?ingreso1:ingreso2;
    System.out.println("\nel mayor de los dos numeros es el "+mayorNum);
        
    
    //escenario #3
    System.out.println("\nEscenario 3:");
    
   
    int resultado;
    
    System.out.println("\nQue operacion desea realizar?:"+
                        "\n1=suma"+
                        "\n2=resta"+
                        "\nseleccion:");
    int op=lea.nextInt();
    
    System.out.println("ingrese numero:");
    int num1=lea.nextInt();
    
    System.out.println("ingrese numero:");
    int num2=lea.nextInt();
    
    resultado = (op==1)?num1+num2:num1-num2;
    
    System.out.println("\nel resultado es:"+resultado);
        
    }
    
}
