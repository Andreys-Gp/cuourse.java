import  javax.swing.*;


public class Acceso_Aplicacion {
    public static void main(String[] args) {

        String  clave="juan";
       String pass="";

       while (clave.equals(pass)==false){
           pass=JOptionPane.showInputDialog("introduce la contraseña:");
           if (clave.equals(pass)==false){
               System.out.println("contrase incorrepta");
           }
       }
          System.out.println("contrase acceso_Aplicacion");
    }
}
