import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuDespeglable {
    public static void main(String[] args) {
        MarcoCombo mimarco=new MarcoCombo();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

class MarcoCombo extends JFrame {
    public MarcoCombo(){
        setVisible(true);
        setBounds(550,300,550,400);
            LaminaCombo milamina=new LaminaCombo();
            add(milamina);
    }
}

class  LaminaCombo extends JPanel{
    public LaminaCombo (){
    setLayout(new BorderLayout());
    texto=new JLabel("todo lo puedo en cristo que me fortalece");
    texto.setFont(new Font("Serif", Font.PLAIN,18));
    add(texto,BorderLayout.CENTER);
    JPanel lamina_norte=new JPanel();
    micombo=new JComboBox<>();
    micombo.setEditable(true);
    micombo.addItem("Serif");
    micombo.addItem("SansSerif");
    micombo.addItem("Monospaced");
    micombo.addItem("Dialog");
    EventoCombo mievento=new EventoCombo();
    micombo.addActionListener(mievento);
    lamina_norte.add(micombo);
    add(lamina_norte, BorderLayout.NORTH);

    }

 private class EventoCombo implements ActionListener{

     @Override
     public void actionPerformed(ActionEvent e) {
         texto.setFont(new Font((String)micombo.getSelectedItem(),Font.PLAIN,18));
     }
 }


    private JLabel texto;
    private JComboBox micombo;
}
