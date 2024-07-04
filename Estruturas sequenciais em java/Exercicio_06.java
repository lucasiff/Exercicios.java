package exercicios;
import java.util.Scanner;
public class Exercicio_6
{
    public static void main(String[] args)
    {
        int numero;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite um número:");
        numero=teclado.nextInt();
        numero=numero-1;
        System.out.println("O seu número antecessor é:"+(numero));
        numero=numero+2;
        System.out.println("O seu número sucessor é:"+numero);
        teclado.close();
    }

}
