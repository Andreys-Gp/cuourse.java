package layouts;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AplicacionBotonesRadio {
    public static void main(String[] args) {
        MArcoRadio mimarco=new  MArcoRadio();
         mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MArcoRadio extends JFrame{
    public MArcoRadio (){
        setVisible(true);
        setBounds(550,300,500,350);
        LaminaBotones milamina=new LaminaBotones();
        add(milamina);
    }
}

  class  LaminaBotones extends JPanel {
    public LaminaBotones() {
        setLayout(new BorderLayout());
        texto = new JLabel("todo lo puedo en cristo que me fortalece");
        texto.setFont(new Font("Serif", Font.PLAIN, 12));
        add(texto, BorderLayout.CENTER);
        lamina_botones=new JPanel();
        migrupo=new ButtonGroup();
         colocarBotones("pequeño",false,10);
         colocarBotones("mediano",true,12);
         colocarBotones("grande",false,15);
         colocarBotones("muy grande",false,19);
         add(lamina_botones,BorderLayout.SOUTH);

         /* ButtonGroup migrupo=new ButtonGroup();
         boton1=new JRadioButton("pequeño",false);
         boton2=new JRadioButton("mediano",true);
         boton3=new JRadioButton("grande",false);
         boton4=new JRadioButton("muy grande",false);

         JPanel laminaRadio=new JPanel();

         Evento_radio mievento=new Evento_radio();

          boton1.addActionListener(mievento);
          boton2.addActionListener(mievento);
          boton3.addActionListener(mievento);
          boton4.addActionListener(mievento);

         migrupo.add(boton1);
         migrupo.add(boton2);
         migrupo.add(boton3);
         migrupo.add(boton4);

         laminaRadio.add(boton1);
         laminaRadio.add(boton2);
         laminaRadio.add(boton3);
         laminaRadio.add(boton4);
         add(laminaRadio, BorderLayout.SOUTH);

          */
    }

    //------------metodo.........
    public void colocarBotones(String nombre, boolean seleccionado, final int tamagno) {
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        migrupo.add(boton);
        lamina_botones.add(boton);
        ActionListener mievento = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
            }
        };
        boton.addActionListener(mievento);
    }


   /* private class Evento_radio implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            // detectas si an dado click en un boton
            if(e.getSource()==boton1){
           // System.out.println("presionastes el botoon 1")
                texto.setFont(new Font("Serif", Font.PLAIN,10));
            }    else if (e.getSource()==boton2){
                texto.setFont(new Font("Serif", Font.PLAIN,12));
            } else if (e.getSource()==boton3) {
                texto.setFont(new Font("Serif", Font.PLAIN,14));
        } else if (e.getSource()==boton4) {
                texto.setFont(new Font("Serif", Font.PLAIN,17));
            }
            }

    */




    private JLabel texto;
    private JRadioButton boton1,boton2,boton3,boton4;
    private ButtonGroup migrupo;
    private JPanel lamina_botones;

  }