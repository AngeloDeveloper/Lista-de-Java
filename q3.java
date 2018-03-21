import java.util.Scanner;

public class q3
{
    public static void main(String[] args)
    {
        String temp;
        Scanner entrada=new Scanner(System.in);
        int variavel;

        variavel=entrada.nextInt();

        temp=Integer.toBinaryString(variavel);

        System.out.println("Base Binaria: "+temp);

        temp=Integer.toHexString(variavel);

        System.out.println("Base Hexadecimal: "+temp);

    }
}
