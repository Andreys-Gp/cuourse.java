package aplicasionesgraficas;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {
    public static void main(String[] args) {
      marcoConTexto mimarco=new marcoConTexto();
      mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
class marcoConTexto extends JFrame {
    public  marcoConTexto(){
        setVisible(true);
        setSize(600,450);
        setLocation(400,200);
        setTitle("marco con texto");
        lamina miLamina =new lamina();
        add(miLamina);
    }
}
//sobre esctirura clases invocacion metodos
class  lamina extends JPanel{
    public void paintComponent (Graphics g){
        g.drawString("Estamos aprendiendo Swing",100,100);
    }
}
