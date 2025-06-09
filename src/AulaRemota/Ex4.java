package AulaRemota;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		float soma=0;
		
		for(int i=1;i<=2;i++)
		{
			System.out.printf("Digite sua %dª nota: ",i);
			String resp = input.next();
			resp = resp.replace(",", ".");
			float nota = Float.parseFloat(resp);
			soma+=nota;
		
		}
		float media = soma/2;
		
		System.out.printf("Sua média foi: %.1f",media);
		
		

	}

}
