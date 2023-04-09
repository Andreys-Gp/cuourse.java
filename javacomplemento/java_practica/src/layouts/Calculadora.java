
package layouts;

import javax.print.event.PrintJobAttributeListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {
              MarcoCalculadora mimarco=new MarcoCalculadora();
              mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              mimarco.setVisible(true);
    }
}

class MarcoCalculadora extends JFrame {
     public MarcoCalculadora(){
         setTitle("Calculadora");
         setBounds(500,300,450,300);
         LaminaCalculadora milamina=new LaminaCalculadora();
         add(milamina);
         //pack();


     }
}
 class LaminaCalculadora extends JPanel {
    public LaminaCalculadora(){
        principio=true;
        setLayout(new BorderLayout());
         pantalla = new JButton("0");
        pantalla.setEnabled(false);
        add(pantalla, BorderLayout.NORTH);

             milamina2=new JPanel();
        milamina2.setLayout(new GridLayout(4,4));
      /* JButton boton1=new JButton("1");
       milamina2.add(boton1);
       JButton boton2=new JButton("2");
       milamina2.add(boton2);
       JButton boton3=new JButton("3");
       milamina2.add(boton3);
          */
        ActionListener insertar=new InsertarNumero();
        ActionListener orden=new AccionOrden();
        ponerboton("7",insertar);
        ponerboton("8",insertar);
        ponerboton("9",insertar);
        ponerboton("/",orden);
        ponerboton("4",insertar);
        ponerboton("5",insertar);
        ponerboton("6",insertar);
        ponerboton("*",orden);
        ponerboton("1",insertar);
        ponerboton("2",insertar);
        ponerboton("3",insertar);
        ponerboton("-",orden);
        ponerboton("0",insertar);
        ponerboton(".",insertar);
        ponerboton("=",orden);
        ponerboton("+",orden);
        add(milamina2, BorderLayout.CENTER);

        ultimaOperacion="=";

    }
    //agregar botones
    private void ponerboton(String rotulo, ActionListener oyente) {
        JButton boton=new JButton(rotulo);
        boton.addActionListener(oyente);
           milamina2.add(boton);
    }

    private class InsertarNumero implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          String entrada=e.getActionCommand();
          if (principio){
              pantalla.setText("");
              principio=false;
          }
          pantalla.setText(pantalla.getText()+entrada);
        }

    }

    private  class AccionOrden implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String opetacion=e.getActionCommand();
            calcular(Double.parseDouble(pantalla.getText()));
            ultimaOperacion=opetacion;
             principio=true;

        }
        public void calcular(double x){
           if (ultimaOperacion.equals("+")){
               resultado +=x;
           } else if (ultimaOperacion.equals("-")) {
               resultado-=x;

           } else if (ultimaOperacion.equals("=")) {
                resultado=x;
           } else if (ultimaOperacion.equals("*")) {
               resultado*=x;
           } else if (ultimaOperacion.equals("/")) {
               resultado/=x;
           }
           pantalla.setText(""+resultado);
        }
    }
    private JPanel milamina2;
      private JButton pantalla;
      private boolean principio;
      private double resultado;
      private String ultimaOperacion;
 }
