import javax.swing.*;

public class Array_string {
    public static void main(String[] args) {

        /*String [] paises=new String [8];
        paises[0]="españa";
        paises[1]="colombia";
        paises[2]="venezuela";
        paises[3]="nucaragua";
        paises[4]="argentina";
        paises[5]="polonia";
        paises[6]="israel";
        paises[7]="egypt"; */
        /*for (int i=0; i<paises.length; i++) {
            System.out.println(" posicion " + i + " pais " + paises[i]);
        }*/

        //bucle for mejorado

        int numero =Integer.parseInt(JOptionPane.showInputDialog("introduce numero datos paises"));

         String [] paises=new String[numero];
        for (int i = 0; i < numero; i++) {
            paises[i]=JOptionPane.showInputDialog("introduce pais");
            
        }
        for (String elementos:paises) {
            System.out.println(" pais "+ elementos);
        }  
        
        

        /*for (String elementos:paises) {
                  System.out.println(elementos);
        }*/

    }
}
