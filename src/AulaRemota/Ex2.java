package AulaRemota;
import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		int min= Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i=1;i<=3;i++) 
		{
		System.out.printf("Digite o %d º número: ",i);
		int resp = input.nextInt();
		
			if (resp>=max)
			{	
				max = resp;
			}
			if(resp<=min)
			{		
				min=resp;
			}
		}
		
		System.out.printf("O maior valor inserido foi %d e o menor valor foi %d",max,min);
		

	}
	
}
