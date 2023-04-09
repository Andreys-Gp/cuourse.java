import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaArea {
    public static void main(String[] args) {

        MArcoPruebaArea mimarco=new MArcoPruebaArea();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);
    }
}

class MArcoPruebaArea extends JFrame{
    public MArcoPruebaArea(){
        setTitle("marco area de texto prueba");
        setBounds(500,300,500,350);
        setLayout(new BorderLayout());
        laminaBotones =new JPanel();
       botonInsertar=new JButton("insertar");
       botonInsertar.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               areaTexto.append("colabora seguire sise puede tomaras desiciones");
           }
       });
       laminaBotones.add(botonInsertar);

       botonSaltoLinea=new JButton("salto linea");
       botonSaltoLinea.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               boolean saltar=!areaTexto.getLineWrap();
               areaTexto.setLineWrap(saltar);
               if (saltar=true){
                   botonSaltoLinea.setText("quitar salto");
               }
               else {
                    botonSaltoLinea.setText("salto linea");
               }
           }
       });
    laminaBotones.add(botonSaltoLinea);
    add(laminaBotones, BorderLayout.SOUTH);

       areaTexto=new JTextArea(8,20);
       laminaConBarras=new JScrollPane(areaTexto);
            add(laminaConBarras, BorderLayout.CENTER);
    }
    private JPanel laminaBotones;
    private JButton botonInsertar,botonSaltoLinea;
    private JTextArea areaTexto;
    private JScrollPane laminaConBarras;
}