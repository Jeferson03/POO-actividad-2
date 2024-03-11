package parte1_actividad2;

import java.util.Scanner;
public class Ejercicio_Resuelto_14 {

    
    public static void main(String[] args) {
        double ven1, ven2, ven3, sven1, sven2, sven3, vent;
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
        vent = ven1 + ven2 + ven3;
        if (ven1 > vent*0.33 ){
            sven1 = sven1 + (sven1*0.2);
            System.out.println("Salario a pagar primer departamento: " + sven1); 
            System.out.println("Salario a pagar segundo departamento: " + sven2);
            System.out.println("Salario a pagar tercer departamento: " + sven3);
        } else if (ven2 > vent*0.33){
            sven2 = sven2 + (sven2*0.2);
            System.out.println("Salario a pagar primer departamento: " + sven1); 
            System.out.println("Salario a pagar segundo departamento: " + sven2);
            System.out.println("Salario a pagar tercer departamento: " + sven3);
        } else {
            sven3 = sven3 + (sven3*0.2);
            System.out.println("Salario a pagar primer departamento: " + sven1);        
            System.out.println("Salario a pagar segundo departamento: " + sven2);
            System.out.println("Salario a pagar tercer departamento: " + sven3);
                    
        }
            
        }
    
}
