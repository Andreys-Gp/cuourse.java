package empleados;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Empleado {
    public static void main(String[] args) {
       /* Empleado empleado1=new Empleado( "sofia",2500,2020,12,19);
          Empleado empleado2=new Empleado("marcos",2400,2020,04,13);
          Empleado empleado3=new Empleado( "luis",3600,2017,9,23);

          empleado1.subeSueldo(5);
          empleado2.subeSueldo(10);
          empleado3.subeSueldo(23);
          System.out.println("nombre: " + empleado1.dameNombre() + " sueldo: " + empleado1.dameSueldo()
                  +  " fecha alta: " +empleado1.dameFechaContrato());
        System.out.println("nombre: " + empleado2.dameNombre() + " sueldo: " + empleado2.dameSueldo()
                +  " fecha alta: " +empleado2.dameFechaContrato());
        System.out.println("nombre: " + empleado3.dameNombre() + " sueldo: " + empleado3.dameSueldo()
                +  " fecha alta: " +empleado3.dameFechaContrato());*/

    Jefatura jefeEjemplo=new Jefatura("marquitos",20200,2002,9,25);
    jefeEjemplo.estableceIncentivo(25700);

        Empleado[] misEmpleados=new Empleado[6];
          misEmpleados[0]=new Empleado("sofia",2500,2020,12,19);
          misEmpleados[1]=new Empleado ("marcos",2400,2020,04,13);
          misEmpleados[2]=new Empleado( "luis",3600,2017,9,23);
          misEmpleados[3]= new Empleado("sobre carga");
          misEmpleados[4]=jefeEjemplo;//polimorfismo principio sustitucion
        misEmpleados[5]=new Jefatura("jefe brayan",1000232,2022,8,2);



      /*  for (int i = 0; i <6 ; i++) {
            misEmpleados[i].subeSueldo(5);
        }
        for (int i = 0; i < 6; i++) {
            System.out.println("nombre:" + misEmpleados[i].dameNombre() + " su id: " +  misEmpleados[i].dameId() + " sueldo: " + misEmpleados[i].dameSueldo()
            + " fecha alta: " +misEmpleados[i].dameFechaContrato() );
        }*/

        Empleado director_comercial=new Jefatura("mariana",933,2022,2,14);
        Comparable ejemplo=new Empleado("carmen",2933,2034,12,22);

        System.out.println(jefeEjemplo.tomar_desiciones( "todos a salir a media mañana "));
        System.out.println("El bonus para el usuario es: " + misEmpleados[2].dameNombre() + " " +  misEmpleados[3].establece_bonus(300));
        System.out.println("EL JEFE " + jefeEjemplo.dameNombre() + " "   + jefeEjemplo.establece_bonus(300) );


        for (Empleado e: misEmpleados) {
              e.subeSueldo(5);
        }
        Arrays.sort(misEmpleados);
        for (Empleado e:misEmpleados) {
            System.out.println("nombre:" + e.dameNombre() + " su id: " +  e.dameId() + " sueldo: " + e.dameSueldo()
                    + " fecha alta: " + e.dameFechaContrato() );
        }


    }
}

class Empleado implements Comparable,Trabajadores {
        public Empleado(String nom,double sue,int agno,int mes,int dia){
            nombre=nom;
            sueldo=sue;
            GregorianCalendar calendario=new GregorianCalendar(agno,mes-1,dia);
            altaContrato=calendario.getTime();
            ++Idsiguiente;
            id=Idsiguiente;
            }
            public  double establece_bonus(double gratificacion){
            return Trabajadores.bonus_base+gratificacion;
            }
            public Empleado(String nom){ //s0bre carga constructores
             // nombre=nom;
                this(nom,4000,2000,01,02);
            }

            public String dameNombre(){
            return nombre;
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

             // Refundicion y sobreescritura
             public  int compareTo(Object miObjeto){
            Empleado otroEmpleado=(Empleado) miObjeto;
              if (this.sueldo<otroEmpleado.sueldo){
                  return -1;
              }
              if (this.sueldo>otroEmpleado.sueldo){
                  return 1;}
                return  0;
             }



            private String nombre;
            private double sueldo;
            private Date altaContrato;
            private static int Idsiguiente;
            private int id;

}

   class Jefatura extends Empleado implements  Jefes{


      public Jefatura(String nom,double sue,int agno,int mes,int dia){
            super(nom, sue, agno, mes, dia);
      }
      public void estableceIncentivo(double b){
          incentivo=b;
      }
      public double dameSueldo(){
          double sueldoJefe=super.dameSueldo();
          return sueldoJefe+incentivo;
      }
      public  double establece_bonus(double gratificasion){
          double prima=2000;
          return  Trabajadores.bonus_base+gratificasion+prima;
      }

   public String tomar_desiciones(String desicion){
          return "un mienbro de la direccion a tomado la desicion:" +desicion;
   }

      private double incentivo;

   }


   class  Director extends Jefatura{
    public Director(String nom,double sue,int agno,int mes,int dia ){
              super(nom,sue,agno,mes,dia);
    }



   }
