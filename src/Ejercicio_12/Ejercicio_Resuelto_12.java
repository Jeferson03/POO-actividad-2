package Ejercicio_12;

import java.util.Scanner;
public class Ejercicio_Resuelto_12 {
    
    public static void main(String[] args) {
        double horas, valor;
        String nombre;
        Scanner m = new Scanner(System.in);       
        System.out.println("Nombres: ");
        nombre = m.nextLine();
        System.out.println("Horas trabajadas: ");
        horas = m.nextDouble();
        System.out.println("Valor hora normal de trabajo:");
        valor = m.nextDouble();
        Pago_Trabajador pagos = new Pago_Trabajador(horas, valor, nombre);
     }            
 }
    

