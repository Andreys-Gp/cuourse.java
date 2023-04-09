package clases1yobjetos;

public class Furgoneta extends Coche {
          private  int capacidad_de_carga;
          private int plazas_extra;

          public Furgoneta( int carga, int pieza){
              super(); //llamar al constructor de la clase padre
              capacidad_de_carga=carga;
              plazas_extra=pieza;

          }
public String dimeDatosFurgoneta(){
              return " la capacida de carga es: " + capacidad_de_carga + " la piezas son: " + plazas_extra;
}
}
