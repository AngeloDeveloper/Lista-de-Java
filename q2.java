import java.util.Scanner;

//Angelo Gabriel Silva Ribeiro


public class q2
{

    public static void main(String[] args)
    {

    /* Faça um programa que leia um vetor de números decimais qualquer (a
    quantidade de elementos também é definida pelo usuário) e imprima os
    elementos na ordem crescente e decrescente. (2,0 pontos)*/

        Scanner entrada= new Scanner(System.in);

        int nElementos;

        System.out.println("Digite a quantidade de elementos do vetor");

        nElementos= entrada.nextInt();

        double[] vetor= new double[nElementos];

        for (int i = 0; i < nElementos; i++)
        {
            vetor[i]=entrada.nextDouble();
           // System.out.println("voce entrou com "+ vetor[i]);
        }

        double aux;

        nElementos--;

        for (int i = 0; i <=nElementos; i++)
        {
            for (int j = 0; j < nElementos; j++)
            {
                //System.out.println("Vetor[j]: " + vetor[j] + " Vetor[j+1]" + vetor[j + 1] + "j: " + j);
                if (vetor[j] < vetor[j + 1])
                {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }

        }



        for (int i = 0; i <=nElementos ; i++)
        {
            System.out.println(vetor[i]);
        }


        for (int i = nElementos; i >=0 ; i--)
        {
            System.out.println(vetor[i]);
        }


    }
}
