public class Uso_Array {
    public static void main(String[] args) {
        // forma inicializar matriz
        int []  mi_matriz= new int[5];
        mi_matriz[0]=5;
        mi_matriz[1]=32;
        mi_matriz[2]=31;
        mi_matriz[3]=37;
        mi_matriz[4]=98;

        for (int i=0; i <5 ; i++) {
            System.out.println("posicion " + i + "valor" + mi_matriz[i]);
        }


    }
}
