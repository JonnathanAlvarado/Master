/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasintaxisprimerospasos;

import java.util.Scanner;

/**
 *
 * @author INVER. HERNANDEZ
 */
public class Inciso2 {
    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
        int  valor1, valor2;
        System.out.println("Ingrese Primer valor");
        valor1 = Leer.nextInt();
        System.out.println("Ingrese Segundo Valor");
        valor2= Leer.nextInt();
        
        System.out.println("La suma  es: " + (valor1+valor2));
        System.out.println("La Resta es: " + (valor1-valor2));
        System.out.println("La Multiplicacion es: " + (valor1*valor2));
        System.out.println("La Division es: " + (valor1/valor2));
        
    }
    
}
