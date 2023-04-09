package interfacesgraficas;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class PruebaImagenes {
    public static void main(String[] args) {
        MarcoImagen mimarco=new MarcoImagen();
        mimarco.setVisible(true);
          mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class  MarcoImagen extends JFrame{
    public MarcoImagen(){
        setTitle("marcon con imagen");
        setBounds(750,300,300,200);
        LaminaConImagen milamina=new LaminaConImagen();
        add(milamina);
    }
}
class LaminaConImagen extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //file me dice donde esta la imagen
        File miimagen=new File("C:\\Users\\Brayan\\Pictures\\Screenshot_5.png");
        try {
            // me lee donde esta imagen ubicacion string
            imagen= ImageIO.read(miimagen);
        }
        catch (Exception e) {
            System.out.println("nose encuentra el odjeto multimedia");
        }
        g.drawImage(imagen,5,5,null );
    }
    private Image imagen;
}

