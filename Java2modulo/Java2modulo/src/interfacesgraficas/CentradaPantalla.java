package aplicasionesgraficas;

import javax.swing.*;
import java.awt.*;

public class CentradaPantalla {
    public static void main(String[] args) {
       MarcoCentrado mimarco =new MarcoCentrado();
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       mimarco.setVisible(true);

    }
}
class MarcoCentrado extends JFrame {
    public MarcoCentrado(){
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
         Dimension tamanoPantalla=mipantalla.getScreenSize();
         int alturaPantalla=tamanoPantalla.height;
         int anchoPantalla=tamanoPantalla.width;
         setSize(anchoPantalla/2 , alturaPantalla/2 );
             setLocation(anchoPantalla/4 , alturaPantalla/4);
            setTitle("pantalla centrada");
             Image miIcono=mipantalla.getImage("imagen.png");
             setIconImage(miIcono);
    }
}