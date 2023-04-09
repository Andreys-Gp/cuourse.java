package layoutcourse;

import javax.swing.*;
import java.awt.*;

public class LayoutCalculadora {
    public static void main(String[] args) {
     MarcoCalculadora mimarco=new MarcoCalculadora();
     mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     mimarco.setVisible(true);

    }
}
 class MarcoCalculadora extends JFrame {
    public MarcoCalculadora(){
        setTitle("Marco Calculadora");
        setBounds(500,300,450,300);
        LaminaCalculadora milamina=new LaminaCalculadora();
        add(milamina);
    }
 }

  class LaminaCalculadora extends JPanel {
    public LaminaCalculadora (){
        setLayout(new BorderLayout());
        JButton pantall=new JButton("0");
        //desavilita el boton
        pantall.setEnabled(false);
        add(pantall,BorderLayout.NORTH);

        //lamina 2 botones
        JPanel  milamina2=new JPanel();
        milamina2.setLayout(new GridLayout(4,4));

        //botones
       /* JButton boton1 =new JButton("1");
        milamina2.add(boton1);
        JButton boton2 =new JButton("2");
        milamina2.add(boton2);
        JButton boton3 =new JButton("3");
        milamina2.add(boton3);
        JButton boton4=new JButton("4");
        milamina2.add(boton4);

        JButton boton5 =new JButton("5");
        milamina2.add(boton5);
        JButton boton6 =new JButton("6");
        milamina2.add(boton6);
        JButton boton7 =new JButton("7");
        milamina2.add(boton7);
        JButton boton8=new JButton("8");
        milamina2.add(boton8);


        JButton boton9 =new JButton("9");
        milamina2.add(boton9);
        JButton botonmenos =new JButton("-");
        milamina2.add(botonmenos);
        JButton botonmultiplicar =new JButton("*");
        milamina2.add(botonmultiplicar);
        JButton botonsumar=new JButton("+");
        milamina2.add(botonsumar);

        JButton botoncoma =new JButton(",");
        milamina2.add(botoncoma);
        JButton botonbarra =new JButton("/");
        milamina2.add(botonbarra);
        JButton botonpunto =new JButton(".");
        milamina2.add(botonpunto);
        JButton botoncomilla=new JButton(";");
        milamina2.add(botoncomilla);


        */

        ponerBotones("7");
        ponerBotones("8");
        ponerBotones("9");
        ponerBotones("/");
        //ponerBotones("/");
        ponerBotones("4");
        ponerBotones("5");
        ponerBotones("6");
        ponerBotones("*");
        ponerBotones("1");
        ponerBotones("2");
        ponerBotones("3");
        ponerBotones("-");

        ponerBotones("0");
        ponerBotones(".");
        ponerBotones("=");
        ponerBotones("+");



        add(milamina2,BorderLayout.CENTER);
    }

     private void ponerBotones (String rotulo ){
        JButton boton=new JButton(rotulo);
        milamina2.add(boton);

     }
     private JPanel milamina2;
  }
