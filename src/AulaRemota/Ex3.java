package AulaRemota;
import java.util.Scanner;
public class Ex3 {
	
	
	public static void main(String[] args)
	{
		
		//Faça um Programa que leia um número e exiba o dia
		//correspondente da semana. (1- Domingo , 2- Segunda, etc.) se digitar outro valor deve aparecer “valor inválido”
		int resp;
		Scanner input = new Scanner(System.in);
		
		do 
		{
			System.out.print("Digite um valor de 1-12 para consultar o mês correspondente: ");
			resp= input.nextInt();

		}while(resp < 0 && resp>12);
		
		switch(resp) 
		{
		case 1:
			System.out.println("O mês é Janeiro");
			break;
		case 2:
			System.out.println("O mês é Fevereiro");
			break;
		case 3:
			System.out.println("O mês é Março");
			break;
		case 4:
			System.out.println("O mês é Abril");
			break;
		case 5:
			System.out.println("O mês é Maio");
			break;
		case 6:
			System.out.println("O mês é Junho");
			break;
		case 7:
			System.out.println("O mês é Julho");
			break;
		case 8:
			System.out.println("O mês é Agosto");
			break;
		case 9:
			System.out.println("O mês é Setembro");
			break;
		case 10:
			System.out.println("O mês é Outubro");
			break;
		case 11:
			System.out.println("O mês é Novembro");
			break;
		case 12:
			System.out.println("O mês é Dezembro");
			break;
		default:
			System.out.println("Valor incorreto");
			break;
		}
		
	}

}
