import java.util.Scanner;

public class EJE2TALLER5 
{
    public static void main(String[] args)
    {
        Scanner lea = new Scanner (System.in);
        String nom; 
        float sbh, nht, ded, bon, sbto,snto;
        int N;
        System.out.println("DIGITE LA CANTIDAD DE TRABAJADORES");
        N=lea.nextInt();
        for (int i = 1; 1 <= N; i++)
        {
             System.out.print("NOMBRE" + 1);
        nom=lea.next();
        System.out.print("VALOR HORA ");
        sbh=lea.nextFloat();
        System.out.print("HORAS LABORADAS ");
        nht=lea.nextFloat();
        System.out.print("DEDUCCIONES ");
        ded=lea.nextFloat();
        System.out.print("BONIFICACION ");
        bon=lea.nextFloat();

        sbto= sbh*nht;
        snto=sbto+bon-ded;

        System.out.println();
        System.out.println("****************************************************");
        System.out.println("EMPLEADOS" + nom);
        System.out.println("SALARIO BRUTO" + sbto);
        System.out.println("SALARIO NETO" + snto);
        System.out.println("******************************************************");
        System.out.println("");
        

        }
       
       
       
    }
}
