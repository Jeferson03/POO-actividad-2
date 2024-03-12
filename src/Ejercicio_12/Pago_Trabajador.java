package Ejercicio_12;

public class Pago_Trabajador {
        double pago, exc1, exc2;        ;
        public Pago_Trabajador(double horas, double valor,  String nombre){
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
    

