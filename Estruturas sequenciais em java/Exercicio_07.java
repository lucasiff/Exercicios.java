package exercicios;
import java.util.Scanner;
public class Exercicio_7
{
    public static void main(String[] args)
    {
        int camisas,calças,meias,total_gastos;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite o total de camisas lavadas:");
        camisas=teclado.nextInt();
        System.out.print("Digite o total de calças lavadas:");
        calças=teclado.nextInt();
        System.out.print("Digite o total de meias lavadas:");
        meias= teclado.nextInt();
        total_gastos=camisas*5+calças*10+meias*2;
        System.out.println("O seu gasto total foi de:"+(total_gastos));
        teclado.close();
    }
}
