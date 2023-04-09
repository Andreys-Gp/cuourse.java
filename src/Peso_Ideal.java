import javax.swing.*;
import java.lang.*;

public class Peso_Ideal {
    public static void main(String[] args) {

        String genero = "";
        do {
            genero = JOptionPane.showInputDialog("introduce tu genero H/M");

        } while (genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);

        int pesoideal=0;
        int altura=Integer.parseInt(JOptionPane.showInputDialog("introduce tu altura en cm:"));
        if (genero.equalsIgnoreCase("H")){
            pesoideal = altura-110;
        }
        else if (genero.equalsIgnoreCase("M")){
            pesoideal= altura-120;
        }
        System.out.println("tu peso ideal:" + pesoideal + "kg");

    }}