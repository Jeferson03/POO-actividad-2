package Ejercicio_14;

import java.util.Scanner;
public class Ejercicio_Resuelto_14 {

    
    public static void main(String[] args) {
        double ven1, ven2, ven3, sven1, sven2, sven3;
        Scanner ee = new Scanner(System.in);
        System.out.println("Importe de ventas del primer departamento:");
        ven1 = ee.nextDouble();
        System.out.println("Salario de los vendedores del primer departamento:");
        sven1 = ee.nextDouble();
        System.out.println("Importe de ventas del segundo departamento:");
        ven2 = ee.nextDouble();
        System.out.println("Salario de los vendedores del segundo departamento:");
        sven2 = ee.nextDouble();
        System.out.println("Importe de ventas del tercer departamento:");
        ven3 = ee.nextDouble();
        System.out.println("Salario de los vendedores del tercer departamento:");
        sven3 = ee.nextDouble();       
    Salario_Pagar pagu = new Salario_Pagar(ven1, ven2, ven3, sven1, sven2, sven3);           
        }   
}
