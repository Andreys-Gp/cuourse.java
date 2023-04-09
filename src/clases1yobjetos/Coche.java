
package clases1yobjetos;

public class Coche { //clase
  /* private */ int ruedas; //encapsular encapsulamiento nose puede ver
  private   int largo;
   private int ancho;
   private   int motor;
  private   int peso_plataforma;

 private    String color;

  private    int peso_total;

   private    boolean asientos_cuero, climatizador;


    public  Coche (){ //inicializar clase metodo constructor
        ruedas=4;
        largo=33;
        ancho=34;
        motor=1566;
        peso_plataforma=54;

    }
    public String dime_datos_generales(){ //getter meotodo

        return "El largo del coche es: " + largo + "\n" + "Tiene numero ruedas: "  + ruedas + "\n" +  "Con un ancho: " + ancho + "\n" + "Con un motor: " + motor + "\n" +  "Con un peso plataforma: " + peso_plataforma ;
    }

    public  void establece_color(String color_coche){ //metodo setter
        //variable que no este en estad privada
       // color="azul";
        color= color_coche;

    }

      public  String dime_color(){
        return "El color es: " + color;

      }

      // asientos
      public  void configura_asientoss(String asientos_cuero){
          if (asientos_cuero.equalsIgnoreCase("si")) {
                  this.asientos_cuero=true;
          } else {
              this.asientos_cuero=false;
          }}public String dime_asientos() {
        if (asientos_cuero == true) {
            return "El coche tiene asientos de cuero";
        }else {
            return "El coche tiene asientos de serie";
        }}

           //climatizador
    public  void boolean_climatisador(String climatizador){
         if (climatizador.equalsIgnoreCase("si")){
             this.climatizador=true;
         } else {
             this.climatizador=false;
             }} public String dime_aclimatizador(){
            if (climatizador == true) {return "El coche tiene aclimatizador";
            } else {return "El coche no tiene aclimatizador";}}

             //peso coche
    public String dime_peso_coche(){  //SETTER + GETTER
           int peso_carroceria=500;
           peso_total=peso_plataforma+peso_carroceria;
           if(asientos_cuero==true){
               peso_total=peso_total+50;}
        if (climatizador == true) {
            peso_total=peso_total+20;}
         return "El peso del coche es " + peso_total;}

          //presio coche
    public float precio_coche() {
        float precio_final=10000;
        if (asientos_cuero == true) {
            precio_final+=2000;
        }
        if (climatizador == true) {
            precio_final+=1500;
        }
        return precio_final;
    }


}



