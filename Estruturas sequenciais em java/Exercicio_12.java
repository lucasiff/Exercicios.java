package exercicios;
import java.util.Scanner;
public class Exercicio_12
{
    public static void main(String[] aargs)
    {
        int dia_1,dia_2,mes_1,mes_2,ano_1,ano_2,idade_1,idade_2,idade_3;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite o dia em que você nasceu:");
        dia_1=teclado.nextInt();
        System.out.print("Digite o mês em que você nasceu:");
        mes_1=teclado.nextInt();
        System.out.print("Digite o ano em que você nasceu:");
        ano_1= teclado.nextInt();
        System.out.print("Digite o dia em que você está:");
        dia_2=teclado.nextInt();
        System.out.print("Digite o mês em que você está:");
        mes_2=teclado.nextInt();
        System.out.print("Digite o ano em que você está:");
        ano_2= teclado.nextInt();
        idade_1=ano_2-ano_1;
        idade_2=idade_1*365;
        idade_3=idade_1*12;
        System.out.println("Você tem:"+(idade_1)+"dia(s)"+(idade_2)+"mes(es)"+(idade_3)+"ano(os)");
        teclado.close();

    }
}
