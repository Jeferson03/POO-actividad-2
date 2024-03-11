package Ejercicio_13;


import java.util.Scanner;
public class Ejercicio_Resuelto_13 {
    
    public static void main(String[] args) {
    double desc, compra;
    String bola;
    Scanner aa = new Scanner(System.in);
    System.out.println("Valor de la compra: ");
    compra = aa.nextDouble();
    aa.nextLine();
    System.out.println("Color de la bolita: ");
    bola = aa.nextLine();
    if ("blanca".equals(bola)){
        System.out.println("El valor a pagar es: " + compra);
    }else if("verde".equals(bola)){
        desc = compra * 0.1;
        compra = compra - desc;
        System.out.println("El valor a pagar es: " + compra);               
    } else if("amarilla".equals(bola)){
        desc = compra * 0.25;
        compra = compra - desc;
        System.out.println("El valor a pagar es: " + compra);                
    } else if ("azul".equals(bola)){
        desc = compra * 0.5;
        compra = compra - desc;
        System.out.println("El valor a pagar es: " + compra);        
    } else {
        compra = 0;
        System.out.println("El valor a pagar es: " + compra);                
    }    
    
    }
    
}
