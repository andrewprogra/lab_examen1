/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juarez_carlos_controll;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Juarez_carlos_controll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //llamamos a Scanner
        Scanner lea=new Scanner(System.in);
       
        //creamos el menu
        
        System.out.println("seleccione que ejercicio deseea realizar:"+
                            "\n1=Cadena"+
                            "\n2=Notas"+
                            "\n3=CLases"+
                            "\nSeleccione:");
            
         int opcion=lea.nextInt();
        
                   
     switch(opcion){
          case 1:
              System.out.println("**ejrecicio de Cadena**");
              break;
          case 2:
              System.out.println("**Ejercicio de Notas**");
              break;
          case 3:
              System.out.println("**Ejercicio de Calses**");
              break;
          default:
              System.out.println("debes de elegir una opcion, intenta de nuevo.");
         }
                
     
                //caso 1- cadena
                if(opcion==1){
                    System.out.println("ingrese culaquier caracter del teclado:");
                    String cadena=lea.next();
                 
                 
                                                   
          }
    //caso 2 - Notas
     int contador= 0;
     double sumanotas=0.0;
     double promedio=0;
     double notaMayor=0;
     double notaMenor=100;
     
    
            while(opcion==2){
                System.out.println("Ingresar cantidad de notas:");
                int teclado=lea.nextInt();
                
                 
               
          while(contador++<teclado){
              
                System.out.println("Nota#"+contador+":");
                  double notas=lea.nextDouble();
                  
           
                  
                   sumanotas+=notas;
        while(notas<notaMenor){
          notaMenor=notas;
          }
          while(notas>notaMayor){
            notaMayor=notas;
            }
                   
                  while(notas<=-1 || notas>=101){
                    System.out.println("Nota#"+contador+":");
                        notas=lea.nextDouble();
                      
                  }                             
          }
          
         
       promedio=sumanotas/teclado;
       System.out.printf("promedio: %.2f%%\n",promedio);
       
       System.out.println("\nNota menor:"+notaMenor+
                         "\nNota mayor:"+notaMayor);
       
       
          System.out.println("\nseleccione que ejercicio deseea realizar:"+
                            "\n1=Cadena"+
                            "\n2=Notas"+
                            "\n3=CLases"+
                            "\nSeleccione:");
            
          opcion=lea.nextInt();
        
                   
     switch(opcion){
          case 1:
              System.out.println("**ejrecicio de Cadena**");
              break;
          case 2:
              System.out.println("**Ejercicio de Notas**");
              break;
          case 3:
              System.out.println("**Ejercicio de Calses**");
              break;
          default:
              System.out.println("debes de elegir una opcion, intenta de nuevo.");
         }
         } 
            // opcion 3- Clases
            while(opcion==3){
                    System.out.println("**Instituto de enseñanza ingles**"+
                                        "\ningrese dai de la semana en que se encuentra:"+
                                          "\n1=Lunes"+
                                          "\n2=Martes"+
                                          "\n3=Miercoles"+
                                          "\n4=Jueves"+
                                          "\n5=Viernes"+
                                           "\nSeleccion:");
                    opcion=lea.nextInt();
              
            //seleccion de lunes
                    if(opcion==1){
                        System.out.println("En este dia se dicta el nivel Inicial"+
                                            "ingrese fecha actual:");
                        int fecha=lea.nextInt();
                        
                     int dia=0;
                     String diasemana;
                     int mes=0;
               
                     if(diasemana==lunes||martes||miercoles||jueves||viernes){
                     }
                     
                        
                        
                        
                    }
                    
            
            }
            
      }
            
            
            }   
             
              
            
            
    
    
    
    
    
    
    
        
    
    

