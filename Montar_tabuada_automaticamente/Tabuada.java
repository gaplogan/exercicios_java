import java.util.Scanner;

public class Tabuada{
	
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual Tabuada Exibir? ");
		int n = entrada.nextInt();
		
		System.out.println("--- Resultado ---");
		
		// i x n = i*n
		
		for(int i = 1; i < 11; i++){
			System.out.println("| " + i + " x " + n + " = " + (i*n));
		}
		
		System.out.println("-----------------");
	}
}



