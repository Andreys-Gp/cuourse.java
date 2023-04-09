import java.util.*;
import java.lang.*;
public class EntadaDatos {
    public static void main(String[] args) {
         Scanner entrada=new Scanner(System.in); // constructor
         System.out.println("Introduce tu nombre completo :");
         String nombre_usuario=entrada.nextLine();

         System.out.println("introduce tu edad :");
         int edad=entrada.nextInt();
         System.out.println("tu nombre es: " + nombre_usuario + " tu edad es: " + edad + "años" );  
    }
}
