import javax.swing.*;
import java.lang.*;
public class EntradaEje2 {
    public static void main(String[] args) {

         String nombre_usuario=JOptionPane.showInputDialog("introdusce tu nombre :");
           //System.out.println(nombre_usuario);
            String edad_usuario=JOptionPane.showInputDialog("introduce tu edad:");
            int edad=Integer.parseInt(edad_usuario);
            System.out.println("nombre:" + nombre_usuario + " edad: " + edad);


    }
}
