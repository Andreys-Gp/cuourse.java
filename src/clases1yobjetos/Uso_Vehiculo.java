package clases1yobjetos;

public class Uso_Vehiculo {
    public static void main(String[] args) {

        Coche micoche1=new Coche();
        micoche1.establece_color("rojo");

            Furgoneta mifurgoneta1=new Furgoneta(7,320);
            mifurgoneta1.establece_color("azul");
            mifurgoneta1.configura_asientoss("si");
            mifurgoneta1.boolean_climatisador("si");

            System.out.println(micoche1.dime_datos_generales() + "" + micoche1.dime_color());
            System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dimeDatosFurgoneta());
            
    }
}
