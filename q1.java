import java.util.Scanner;

public class q1
{
    public static void main(String[] args)
    {
        String temp;
        Scanner entrada=new Scanner(System.in);

        double a,b,k,delta;


        do
            {
                a = entrada.nextInt();
                b = -entrada.nextInt();
                k = entrada.nextInt();
            }
        while(a==0||b==0||k==0);





        delta=(b*b)-4*a*k;

        if(delta<0)
        {
            System.out.println(" n�o existem raizes reais");
        }
        else
        {
            if (delta==0)
            {
              double raiz= -b/2*a;

                System.out.println(raiz+" produtos produzir�o custo m�nimo");


            }
            else
            {
                double raiz1=(-b+ Math.sqrt(delta))/2*a;
                double raiz2=(-b-Math.sqrt(delta))/2*a;

                System.out.println("existe duas quantidades de produtos que tem custo m�nimo");
                System.out.println("que s�o "+raiz1+" e "+raiz2);
            }


        }


    }
}