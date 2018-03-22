import java.util.Scanner;

public class q4
{
    public static void main(String[] args)
    {
        Scanner entrada=new Scanner(System.in);

        double L1=entrada.nextDouble();
        double soma=L1*L1;
        double temp;

        do {
            temp=entrada.nextDouble();
            soma+=temp*temp;

        }while(temp!=0);

        System.out.println(L1/Math.sqrt(soma));

    }
}
