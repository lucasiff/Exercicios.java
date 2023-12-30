package exercicios;
import java.util.Scanner;
public class Exercicio_4
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite o valor de A:");
        a=teclado.nextInt();
        System.out.print("Digite o valor de b:");
        b=teclado.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("Valores trocados:\nvalor de A:"+(a)+"\nvalor de b:"+(b));
        teclado.close();
    }
}
