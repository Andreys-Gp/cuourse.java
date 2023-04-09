import javax.swing.*;

public class Compruebe_Email {
    public static void main(String[] args) {
        boolean arroba=false;
        String mail=JOptionPane.showInputDialog("introduce tu email");
        for (int i=0;i<mail.length();i++){
            if (mail.charAt(i)=='@'){
                arroba=true;
            }
        }
             if (arroba==true){
                 System.out.println("Email is correct");
             } else  {
                   System.out.println("Email no correp ");
             }
    }
}
