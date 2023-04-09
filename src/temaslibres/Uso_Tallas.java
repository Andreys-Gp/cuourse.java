package temaslibres;

import java.util.Scanner;

public class Uso_Tallas {
    //enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
    enum Talla{
        MINI("S"),MEDIANO("M"),GRANDE("L"),MUY_GRANDE("XL");
        private Talla(String abreviatura){
            this.abreviatura=abreviatura;

        }

        public  String dameAbreviatura(){
            return abreviatura;
        }
        private String abreviatura;
    }

    public static void main(String[] args) {
      /*  Talla s=Talla.MINI;
        Talla m=Talla.MEDIANO;
        Talla l=Talla.GRANDE;
        Talla xl=Talla.MUY_GRANDE; */

        Scanner entrada=new Scanner(System.in);
        System.out.println("Escribe una talla de rropa: ");
        String entradaDatos=entrada.next().toUpperCase();

        Talla la_talla=Enum.valueOf(Talla.class,entradaDatos);

         System.out.println("la talla es: " + entradaDatos);
         System.out.println(" abreviatura: " + la_talla.dameAbreviatura());




    }
}
