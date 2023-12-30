package exercicios;
import java.util.Scanner;
public class Exercicio_8
{
    public static void main(String[] args)
    {
        int nota_1,nota_2,nota_3,peso_1,peso_2,peso_3,media_final;
        Scanner teclado=new Scanner(System.in);

        System.out.print("Digite a primeira nota:");
        nota_1= teclado.nextInt();
        System.out.print("Digite a segunda nota:");
        nota_2= teclado.nextInt();
        System.out.print("Digite a terceira nota:");
        nota_3=teclado.nextInt();
        peso_1=1;
        peso_2=2;
        peso_3=3;
        media_final=((nota_1*peso_1)+(nota_2*peso_2)+(nota_3*peso_3))/(peso_1+peso_2+peso_3);
        System.out.println("Media final:"+(media_final));
        teclado.close();
    }
}
