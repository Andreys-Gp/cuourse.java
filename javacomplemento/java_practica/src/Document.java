import javax.swing.*;
import javax.swing.event.*;
 //import java.security.spec.EllipticCurve;


public class Document {
    public static void main(String[] args) {
        MarcoPrueba mimarco=new MarcoPrueba();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static class getDocument extends Document {
    }
}

class MarcoPrueba extends JFrame{
    public MarcoPrueba(){
        setBounds(500,300,500,350);
LaminaPrueba milamina=new LaminaPrueba();
         add(milamina);
          setVisible(true);
    }
}

class LaminaPrueba extends JPanel{
   public LaminaPrueba(){
       JTextField micampo=new JTextField(20);
       EscuchaTexto el_evento=new EscuchaTexto();
       Document midoc= (Document) micampo.getDocument();
       ((javax.swing.text.Document) midoc).addDocumentListener(el_evento);
       add(micampo);
   }
   private class EscuchaTexto implements DocumentListener {

       @Override
       public void insertUpdate(DocumentEvent e) {
           System.out.println("Has insertado texto");

       }

       @Override
       public void removeUpdate(DocumentEvent e) {
           System.out.println("Has removeado texto");
       }

       @Override
       public void changedUpdate(DocumentEvent e) {

       }
   }
}
