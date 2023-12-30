package exercicios;
import java.util.Scanner;
public class Exercicio_2 
{
	public static void main(String[] args)
	{
		int centimetros,metros;
		Scanner teclado=new Scanner(System.in);
		
		System.out.print("Digite o valor em metros:");
		metros=teclado.nextInt();
		centimetros=metros*100;
		System.out.println((centimetros)+"cm");
		teclado.close();
	}

}
