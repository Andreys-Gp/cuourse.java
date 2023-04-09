import  java.util.*;

public class Adivina_numero {
    public static void main(String[] args) {
        int aleatorio=(int)Math.random()*100;
        Scanner entrada=new Scanner(System.in);

        // int numero,intentos;
       int intentos=0;
       int numero=0;
        while(numero!=aleatorio){
            intentos++;
            System.out.println("introduce numero:");
            numero=entrada.nextInt();

            if (aleatorio<numero){
                System.out.println("mas bajo");
            }
            else
                if (aleatorio>numero){
                    System.out.println("mas alto");
                }

          } System.out.println("correptoo, lo has logrado en:" + intentos + "veces");

    }
}
