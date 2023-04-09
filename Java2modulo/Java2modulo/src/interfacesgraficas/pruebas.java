package interfacesgraficas;

import java.awt.*;

public class pruebas {
    public static void main(String[] args) {
        //saver los tipos de las letras de fuentes
        String [] nombresDeFuentes= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        for ( String nombredelafuente: nombresDeFuentes ) {
            System.out.println(nombredelafuente);
        }
    }
}
