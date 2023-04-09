package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class pruevaEventos {
    public static void main(String[] args) {
  MarcoBotones mimarco=new MarcoBotones();
  mimarco.setVisible(true);
  mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class  MarcoBotones extends JFrame {
    //panel principal dibujo
    public MarcoBotones(){
        setTitle("botones y eventos");
        setBounds(700,300,500,300);
        laminabotones2 milamina=new laminabotones2();
        add(milamina);
    }
}

class LaminaBotones extends JPanel implements ActionListener {
    //jpanel odjetos sobre el panel
   JButton botonazul=new JButton("azul");
   JButton botonamarillo=new JButton("amarillo");
   JButton botonrrojo=new JButton("rrojo");

   public LaminaBotones(){
       add(botonamarillo);
       add(botonrrojo);
       add(botonazul);

       botonrrojo.addActionListener(this);
       botonamarillo.addActionListener(this);
       botonazul.addActionListener(this);
   }
   public void actionPerformed(ActionEvent e){
       Object botonPulsado=e.getSource();
       if (botonPulsado == botonazul) {
           setBackground(Color.CYAN);
       } else if (botonPulsado==botonamarillo) {
           setBackground(Color.yellow);
       } else if (botonPulsado==botonrrojo) {
           setBackground(Color.red);
       }

   }
   
}
