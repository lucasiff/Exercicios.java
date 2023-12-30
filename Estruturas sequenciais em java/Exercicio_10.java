package exercicios;
import java.util.Scanner;
public class Exercicio_10
{
    public static void main(String[] args)
    {
        float altura,peso,imc;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite a sua altura:");
        altura=teclado.nextFloat();
        System.out.print("Digite o seu peso:");
        peso=teclado.nextFloat();
        imc=peso/(altura*altura);
        System.out.println("Seu IMC:"+(imc));
        teclado.close();
    }
}
