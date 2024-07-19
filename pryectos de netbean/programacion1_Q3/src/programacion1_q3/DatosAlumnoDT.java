/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion1_q3;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class DatosAlumnoDT {
    public static void main(String[]args){
        //Datos de Alumno desde el teclado
        //llamar la clase Scanner
        Scanner lea=new Scanner(System.in);
        System.out.print("Ingresar numero de cuenta:");
        int cuentaAlumno=lea.nextInt();
        System.out.println("ingresar nombre de alumno:");
        String nombreAlumno=lea.next();
        System.out.println("ingresar apellido de alumno:");
        String apellidoAlumno=lea.next();
        System.out.println("ingresar nota fina#l:");
        double nota1=lea.nextDouble();
        System.out.println("ingresar nota final#2");
        double nota2=lea.nextDouble();
        
        double promedio=((nota1+nota2)/2);
        
        System.out.println("*****BOLETA DE ALUMNO*****"+
                           "\n Numero de cuenta:"+cuentaAlumno+
                            "\n Alumno: "+nombreAlumno+" "+apellidoAlumno+
                            "\n Promedio: "+promedio+" %");
    }
}
