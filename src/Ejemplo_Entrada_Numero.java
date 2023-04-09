import  javax.swing.*;
import  java.lang.*;
public class Ejemplo_Entrada_Numero {
    public static void main(String[] args) {
        String num1=JOptionPane.showInputDialog("introduce numero:");
                double num2=Double.parseDouble(num1);
             System.out.print("la reiz de  " + num2 + "es");
                  System.out.printf("%1.2f",Math.sqrt(num2));

    }
}
