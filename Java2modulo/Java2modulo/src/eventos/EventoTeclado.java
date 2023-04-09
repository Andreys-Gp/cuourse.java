package eventos;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclado {
    public static void main(String[] args) {
        MarcoConteclas mimarco=new MarcoConteclas();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class  MarcoConteclas extends JFrame{
    public MarcoConteclas() {
        setVisible(true);
        setBounds(700,300,600,450);
        EventoDeTeclado tecla=new EventoDeTeclado();
        addKeyListener (tecla);
    }
}
  class EventoDeTeclado implements KeyListener {


      @Override
      public void keyTyped(KeyEvent e) {

      }

      @Override
      public void keyPressed(KeyEvent e) {
          int codigo=e.getKeyCode();
          System.out.println(codigo);

      }

      @Override
      public void keyReleased(KeyEvent e) {
          char letra=e.getKeyChar();
          System.out.println(letra);

      }
  }
