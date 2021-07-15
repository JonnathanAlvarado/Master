/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo3;

/**
 *
 * @author INVER. HERNANDEZ
 */
public class Modulo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Futbolista Valores = new Futbolista();
        
        Valores.setNombre("Leonel Messi");
        System.out.println("Nombre del Futbolista: " +Valores.getNombre());
        Valores.setEquipo("Barcelona");
        System.out.println("Equipo Actual: " +Valores.getEquipo());
        Valores.setPosicion("Delantero");
        System.out.println("posicion: " +Valores.getPosicion());
        Valores.setEdad(33);
        System.out.println("Edad: " +Valores.getEdad()+ " años");
        
    }
    
}
