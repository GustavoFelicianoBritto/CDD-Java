package AulaRemota;
import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite seu gênero\nF - Feminino M- Masculino O- Outro: ");
		String resp= input.next();
		
		if(resp.equalsIgnoreCase("F")) 
		{
			System.out.println("Gênero feminino selecionado");
		}
		else if(resp.equalsIgnoreCase("M")) 
		{
			System.out.println("Gênrero masculino selecionado");
		}
		else if(resp.equalsIgnoreCase("O"))
		{
			System.out.println("Outro gênero selecionado");
		}
		else
		{
			System.out.println("Opção inválida");
		}
		

	}

}
