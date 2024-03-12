package parte1_actividad2;

public class Numero_Mayor {
    
    public Numero_Mayor(int nume1, int nume2, int nume3){
         if (nume1 > nume2 && nume1 > nume3){
           System.out.println(nume1 + " es el mayor de los tres");
       }else if (nume2>nume1 && nume2>nume3){
           System.out.println(nume2+" es el mayor de los tres");
       }else if (nume3>nume2 && nume3>nume1){
           System.out.println(nume3 + " es el mayor de los tres");
       }
    }   
}
