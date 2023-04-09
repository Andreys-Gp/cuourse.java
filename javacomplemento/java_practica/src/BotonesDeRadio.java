import javax.swing.*;

public class BotonesDeRadio {
    public static void main(String[] args) {
          MarcoRadio mimarco=new MarcoRadio();
          mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MarcoRadio extends JFrame{
    public MarcoRadio (){
      setVisible(true);
      setBounds(550,300,500,300);
      LaminaRadio milamina=new LaminaRadio();
      add(milamina);
    }
}

class LaminaRadio extends JPanel {
    public LaminaRadio (){
          ButtonGroup migtupo1=new ButtonGroup();
          JRadioButton boton1=new JRadioButton("axul",false);
          JRadioButton boton2=new JRadioButton("rojo",true);
           JRadioButton boron3=new JRadioButton("verde",false);
           migtupo1.add(boton1);
           migtupo1.add(boton2);
           migtupo1.add(boron3);

           add( boton1);
           add(boton2);
           add(boron3);

    }
}