/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio_13;


public class Suerte_Con_Descuento {
        double desc;
public Suerte_Con_Descuento(double compra, String bola){
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
