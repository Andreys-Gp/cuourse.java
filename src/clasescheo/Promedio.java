package clasescheo;
import javax.swing.*;
import java.lang.*;
public class Promedio {
    public static void main(String[] args) {

        // toma de datos

        double num_jornad=Integer.parseInt(JOptionPane.showInputDialog("ingrese numero jornadas:"));
        String name=JOptionPane.showInputDialog("ingrese su nombre jugador: ");
        double num_goles=Integer.parseInt(JOptionPane.showInputDialog("igrese numero goles:"));

        //promedio

        double prom=(num_goles+num_jornad)/2;

        System.out.println(" jugador: " + name +"\n" + "numero de jornadas: " + num_jornad + "\n" + "numero de goles: " + num_goles +  "\n" + "su promedio es: " + prom);



    }
}
