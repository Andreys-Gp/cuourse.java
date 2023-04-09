import  javax.swing.*;
import  java.util.*;

public class AreasPrac {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        System.out.println("elige una opcion \n1: Cuadrado \n2:  Rectangulo \n3: Triangulo \n4:  Circulo   ");
        int figura=entrada.nextInt();

         switch (figura){

             case 1:
                 int lado=Integer.parseInt(JOptionPane.showInputDialog("introduce lado:"));
                 System.out.println("Area del cuadrado:"  + Math.pow(lado,2));
                 break;
                 case 2:
                     int bae=Integer.parseInt(JOptionPane.showInputDialog("introduce base:"));
                     int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce altura:"));
                             System.out.println("Area Rectangulo:" + bae*altura);
                             break;
                             case 3:
                                 int base=Integer.parseInt(JOptionPane.showInputDialog("introduce base:"));
                                 int altura2=Integer.parseInt(JOptionPane.showInputDialog("introduce altura:"));
                                 System.out.println("Area Triangulo:" + (base*altura2)/2);
                               break;
                               case 4:
                                   int radio=Integer.parseInt(JOptionPane.showInputDialog("introduce   radio:"));
                                           System.out.printf("%1.2f", Math.PI*(Math.pow(radio,2)));
                                        break;



         }

    }
}
