package parte1_actividad2;

import java.util.Scanner;
public class Ejercicio_Resueto_11 {

    public static void main(String[] args) {
        int num1, num2, num3;
       Scanner nn = new Scanner(System.in);
       System.out.println("Digite el primer numero: ");
       num1 = nn.nextInt();
       System.out.println("Digite el segundo numero: ");
       num2 = nn.nextInt();
       System.out.println("Digite el tercer numero: ");
       num3 = nn.nextInt();
       if (num1 > num2 && num1 > num3){
           System.out.println(num1 + " es el mayor de los tres");
       } else if (num2>num1 && num2>num3){
           System.out.println(num2+" es el mayor de los tres");
       }else if (num3>num2 && num3>num1){
           System.out.println(num3 + " es el mayor de los tres");
       }
       
    }
    
}
