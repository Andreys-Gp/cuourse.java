package eventos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VariosOyentes {
    public static void main(String[] args) {
               MarcoPrincipal mimarco=new MarcoPrincipal();
               mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
               mimarco.setVisible(true);
    }
}


class MarcoPrincipal extends JFrame{
    public MarcoPrincipal(){
        setTitle("prueva varios ");
        setBounds(600,350,600,300);
        LaminaPrincipal lamina=new LaminaPrincipal();
        add(lamina);
    }
}



class  LaminaPrincipal extends JPanel{
    public LaminaPrincipal(){
        JButton botonnuevo=new JButton("nuevo");
        add(botonnuevo);
        /*instnacie  e inicio dentro del constructor*/
        botoncerrar =new JButton("cerrar todo");
        add(botoncerrar);
         OyenteNuevo mioyente=new OyenteNuevo();
         botonnuevo.addActionListener(mioyente);
    }

     private class OyenteNuevo implements ActionListener{

         @Override
         public void actionPerformed(ActionEvent e) {
             MarocoEmergente marco=new MarocoEmergente(botoncerrar );
             marco.setVisible(true);

         }
     }
    JButton botoncerrar;
}




class  MarocoEmergente extends JFrame{
    public MarocoEmergente(JButton botondeprincipal) {
        contador++;
        setTitle("ventana 1" + contador);
        //ventanas emergentees
        setBounds(40*contador,40*contador,300,150);
         CierraTodos oyentecerra=new CierraTodos();
         botondeprincipal.addActionListener(oyentecerra);
    }

    private class CierraTodos implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
             dispose();
        }
    }
    //una varible estatica se puede utilizar en todos las clases
     private static int contador=0;
}
