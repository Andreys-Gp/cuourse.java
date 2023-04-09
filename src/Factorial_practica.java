import  javax.swing.*;

public class Factorial_practica {

    public static void main(String[] args) {

        int resultado=1;
        int numero=Integer.parseInt(JOptionPane.showInputDialog("introduca numero"));

        for (int i = numero; i >0 ; i--) {
            resultado=resultado*i;
        }
        System.out.println("facroeial numero:" + numero + "resultado:" + resultado);


    }
}
