
 import java.lang.*;
public class ClaseString {
    public static void main(String[] args) {
        String nombre="Brayan Andreys Gonzalez";
         System.out.println(nombre);
         System.out.println( " numero de letras:" + nombre.length() );
         //posicion del caracter quiero devuelva
        System.out.println("La primera letra de mi nombre:" + nombre.charAt(0));
         int ultima_letra;
          ultima_letra=nombre.length();
            System.out.println("ultima letra de mi primer nombre:" + nombre.charAt(ultima_letra-18));

            String frace=" todo lo puedo en cristo que me fortalece ";
              String frase_resume= frace.substring(1, 24);
              System.out.println(frase_resume);


              String alumno1,alumno2;
              alumno1="David";
              alumno2="David";
              String alumnno3="david";
           System.out.println(alumno1.equals(alumno2));
           System.out.println(alumno1.equalsIgnoreCase(alumnno3));







    }
}
