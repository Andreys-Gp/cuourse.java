package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruevaEventos2 {
    public static void main(String[] args) {
            MarcoBotones2 mimarco=new MarcoBotones2();
            mimarco.setVisible(true);
            mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}


class  MarcoBotones2 extends JFrame {
    public MarcoBotones2(){
        setTitle("botones y eventos");
        setBounds(700,300,500,300);
        laminabotones2 milamina=new laminabotones2();
        add(milamina);
    }
}


class laminabotones2 extends JPanel  {
    //panel de principal para dibujar
    JButton botonazul=new JButton("azul");
    JButton botonamarillo=new JButton("amarillo");
    JButton botonrrojo=new JButton("rrojo");

    public laminabotones2(){
        //accionador
        add(botonamarillo);
        add(botonrrojo);
        add(botonazul);

        //instancia clase oyente action listener implementa
        ColorFondo amarillo=new ColorFondo(Color.yellow);
        ColorFondo rrojo=new ColorFondo(Color.red);
        ColorFondo azul=new ColorFondo(Color.blue);

        botonrrojo.addActionListener(rrojo);
        botonamarillo.addActionListener(amarillo);
        botonazul.addActionListener(azul);
    }

    private class  ColorFondo implements ActionListener {
        //oyente
        public ColorFondo(Color c){
            colorDefondo=c;
        }
        public void actionPerformed(ActionEvent e) {
            setBackground(colorDefondo);
        }
        private Color colorDefondo;
    }
}


