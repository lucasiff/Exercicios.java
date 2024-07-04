package exercicios;
import java.util.Scanner;
public class Exercicio_9
{
    public static void main(String[] args)
    {
        int idade,soma_idade;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite a sua idade:");
        idade=teclado.nextInt();
        soma_idade=idade*(idade+1)/2;
        System.out.println("Resultado:"+(soma_idade));
        teclado.close();
    }
}
