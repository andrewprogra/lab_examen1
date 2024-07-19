/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author carlo
 */
public class Juarez_Carlos_cuotas {
    public static void main(String[] args) {
        //banco calcular la cuota
        
       //llamamos a Scanner
       Scanner leer=new Scanner (System.in);
        //prestamo otorgado al cliente
        System.out.println("Ingrese su prestamo otrogado");
        int prestamo= leer.nextInt();
        
//plazo de pago en meses
        System.out.println("Ingrese su plazo de pago");
        int plasoMeses=leer.nextInt();
       
//interes  mensual aplicado al prestamo
        System.out.println("interes mensual aplicado");
        double interes = leer.nextDouble();
        
       
//total a pagar
        double prestamoSimple= prestamo*interes*plasoMeses;    
        
//comision por cuota
        System.out.println("ingrese la comision por cuota");
        int comision= leer.nextInt();
        
//porcentaje de seguro mensual
        System.out.println("ingrese porcentaje de seguro");
        double porcentajeSeguro=leer.nextDouble();
       
//couta de pago mensual
        double cuotaPagoMensual = prestamoSimple/plasoMeses ;
        
//mostrar resultado
        System.out.println("****CUOTAS MESUALES****"+
                          "\n couta de pago mensual:"+cuotaPagoMensual+"HNL"+
                           "\n Total a pagar:"+prestamoSimple+"HNL" );
    }
}
