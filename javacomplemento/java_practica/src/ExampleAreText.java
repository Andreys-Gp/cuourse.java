import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExampleAreText {
    public static void main(String[] args) {
          MarcoArea mimarco=new MarcoArea();
          mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoArea extends JFrame {
    public MarcoArea (){
        setBounds(500,300,500,350);
        LaminaArea milamina=new LaminaArea();
        add(milamina);
        setVisible(true);
    }
}

class LaminaArea extends JPanel {
    public LaminaArea(){
         MiArea=new JTextArea(8,20);
        JScrollPane LaminaBarra=new JScrollPane(MiArea);
        //MiArea.setLineWrap(true);
         add(LaminaBarra);
         JButton MiBoton=new JButton("DALE");
         MiBoton.addActionListener(new GestionaArea());
         add(MiBoton);
    }
    private class GestionaArea implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
               System.out.println(MiArea.getText());
        }
    }
    private JTextArea MiArea;
}
