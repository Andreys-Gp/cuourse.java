
import java.lang.*;
public class ClaseMath {
    public static void main(String[] args) {
        int raiz=(int)Math.sqrt(4); //lee decimales double raiz de un numero (sqrt)//
        System.out.println(raiz);

           double resultado=(int)Math.round(4.33); //round redondeda valor entrega un double
           System.out.println(resultado);

            //double base,altura;
              double base=2.33;
            double  altura=4.33;
          double  operacion=Math.pow(base,altura);
          System.out.println(operacion);
    }
}
