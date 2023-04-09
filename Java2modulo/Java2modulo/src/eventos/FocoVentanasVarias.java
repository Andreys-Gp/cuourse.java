package eventos;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

public class FocoVentanasVarias  extends JFrame implements WindowFocusListener {

    public static void main(String[] args) {

    }

     public void iniciar() {
        marco1= new FocoVentana();
        marco2= new FocoVentana();

     }

    @Override
    public void windowGainedFocus(WindowEvent e) {

    }

    @Override
    public void windowLostFocus(WindowEvent e) {

    }

    FocoVentana marco1;
    FocoVentana marco2;
}