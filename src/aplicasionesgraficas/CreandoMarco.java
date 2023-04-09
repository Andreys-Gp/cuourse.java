package aplicasionesgraficas;

import javax.swing.*;

public class CreandoMarco {
    public static void main(String[] args) {

   miMarco marco1= new miMarco();
    marco1.setVisible(true);
    marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }
}

class miMarco extends JFrame{
    public miMarco(){
          // setSize(500,300);
           //setLocation(500,300);
      setBounds(10, 20, 700,500);
         setTitle("mi ventana");
    }
}
