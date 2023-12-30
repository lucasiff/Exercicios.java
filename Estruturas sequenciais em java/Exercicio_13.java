package exercicios;
import java.util.Scanner;
public class Exercicio_13
{
    public static void main(String[] args)
    {
        int valor,nota_100,nota_50,nota_20,nota_10,nota_5,nota_2,nota_1,resto;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite o valor:");
        valor= teclado.nextInt();
        nota_100=valor/100;
        resto=valor%100;
        nota_50=resto/50;
        resto=resto%50;
        nota_20=resto/20;
        resto=resto%20;
        nota_10=resto/10;
        resto=resto%10;
        nota_5=resto/5;
        resto=resto%5;
        nota_2=resto/2;
        resto=resto%2;
        nota_1=resto;
        System.out.println("Notas de 100:"+(nota_100));
        System.out.println("Notas de 50:"+(nota_50));
        System.out.println("Notas de 20:"+(nota_20));
        System.out.println("Notas de 10:"+(nota_10));
        System.out.println("Notas de 5:"+(nota_5));
        System.out.println("Notas de 2:"+(nota_2));
        System.out.println("Moedas de 1:"+(nota_1));
        teclado.close();
    }
}
