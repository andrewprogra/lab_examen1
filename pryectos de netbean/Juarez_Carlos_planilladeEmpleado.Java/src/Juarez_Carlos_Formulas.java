/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Juarez_Carlos_Formulas {
    public static void main(String[] args){
        //llamamos a scanner
        Scanner lea= new Scanner (System.in);
        
// mostrar ejercicio a
        System.out.println("ejercicio A");
        System.out.println("ingrese numerador 1");
        double numerador1=lea.nextInt();
        System.out.println("ingrese denominador 1");
        double denominador1=lea.nextInt();
        System.out.println("ingrese numerador 2");
        double numerador2=lea.nextInt();
        System.out.println("ingrese denominador 2");
        double denominador2=lea.nextInt();
        
//resultado del ejercicio A
     double  resultadoA= (numerador1/denominador1)+(numerador2/denominador2);
      System.out.println("el resultado del ejercicio A es:"+resultadoA);
        
        
        //ejercicio B
        System.out.println("\nejercicio B");
        
   //mostrar ejercicio B
      System.out.println("ingrese numerador 1");
      double numerador1B=lea.nextInt();
      System.out.println("ingrese 1denominador 1");
      double denominador1B=lea.nextInt();
      System.out.println("ingrese 2denominador 1");
      double denominador1_2B=lea.nextInt();
      System.out.println("ingrese 1numerador 2");
      double numerador2_1B=lea.nextInt();
      System.out.println("ingrese 2numerador 2");
      double numerador2_2B=lea.nextInt();
      System.out.println("ingrese 3numerador 2");
      double numerador2_3B=lea.nextInt();
      System.out.println("ingrese denominador 2");
       double denominador2B=lea.nextInt();
       
       //resultado del ejercicio B
     double resultadoB= (numerador1B/(denominador1B-denominador1_2B))-((numerador2_1B*numerador2_2B*numerador2_3B)/denominador2B);
       System.out.println("la respuesta del ejercicio B es :"+resultadoB);
   
    
    
    //ejercicio C
    
     System.out.println("\n ejercicio C");
    System.out.println("ingrese numerador 1C");
    double numerador1C=lea.nextInt();
    System.out.println("ingrese denominador 1C");
   double denominador1C=lea.nextInt();
    System.out.println("ingrese numerador 2C");
    double numerador2C=lea.nextInt();
    
    //resultado del ejercicio C
    double resultadoC= numerador1C/(denominador1C+numerador2C);
    
     System.out.println("El resultado del ejercicio C es:"+resultadoC);
     
     
     //ejercicio D
     
     System.out.println("\n ejercicio D");
     
     System.out.println("ingrese numerador 1D");
     double numerador1D=lea.nextInt();
     System.out.println("ingrese numerador 2D");
     double numerador2D=lea.nextInt();
       System.out.println("ingrese denominador 2D");
      double denominador2D=lea.nextInt();
       
       //resultado del ejercicio D
    double resultadoD= numerador1D+(numerador2D/denominador2D);
    
     System.out.println("El resultado del ejercicio D es:"+resultadoD);
     
     
     //resultado del ejercicio E
      System.out.println("\n ejercicio E");
      
       System.out.println("ingrese numerador 1E");
       double numerador1E=Math.pow(lea.nextInt(),2);
       
     
     
     
    
    }
    
      
                
   }
