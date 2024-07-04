package exercicios;
import java.util.Scanner;
public class Exercicio_3
{
   public static void main(String[] args)
   {
       int comprimento, altura, largura,volume;
       Scanner teclado=new Scanner(System.in);

       System.out.print("Entre com o comprimento da caixa:");
       comprimento=teclado.nextInt();
       System.out.print("Entre com a altura da caixa:");
       altura=teclado.nextInt();
       System.out.print("Entre com a largura da caixa:");
       largura=teclado.nextInt();
       volume=comprimento*altura*largura;
       System.out.println("O volume da caixa é="+(volume));
       teclado.close();

   }
}
