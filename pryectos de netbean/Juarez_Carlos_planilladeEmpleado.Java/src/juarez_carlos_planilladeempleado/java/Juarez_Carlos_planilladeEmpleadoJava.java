/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juarez_carlos_planilladeempleado.java;
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Juarez_Carlos_planilladeEmpleadoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     //planilla de Empleado
        //llamar la calse Scanner
        Scanner lea= new Scanner (System.in);
               //nombre del Empleado
            System.out.println("Ingrese su nombre");
            String nombreEmpleado = lea.next( );
            //Horas trabajadas mensualmente
            System.out.println("Ingrese las horas de trabajo mensual");
            int horasMensual= lea.nextInt();
            //tarifa por hora
            System.out.println("Ingrese la tarifa recibida por hora");
            int tarifaHora = lea.nextInt();
            //Calcular salario del empleado
           int pagoMensual=tarifaHora * horasMensual;
           double pagoSemanal = pagoMensual / 4;
           
           //mostrar resultado en pantalla
            System.out.println("*****BOLETA DEl Empleado*****"+
                            "\nNombre del empleado:"+nombreEmpleado+
                             "\n Hora de trabajo Mensual:" +horasMensual+
                             "\n Tarifa por hora:" +tarifaHora+
                             "\n Salario del empelado semanal:"+pagoSemanal);
                                       
            
            
    }
    
}
