
package practicasena;
import  java.util.*;

public class EntradaDatos {
    public static void main(String[] args) {
        int a,b;
        //sacanner contructor
        Scanner entrada = new Scanner(System.in);
        System.out.println("introduzca numeros ");
           a=entrada.nextInt();
           b=entrada.nextInt();
        if (a>b) {
            System.out.println("el numero mayor es \n:" + a);
        }
        System.out.println("el numero mayor es \n: " + b );
    }
}
