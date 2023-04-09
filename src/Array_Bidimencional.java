import javax.swing.*;
import  java.lang.*;

public class Array_Bidimencional {
    public static void main(String[] args) {

        int numero_columnas=Integer.parseInt(JOptionPane.showInputDialog("numero columnas"));
        int numero_filas=Integer.parseInt(JOptionPane.showInputDialog("numero filas"));

        int [][] matrix= new int[numero_filas][numero_columnas];

        for (int i = 0; i < numero_filas ; i++) {//numero de filas
           // matrix[i]=Integer.parseInt(JOptionPane.showInputDialog("numero"));
            for (int j = 0; j < numero_columnas; j++) {//numero de columnas
                matrix[i][j]=Integer.parseInt(JOptionPane.showInputDialog("numero"));
            }
        }
        for (int []fila:matrix) {
            System.out.println();
            for (int z:fila) {
                System.out.print(z + " ");
            }
        }




   }
}
