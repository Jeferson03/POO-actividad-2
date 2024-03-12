
package Ejercicio_14;

public class Salario_Pagar {
    double vent;
public Salario_Pagar(double ven1, double ven2, double ven3, double sven1, double sven2, double sven3){
   vent = ven1 + ven2 + ven3;
           if (ven1> vent*0.33){
            sven1 = sven1 + (sven1*0.2);
            System.out.println("Salario a pagar primer departamento: " + sven1);
        } else{
            System.out.println("Salario a pagar primer departamento: " + sven1);

        } 
         if (ven2> vent*0.33){
            sven2 = sven2 + (sven2*0.2);
            System.out.println("Salario a pagar segundo departamento: " + sven2);
        } else{
            System.out.println("Salario a pagar segundo departamento: " + sven2);

        } 
          if (ven3> vent*0.33){
            sven3 = sven3 + (sven3*0.2);
            System.out.println("Salario a pagar segundo departamento: " + sven3);
        } else{
            System.out.println("Salario a pagar segundo departamento: " + sven3);

        }
 }
}
