import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CasillasDeVerificacion {
    public static void main(String[] args) {
       MarcocChek mimarco=new MarcocChek();
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcocChek extends JFrame {
    public MarcocChek(){
        setBounds(550,300,550,350);
        setVisible(true);
           LaminaCheck milamina=new LaminaCheck();
           add(milamina);
    }
}

class LaminaCheck extends JPanel{
    public LaminaCheck(){
        setLayout(new BorderLayout( ));
        Font miLetra=new Font("Serif",Font.PLAIN ,24);
        texto=new JLabel("Como todo se puede logremos todo....");
        texto.setFont(miLetra);
         JPanel LaminaTexto=new JPanel();
         LaminaTexto.add(texto);
         add(LaminaTexto, BorderLayout.CENTER);

         cuadro1=new JCheckBox("negrita");
         cuadro2=new JCheckBox("cursiva");
            cuadro1.addActionListener(new MAnejaChecks());
              cuadro2.addActionListener(new MAnejaChecks());
              JPanel laminacheks=new JPanel();
              laminacheks.add(cuadro1);
              laminacheks.add(cuadro2);
               add(laminacheks, BorderLayout.SOUTH);

    }
    private class MAnejaChecks implements ActionListener{

         @Override
        public void actionPerformed(ActionEvent e) {
           int tipo=0;
           if (cuadro1.isSelected()) tipo+=Font.BOLD;
           if (cuadro2.isSelected()) tipo+=Font.ITALIC;
           texto.setFont(new Font("Serif", tipo, 24));
        }
    }
    private JLabel texto;
    private  JCheckBox cuadro1,cuadro2;
}
