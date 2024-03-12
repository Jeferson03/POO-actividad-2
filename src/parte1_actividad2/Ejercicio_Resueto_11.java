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
       Numero_Mayor mayor1 = new Numero_Mayor(num1, num2, num3);              
    }
    
}
