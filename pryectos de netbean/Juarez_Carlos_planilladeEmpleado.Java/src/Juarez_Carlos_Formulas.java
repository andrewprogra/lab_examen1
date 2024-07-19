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
        int numerador1=lea.nextInt();
        System.out.println("ingrese denominador 1");
        int denominador1=lea.nextInt();
        System.out.println("inrgese numerador 2");
        int numerador2=lea.nextInt();
        System.out.println("ingrese denominador 2");
        int denominador2=lea.nextInt();
        
//resultado del ejercicio A
     double  resultadoA= (numerador1/denominador1)+(numerador2/denominador2);
      System.out.println("el resultado del ejercicio A es:"+resultadoA);
        
        
        //ejercicio B
        System.out.println("ejercicio B");
        
   //mostrar ejercicio B
      System.out.println("ingrese numerador 1");
      int numerador1B=lea.nextInt();
      System.out.println("ingrese 1denominador 1");
      int denominador1B=lea.nextInt();
      System.out.println("ingrese 2denominador 1");
      int denominador1_2B=lea.nextInt();
      System.out.println("ingrese 1numerador 2");
      int numerador2_1B=lea.nextInt();
      System.out.println("ingrese 2numerador 2");
      int numerador2_2B=lea.nextInt();
      System.out.println("ingrese 3numerador 2");
      int numerador2_3B=lea.nextInt();
      System.out.println("ingrese denominador 2");
       int denominador2B=lea.nextInt();
       
       //resultado del ejercicio B
      double resultadoB= (numerador1B/(denominador1B-denominador1_2B))-((numerador2_1B*numerador2_2B*numerador2_3B)/denominador2B);
       System.out.println("la respuesta del ejercicio B es :"+resultadoB);
   
    
    
    //ejercicio C
    
    
    
    }
    
      
                
   }
