package empleados;

import java.util.Date;
import java.util.GregorianCalendar;

public class Constructor_Empleado {
     //variables de clase
    private double  sueldo;
    private String nombre;
    private Date fecha_alta;

    public  Constructor_Empleado(String nombre, double sueldo, int año, int mes, int dia ){
        //inicializador contructor
        this.nombre = nombre;
        this.sueldo = sueldo;
        GregorianCalendar calendar=new GregorianCalendar(año,mes-1,dia);
        fecha_alta=calendar.getTime();
    }

    public  String dameNombre (){
        return nombre;
    }
        public double dameSueldo(){
          return sueldo;
        }
          public Date dameFechaContrato(){
                return fecha_alta;
          }
          public void subeSueldo(double porcentaje){
                 double aumento=sueldo*porcentaje/100;
              sueldo=aumento;
          }




}
