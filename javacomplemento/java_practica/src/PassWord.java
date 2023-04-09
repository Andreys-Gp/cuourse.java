import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;

public class PassWord {
    public static void main(String[] args) {
     MarcoPassword mimarco=new MarcoPassword();
     mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoPassword extends JFrame{
  public MarcoPassword(){
      setBounds(400,300,550,400);
          LaminaPassword milamina=new LaminaPassword();
          add(milamina);
          setVisible(true);
  }
}

 class LaminaPassword extends JPanel{
   public LaminaPassword (){

       setLayout(new BorderLayout());
       JPanel lamina_superior=new JPanel();
       lamina_superior.setLayout(new GridLayout(2,2));
       add(lamina_superior, BorderLayout.NORTH);
       JLabel etiqueta1=new JLabel("usuario");
       JLabel etiqueta2=new JLabel("contraseña");
       JTextField c_usuario=new JTextField(15);

       CompruebaPass mievento=new CompruebaPass();
       c_contra=new JPasswordField(15);
       c_contra.getDocument().addDocumentListener(mievento);

       lamina_superior.add(etiqueta1);
       lamina_superior.add(c_usuario);
       lamina_superior.add(etiqueta2);
       lamina_superior.add(c_contra);
        JButton enviar=new JButton("Enviar");
        add(enviar, BorderLayout.SOUTH);

   }
   private class CompruebaPass implements DocumentListener{

       @Override
       public void insertUpdate(DocumentEvent e) {
           char[] contraseña;
           contraseña=c_contra.getPassword();
           if (contraseña.length<8 || contraseña.length>12 ) {
               c_contra.setBackground(Color.RED);
           }
           else {
               c_contra.setBackground(Color.cyan);
       }

       }

       @Override
       public void removeUpdate(DocumentEvent e) {
           char[] contraseña;
           contraseña=c_contra.getPassword();
           if (contraseña.length<8 || contraseña.length>12 ) {
               c_contra.setBackground(Color.RED);
           }
           else {
               c_contra.setBackground(Color.cyan);
           }
       }

       @Override
       public void changedUpdate(DocumentEvent e) {

       }
   }
   private JPasswordField c_contra;
 }