package aplicasionesgraficas;

import javax.swing.*;

public class PruebaGrafico {
    public static void main(String[] args) {
        MarcoConDibujos migrafico=new MarcoConDibujos();
        migrafico.setVisible(true);
        migrafico.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class MarcoConDibujos extends JFrame {
    public MarcoConDibujos(){
        setTitle("prueba dibujo");
        setSize(400,400);
    }
}
