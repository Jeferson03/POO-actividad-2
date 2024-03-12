package Ejercicio_13;


import java.util.Scanner;
public class Ejercicio_Resuelto_13 {
    
    public static void main(String[] args) {
    double compra;
    String bola;
    Scanner aa = new Scanner(System.in);
    System.out.println("Valor de la compra: ");
    compra = aa.nextDouble();
    aa.nextLine();
    System.out.println("Color de la bolita: ");
    bola = aa.nextLine();
    Suerte_Con_Descuento crack = new Suerte_Con_Descuento(compra, bola);
        
    }
    
   }
