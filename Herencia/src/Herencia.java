
import herencia.Linea;
import herencia.circulo;
import herencia.cuadrado;
import herencia.formas;
import herencia.Triangulo;
import java.util.Scanner;

/**
 *
 * @author INVER. HERNANDEZ
 */

public class Herencia {


  
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        cuadrado C= new cuadrado(entrada);
        circulo Ci= new circulo(entrada);
        Linea li= new Linea(entrada);
        Triangulo tri= new Triangulo(entrada);
        formas For = new formas();
        
        System.out.println("forma 1");
        C.Obtener_Informacion();
        System.out.println("Su area es: "+C.Area());
        
        System.out.println("forma 2");
        Ci.Obtener_Informacion();
        System.out.println("su radio es igual : "+Ci.radio());
        
        System.out.println("forma 3");
        li.Obtener_Informacion();
        System.out.println("Largo de la linea es: "+li.Linea());
        
        
        System.out.println("forma 4");
        tri.Obtener_Informacion();
       System.out.println("El area del rectangulo es: "+tri.Area()); 
       
       
    }
}
