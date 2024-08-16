package EJE4TALLER5;

import java.util.Scanner;

public class EJER4TALLER5 {
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        String na, linea;
        float vru, nuv, vrbto, iva, neto;
        int N, I;
        System.out.println("DIGITE LA CANTIDAD DE VECES");
        I=lea.nextInt();
        System.out.println("DIGITE LA LINEA DEL ARTICULO ");
        N=lea.nextInt();

        System.out.println("NOMBRE DEL ARTICULO");
        na=lea.next();
        System.out.println("LINEA");
        linea=lea.next();
        System.out.println("VALOR UNITARIO");
        vru=lea.nextFloat();
        System.out.println("NUMERO DE UNIDADES VENDIDAS");
        nuv=lea.nextFloat();

    }
}
