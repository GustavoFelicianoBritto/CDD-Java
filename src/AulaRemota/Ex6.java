package AulaRemota;
import java.util.Scanner;

public class Ex6 {
	
	
	
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int suspeita=0;
		String[] perguntas= {"Você telefonou para a vítima?","Esteve no local do crime?","Mora perto da vítima?","Devia para a vítima?"
				,"Já trabalhou com a vítima?"};
		
		for(int i=0;i<=perguntas.length-1;i++)
		{
			System.out.printf(""+perguntas[i]+"\n1- Sim 0- Não ");
			int resp = input.nextInt();
			
			if(resp!=0)
			{
				suspeita+=1;
			}
		}
		
		if(suspeita>=5)
		{
			System.out.printf("Assassino!! (Nível de suspeita: %d)",suspeita);
		}
		else if(suspeita>=3)
		{
			System.out.printf("Cúmplice (Nível de suspeita: %d)",suspeita);
		}
		else if(suspeita>=2)
		{
			System.out.printf("Suspeito... (Nível de suspeita: %d)",suspeita);
		}
		else
		{
			System.out.printf("Inocente (Nível de suspeita: %d)",suspeita);
		}
		
		
		
	}

}
