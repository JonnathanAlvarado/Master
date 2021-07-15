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
public class Recursos {
    private String Mensaje; 
    
    private int edad;
    
    private int entero1, entero2; 
    
    private int lista;
    
    
  
    public void setMensaje(String Mensaje){
       this.Mensaje = Mensaje; 
    }
    
    public String getMensaje(){
     return Mensaje;    
    }
    
      public void sedEdad(int edad){
   this.edad = edad; 
    }
    
    public String getEdad(){
        String m = null;
        if (edad < 21){
            m = "Menor de edad";
        }
        if(edad >= 21){
         m = "Mayor de edad";   
        }
        return m; 
    }
    
    public void setEnteros(int entero1, int entero2){
        this.entero1 = entero1;
        this.entero2 = entero2;
    }
    
    public int getEnteros (){
        return (this.entero1*this.entero2);
    }
    
       public void setLista(int lista){
        this.lista = lista;
        
    }
    
    public int getLista (){
        int k=0;
        for(int i=0; i<this.lista+1; i++){
            k=i;
            System.out.println(k);
            }
        
        return (k);
    } 
    
    
}
