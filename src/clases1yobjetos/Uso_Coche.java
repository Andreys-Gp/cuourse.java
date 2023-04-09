package clases1yobjetos;

import javax.xml.transform.stream.StreamSource;
import javax.swing.*;

public class Uso_Coche {
    public static void main(String[] args) {

       /* Coche Renault =new Coche(); //instancio da clase:ejemplar de clase

          // System.out.printf("este coche tiene " + Renault.ruedas + "  ruedas." );
        System.out.println(Renault.dime_largo()); */

        Coche micoche= new Coche();
        micoche.establece_color(JOptionPane.showInputDialog("introduce color"));
        System.out.println(micoche.dime_color());
        //datos generales metodo getter
        System.out.println(micoche.dime_datos_generales());
      //asientos
        micoche.configura_asientoss(JOptionPane.showInputDialog("Tiene acientos de cuero?"));
        System.out.println(micoche.dime_asientos());
          //aclimatizador
        micoche.boolean_climatisador(JOptionPane.showInputDialog("Tiene aclimatizador?"));
              System.out.println(micoche.dime_aclimatizador());
                //PESO COCHE gett+setter
        System.out.println(micoche.dime_peso_coche());
                      //precio coche  gett setter
           System.out.println("El precio del coche es: " + micoche.precio_coche() );

    }
}
