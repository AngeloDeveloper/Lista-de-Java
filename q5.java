import java.util.Scanner;

public class q5
{
    public static void main(String[] args)
    {
        String temp;
        Scanner entrada=new Scanner(System.in);

        int matriz1[][]=new int[3][3];
        int matriz2[][]=new int[3][3];
        int matriz3[][]=new int[3][3];


        for (int i = 0; i <3 ; i++)
        {
            for (int j = 0; j <3 ; j++)
            {
                System.out.println("Digite " +(j+1)+ "o valor da linha "+(i+1) +" da primeira matriz");
               matriz1[i][j]= entrada.nextInt();
            }
        }

        for (int i = 0; i <3 ; i++)
        {
            for (int j = 0; j <3 ; j++)
            {
                System.out.println("Digite " +(j+1)+ "o valor da linha "+(i+1) +" da segunda matriz");
                matriz2[i][j]= entrada.nextInt();
            }
        }

        for (int i = 0; i <3 ; i++)
        {
            System.out.print("| ");
            for (int j = 0; j <3 ; j++)
            {

                System.out.print( matriz1[i][j]+" ");

            }
            System.out.println("|");

        }


        for (int i = 0; i <3 ; i++)
        {
            System.out.print("| ");
            for (int j = 0; j <3 ; j++)
            {

                System.out.print( matriz2[i][j]+" ");

            }
            System.out.println("|");

        }


        for (int i = 0; i <3 ; i++)
        {
            for (int j = 0; j <3 ; j++)
            {
                for (int k = 0; k < 3; k++)
                {
                    matriz3[i][k]+=matriz1[i][j]*matriz2[j][k];
                }
            }
        }


        for (int i = 0; i <3 ; i++)
        {
            System.out.print("| ");
            for (int j = 0; j <3 ; j++)
            {

                System.out.print( matriz3[i][j]+" ");

            }
            System.out.println("|");

        }




    }
}
