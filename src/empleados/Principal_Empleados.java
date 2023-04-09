package empleados;

import javax.swing.*;

public class Principal_Empleados {
    public static void main(String[] args) {

        /*Constructor_Empleado empleado1 = new Constructor_Empleado("Brayan Andreys G", 84999, 1999, 12, 17);
        Constructor_Empleado empleado2 = new Constructor_Empleado("diana manrique", 2222, 1234, 6, 22);
        Constructor_Empleado empleado3 = new Constructor_Empleado("Julian alhons", 4345, 2334, 4, 5);

        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5); */

         // System.out.println("Nombre: " + empleado1.dameNombre() + " sueldo: " + empleado1.dameSueldo() + " Fecha fin: " + empleado1.dameFechaContrato());

        Constructor_Empleado[] misEmpleados= new Constructor_Empleado[3];
         misEmpleados[0]=new Constructor_Empleado("Brayan Andreys G", 84999, 1999, 12, 17);
         misEmpleados[1]= new Constructor_Empleado("Julian alhons", 4345, 2334, 4, 5);
         misEmpleados[2]= new Constructor_Empleado("Julian alhons", 4345, 2334, 4, 5);



                   for (int i=0;i>3;i++){
                       misEmpleados[i].subeSueldo(5);
                   }
        for (int i = 0; i <3 ; i++) {
            System.out.println("Nombre: " +  misEmpleados[i].dameNombre() + " sueldo: "  + misEmpleados[i].dameSueldo() + " Fecha fin: " + misEmpleados[i].dameFechaContrato());
        }

    }
}
