package exercicios;
import java.util.Scanner;
public class Exercicio_11
{
    public static void main(String[] args)
    {
        float salario,aumento,novo_salario;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite o seu salário mensal atual:");
        salario=teclado.nextFloat();
        System.out.print("Digite a porcentagem de aumento:");
        aumento=teclado.nextFloat();
        novo_salario=salario*aumento;
        System.out.println("O seu novo salário:"+(novo_salario));
        teclado.close();

    }
}
