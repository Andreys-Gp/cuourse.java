import  javax.swing.*;

public class Email_Solucion {
    public static void main(String[] args) {

        int arroba=0;
        boolean arrobaP=false;
        String mail=JOptionPane.showInputDialog("introdusca tu email");

        for (int i=0;i<mail.length();i++) {
                if (mail.charAt(i)=='@'){
                    arroba++;
                }
                if (mail.charAt(i)=='.'){
                    arrobaP=true;
                }
        }

         if (arroba==1 && arrobaP==true){
             System.out.println("Email correpto");
         }

         else  {
             System.out.println("Email incorrepto");

         }


    }
}
