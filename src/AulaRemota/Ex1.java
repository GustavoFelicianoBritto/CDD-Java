package AulaRemota;
import java.util.Scanner;

public class Ex1 {
	
	
	public static void main(String[] args) {
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Digite um valor inteiro: ");
	int resp = input.nextInt();
	
	System.out.print(resp == 0 ? "Zero": resp>0? "Positivo":"Negativo"   );
		
	}

}
