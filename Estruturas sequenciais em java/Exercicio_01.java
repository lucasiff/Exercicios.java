package exercicios;
import java.util.Scanner;
public class Exercicio_1 
{
  public static void main(String[] args)
  {
	  float c,f,k;
	  Scanner teclado=new Scanner(System.in);
	  
	  System.out.print("Digite a temperatura em celcius:");
	  c=teclado.nextFloat();
	  f=c*9/5+32;
	  k=c+273;
	  System.out.println("temperatura em fahrenheint:"+(f));
	  System.out.println("temperatura em kelvin:"+(k));
	  teclado.close();
  }
}

