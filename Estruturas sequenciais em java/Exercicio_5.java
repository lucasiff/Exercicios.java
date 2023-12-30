package exercicios;
import java.util.Scanner;
public class Exercicio_5
{
    public static void main(String[] args)
    {
        int So,V,T,S;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite o valor do espaço inicial:");
        So=teclado.nextInt();
        System.out.print("Digite o valor da velocidade:");
        V=teclado.nextInt();
        System.out.print("Digite o valor do tempo:");
        T=teclado.nextInt();
        S=So+V*T;
        System.out.println("S="+(S));
        teclado.close();
    }
}
