package eventos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class PruebaAcciones {
    public static void main(String[] args) {
        MarcoAccion mimarco=new MarcoAccion();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }
}
class MarcoAccion extends JFrame {
    public MarcoAccion(){
        setTitle("prueba de acciones ");
        setBounds(600,350,600,300);
         PanelAccion lamina= new PanelAccion();
         add(lamina);
    }
}



  class PanelAccion extends JPanel {
     public PanelAccion(){

         AccionColor accionamarillo=new AccionColor("amarillo",
               new ImageIcon("\"C:\\Users\\Brayan\\Pictures\\Screenshot_6.png\""),
                 Color.yellow);
         AccionColor accionrrojo= new AccionColor("rrojo",
                 new ImageIcon("\"C:\\Users\\Brayan\\Pictures\\Screenshot_6.png\""),
                 Color.red);
         AccionColor accionazul= new AccionColor(
                 "azul",
                 new ImageIcon("\"C:\\Users\\Brayan\\Pictures\\Screenshot_6.png\""),
                 Color.CYAN
                 );
         add(new JButton(accionamarillo));
         add(new JButton(accionrrojo));
         add(new JButton(accionazul));

         /* (JButton botonamarillo= new JButton("amarillo");
         JButton botonrrojo= new JButton(   "boton rrojo");
         JButton botonazul=new JButton("boton azul");
         add(botonamarillo);
         add(botonazul);
         add(botonrrojo);*/

     }

      private class AccionColor extends AbstractAction{
          public AccionColor(String nombre, Icon icono, Color colorboton){
              putValue(Action.NAME,nombre);
              putValue(Action.SMALL_ICON,icono);
              putValue(Action.SHORT_DESCRIPTION,"poner la lamina de color " + nombre);
              putValue("color de fondo ",colorboton);
          }

          @Override
          public void actionPerformed(ActionEvent e) {
              Color c=(Color) getValue("color de fondo");
               setBackground(c);

          }
      }

  }
