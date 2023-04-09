package practicasena;
import java.util.*;
public class Parcial {
    public static void main(String[] args) {
        double ntfinal,parcial,parci2,paci3;

        Scanner datos= new Scanner(System.in);
        //entrada datos
        System.out.println("introduzna nota parcial 1: ");
        parcial= datos.nextDouble();
        System.out.println("introduzna nota parcial 2:");
        parci2= datos.nextDouble();
        System.out.println("introduzna nota parcial 3:");
        paci3= datos.nextDouble();
        /*System.out.println("introduzna nota examen final:");
        ntfinal= datos.nextDouble();*/

        ntfinal=(parcial*0.25)+(parci2*0.35)+(paci3*0.4);

        if (ntfinal >= 3.5){
            System.out.println("su estado final aprobado ");
            System.out.println("su nota sinal es: " + ntfinal  );
        }
         else {
             System.out.println("su estado desaprovado: \n " + "nota final: "+ ntfinal);
        }





    }
}
