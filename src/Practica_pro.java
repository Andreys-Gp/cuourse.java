
import  java.util.*;

public class Practica_pro  {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);//constructor
        System.out.println("Introduce tu edad:");
        int edad=entrada.nextInt();

        if (edad>18) {
            System.out.println("eres nayor de edad:" + edad);
            System.exit(0);

        } else  {

            System.out.println("eres menor de edad:" + edad);

        }


    }
}
/*public class Practica_pro {
}*/
