package parte1_actividad2;

import java.util.Scanner;
public class Ejercicio_Resuelto_12 {
    
    public static void main(String[] args) {
        double horas, valor, pago, exc1, exc2;
        String nombre;
        Scanner m = new Scanner(System.in);       
        System.out.println("Nombres: ");
        nombre = m.nextLine();
        System.out.println("Horas trabajadas: ");
        horas = m.nextDouble();
        System.out.println("Valor hora normal de trabajo:");
        valor = m.nextDouble();
        if (horas <= 40){
            pago = valor * horas;
            System.out.println("Nombre del trabajador: " + nombre);
            System.out.println("Su pago es de: " + pago);
        }else if (horas > 40 && horas <=48){
            exc1 = horas - 40;
            horas = 40;
            pago = horas * valor + (exc1 * (valor*2));
            System.out.println("Nombre del trabajador: " + nombre);
            System.out.println("Su pago es de: " + pago);                                           
        } else  {
           exc2 = horas - 48;
           exc1 = horas - 40 - exc2;
           horas = 40;
           pago = horas * valor + (exc1 * (valor*2)) + (exc2 * (valor*3));
           System.out.println("Nombre del trabajador: " + nombre);
           System.out.println("Su pago es de: " + pago);
            }
        }
            
    }
    

