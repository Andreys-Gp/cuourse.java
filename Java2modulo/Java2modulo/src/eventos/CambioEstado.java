package eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import java.awt.Frame;
import java.awt.event.*;

public class CambioEstado {
    public static void main(String[] args) {
        MarcoEstado mimarco=new MarcoEstado();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
 class MarcoEstado extends JFrame {
    public MarcoEstado(){
        setVisible(true);
        setBounds(300,300,500,350);
        Cambioestado nuevo_stado=new Cambioestado();
        addWindowStateListener(nuevo_stado);
    }
 }
  class Cambioestado implements WindowStateListener{
    public void windowStateChanged(WindowEvent e){
        System.out.println("la ventana a cambiado de estado ");
        System.out.println(e.getNewState());

    }
  }