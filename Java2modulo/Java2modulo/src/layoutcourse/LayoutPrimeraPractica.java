package layoutcourse;

import javax.swing.*;
import java.awt.*;

public class LayoutPrimeraPractica {
    public static void main(String[] args) {
        MarcoLayout mimarco=new MarcoLayout();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);

    }
}
class MarcoLayout extends JFrame {
    public MarcoLayout(){
        setTitle("prueba de acciones ");
        setBounds(600,350,600,300);
        PanelLayout mipanel=new PanelLayout();
        /*   FlowLayout disposicion=new FlowLayout(FlowLayout.CENTER);
        mipanel.setLayout(disposicion); */
        // mipanel.setLayout(new FlowLayout(FlowLayout.CENTER,75,100));
  // mipanel.setLayout(new FlowLayout(FlowLayout.CENTER,15,100));
        Panelayout2 mipanel2=new Panelayout2();

        add(mipanel,BorderLayout.NORTH);
         add(mipanel2,BorderLayout.SOUTH);
    }
}
  class PanelLayout extends JPanel{
    public PanelLayout(){
        //setLayout(new FlowLayout(FlowLayout.CENTER,15,100));

       //  setLayout(new BorderLayout(FlowLayout.CENTER,75,100));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Amarillo"));
        add(new JButton("Rojo"));
        /*add(new JButton("Azul"),  BorderLayout.WEST);
        add(new JButton("Verde"),BorderLayout.EAST);
        add(new JButton("Negro"),BorderLayout.CENTER); */
    }
  }

  class Panelayout2 extends JPanel {
    public Panelayout2(){
        setLayout(new BorderLayout());
        add(new JButton("Azul"),  BorderLayout.WEST);
        add(new JButton("Verde"),BorderLayout.EAST);
        add(new JButton("Negro"),BorderLayout.CENTER);

    }
  }
