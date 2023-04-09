package temporizador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Timer;
import java.awt.Toolkit;

public class Temporizador2 {
    public static void main(String[] args) {

      /*  Reloj mireloj=new Reloj(3000,true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null,"pulsa aceptar");
          System.exit(0); */
      /*  Reloj mireloj=new Reloj(4000,true);
        mireloj.enMarcha();
        JOptionPane.showMessageDialog(null,"pulsa aceptar para terminar");
            System.exit(0);

       */


    }
}

/* class  Reloj {
    public Reloj(int intervalo, boolean sonido) {
        this.sonido = sonido;
        this.intervalo = intervalo;
    }

    public void enMarcha() {
        ActionListener oyente = new DameLaHora2();
        Timer mitemporizador = new Timer(intervalo, oyente);
        mitemporizador.start();

    }

    private int intervalo;
    private boolean sonido;

    private class DameLaHora2 implements ActionListener{
         public void actionPerformed(ActionEvent evento){
             Date ahora=new Date();
             System.out.println("imprimo hora cada n segundo:" + ahora);
             if (sonido == true) {
                 Toolkit.getDefaultToolkit().beep();;
             }
         }
    }

}


 */