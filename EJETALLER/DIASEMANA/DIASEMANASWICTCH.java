package DIASEMANA;
import java.util.Scanner;

public class DIASEMANASWICTCH 
{
   public static void main(String[] args) 
   {
        Scanner lea = new Scanner(System.in);
        int n, N;
        System.out.println("DIGITE LA CATIDAD DE VECES");
        N=lea.nextInt();
        for (int i= 1; i<=N; i ++)
       {
            System.out.println("DIGITE UN NUMERO ENTRE 1 Y 7");
                n=lea.nextInt();
                switch (n) 
                {
                    case 1 ->                         {
                            System.out.println("DOMINGO");
                        }
                    case 2 ->                         {
                            System.out.println("LUENES");
                        }
                    case 3 ->                         {
                            System.out.println("MARTES");
                        }
                    case 4 ->                         {
                            System.out.println("MIERCOLES");
                        }
                    case 5 ->                         {
                            System.out.println("JUEVES");
                        }
                    case 6 ->                         {
                            System.out.println("VIERNES");
                        }
                    case 7 ->                         {
                            System.out.println("SABADO");
                        }
                    default ->                         {
                            System.out.println("VALOR INVALIDO");
                        }

                }
            }
       } 
}
