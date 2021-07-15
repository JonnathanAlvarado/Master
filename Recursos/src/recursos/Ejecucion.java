/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursos;

/**
 *
 * @author INVER. HERNANDEZ
 */
public class Ejecucion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Recursos Datos;
        Datos = new Recursos();
        
        Datos.setMensaje("Programación Orientada a Objetos 2021");
        System.out.println(Datos.getMensaje());
        
        Datos.sedEdad(20);
         System.out.println(Datos.getEdad());
         
        Datos.setEnteros(2, 4);
        System.out.println("La multiplicacion de los enteros es: " + Datos.getEnteros());
        
        Datos.setLista(5);
        Datos.getLista();
        
    }
    
}
