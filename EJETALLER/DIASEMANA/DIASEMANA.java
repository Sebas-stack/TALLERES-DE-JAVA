package DIASEMANA;

import java.util.Scanner;

public class DIASEMANA 
{
    public static void main(String[] args) 
    {   
        Scanner lea = new Scanner(System.in);
        int n;
        System.out.println("DIGITE UN NUMERO ENTRE 1 Y 7");
        n=lea.nextInt();
        if (n==1)
        {
            System.out.println("DOMINGO");
        }
        else 
        {
            if (n==2)
            {
                System.out.println("LUNES");
            }
            else 
            {
                if (n==3)
                {
                    System.out.println("MARTES");
                }
                else 
                {
                    if (n==4)
                    {
                        System.out.println("MIERCOLES");
                    }
                    else  
                    {
                        if (n==5)
                        {
                            System.out.println("JUEVES");
                        }
                        else 
                        {
                            if (n==6)
                            {
                                System.out.println("VIERNES");
                            
                            }
                            else 
                            {
                                if (n==7)
                                {
                                    System.out.println("SABADO");
                                }
                                else
                                {
                                    System.out.println("EL NUMERO QUE DIGITO NO ES VALIDO");
                                }
                            }
                        }
                    }

                }
            }

        }
    

    }
}
