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
public class Futbolista {
    private String nombre, equipo, posicion; 
    
    private int edad;
    
    public void setNombre(String nombre){
       this.nombre = nombre; 
    }
    
    public String getNombre(){
     return nombre;    
    }
    
     public void setEquipo(String equipo){
       this.equipo = equipo; 
    }
    
    public String getEquipo(){
     return equipo;    
    }
    
     public void setPosicion(String posicion){
       this.posicion = posicion; 
    }
    
    public String getPosicion(){
     return posicion;    
    }
    
      public void setEdad(int edad){
       this.edad = edad; 
    }
    
    public int getEdad(){
     return edad;    
    }
}
