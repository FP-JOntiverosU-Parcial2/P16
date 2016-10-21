/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema16;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1,numero2,numero3,m;
        numero1=solicitarDato("1");   //se introducen los datos
        numero2=solicitarDato("2");
        numero3=solicitarDato("3");
        m=mostrarMayor(numero1,numero2,numero3);
        mensajeSalida();
        
  

    }
    public static int solicitarDato(String d){  
        int dato;
        Scanner teclado= new Scanner(System.in);
        System.out.println("Introduce el numero " + d);
        dato= teclado.nextInt();
        return dato ;
    }
    
    public static int mostrarMayor(int numero1, int numero2, int numero3){     // se hace la operacion
        if (numero1>numero3)
            if (numero1>numero2)
                System.out.println("El numero " + numero1 + " es mayor");
            else
                System.out.println("El numero " + numero2 + " es mayor");
             else if(numero3>numero2)
                System.out.println("El numero " + numero3 + " es mayor");
            else { 
                System.out.println("El numero " + numero2 + " es mayor");
            }
        return numero1;
    }
    
     public static void mensajeSalida(){
        System.out.println("Gracias por usar el programa"); //se agradece
        System.exit(0);//Sale del programa
     }
}

