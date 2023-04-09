package empleados;

public class Practica_Solo_Fichero {
    public static void main(String[] args) {

        Empleados trabajador1 = new Empleados("paco");
        Empleados trabajador2=new Empleados("andrea");
        Empleados trabajador3 = new Empleados("nicolas");

        trabajador1.cambiaseccion("departamento solar");
       // trabajador1.cambianombre("marcos fernando");

        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());



    }

}

class  Empleados{

    public Empleados(String nom){//construtor
        nombre=nom;
        seccion="Administracion";
        Id=IgSiguiente;
        IgSiguiente++;

    }
    

  /*  public void cambianombre(String nombre){
        this.nombre=nombre;
    }*/
     public void cambiaseccion(String seccion){
        this.seccion=seccion;
    }
     public String devuelveDatos(){
        return "el nombre es " + nombre + " y la seccion es " + seccion + "tu id:" + Id;
     }

    private final String nombre;
    private String seccion;

    private int Id;
    private static int IgSiguiente=1;


}

