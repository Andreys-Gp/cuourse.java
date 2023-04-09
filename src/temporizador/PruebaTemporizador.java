package temporizador;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class PruebaTemporizador {
    public static void main(String[] args) {

        DameLaHora oyente=new DameLaHora();
        Timer temporizador=new Timer(5000, oyente);
        temporizador.start();;
 JOptionPane.showMessageDialog(null,"pulsa aceptar para detener ");

 System.exit(0);
    }
}

class  DameLaHora implements ActionListener {

    public void  actionPerformed(ActionEvent e) {
        Date ahora = new Date();
        System.out.println(" informativo de hora 5 sg:" + ahora);
        Toolkit.getDefaultToolkit().beep();;

    }

}
