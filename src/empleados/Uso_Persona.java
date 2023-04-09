package empleados;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {
    public static void main(String[] args) {

        Persona[] LasPersonas=new Persona[2];
        LasPersonas[0]=new Empleado2("marcos fideleos",12000,2017,04,04);
        LasPersonas[1]=new Alumno("maracuya con fresa","ing electronica");

        for (Persona p: LasPersonas) {
            System.out.println(p.DameNombre()+ ", " + p.dameDescripcion());
        }
   
    }
}

  abstract class Persona{

    public Persona(String nom){
        nombre=nom;
    }

 public String DameNombre(){
        return nombre;
 }

  public  abstract String dameDescripcion();
    private String nombre;
}



class Empleado2 extends Persona {

    public Empleado2(String nom, double sue,int agno,int mes,int dia){
        super(nom);
        sueldo=sue;
        GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
        altaContrato=calendario.getTime();
        ++Idsiguiente;
        id=Idsiguiente;
    }

    public String dameDescripcion() {
        return "Este empleado tiene una id: " + id + " con sueldo de: " + sueldo;
    }


    public double dameSueldo(){
        return sueldo;
    }

    public Date dameFechaContrato(){
        return altaContrato;
    }

    public void subeSueldo(double porcentaje){
        double aumento=sueldo*porcentaje/100;
        sueldo*=aumento;
    }
    public int dameId(){
        return id;
    }


    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int Idsiguiente;
    private int id;

}

class  Alumno extends Persona{
    public Alumno(String nom, String carre){
        super(nom);
        carrera=carre;

    }
    public String dameDescripcion (){
        return "Este alumno pertene ala carrera de: " + carrera;
    }

    private String carrera;
}
