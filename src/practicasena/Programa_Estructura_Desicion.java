package practicasena;
import javax.swing.*;
import java.awt.*;
import java.util.*;

public class Programa_Estructura_Desicion {
    public static void main(String[] args) {

            //programa de nacionalidad
        String name =JOptionPane.showInputDialog("introduce tu nombre:");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("introduce tu edad:"));
        int document=Integer.parseInt(JOptionPane.showInputDialog("introduce tu numero de documento:"));


                // numero cedula cuenta con 10 digitos
        String documento=Integer.toString(document);
       // System.out.println(documento.length());
        boolean x=false;
        if (documento.length() == 10) {
                x=true;
        }
         do {


             if (edad>=18){
                 System.out.println("Cumple mayoria de edad" );
                 System.out.println("nombre" + name  + " identificacion " + document + " edad " + edad);
             }
             else {
                 System.out.println("Cumple menoria de edad " );
                 System.out.println( "nombre " + name  + " identificacion " + document);
             }



         } while (x=true);

         if (documento.length() != 10) {
             System.out.println("no ciudadano" );
             System.out.println( "nombre " + name + " identificacion " + document);

        }





    }
}
