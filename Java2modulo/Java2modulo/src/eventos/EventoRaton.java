package eventos;

import javax.management.MalformedObjectNameException;
import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventoRaton {
    public static void main(String[] args) {
             MarcoRaton mimarco=new MarcoRaton();
             mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class  MarcoRaton extends JFrame {
    public MarcoRaton() {
        setVisible(true);
        setBounds(700, 300, 600, 450);

        EventosRaton raton=new EventosRaton();
        addMouseListener(raton);

    }
}

  /* class EventosRaton implements MouseListener {
     @Override
     public void mouseClicked(MouseEvent e) {
         System.out.println("has echo click");

     }

     @Override
     public void mousePressed(MouseEvent e) {
         System.out.println("acabas de presionar");

     }

     @Override
     public void mouseReleased(MouseEvent e) {
         System.out.println("acabas de levantar");

     }

     @Override
     public void mouseEntered(MouseEvent e) {
         System.out.println("acabas de entrar");

     }

     @Override
     public void mouseExited(MouseEvent e) {
         System.out.println("acabas de salir ");

     }
 }
*/

  /* solo usar un metodo de la clase */
class EventosRaton extends MouseAdapter {
    //sobre escrivir metodo
    public void mouseClicked(MouseEvent e ){
        System.out.println("has echo click");
    }
  }
