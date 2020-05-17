package Fatorial_de_um_número;

import java.util.Scanner;

public class Fatorial{
	
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
	
		System.out.print("Digite um n�mero: ");
		int val = entrada.nextInt();
		
		int res = calculaFatorial(val);
		
		System.out.println("O fatorial de " + val + " : "+ res);
	}
	
	public static int calculaFatorial(int n){
		
		if(n == 0){
			return 1;
		}
		
		return n * calculaFatorial(n - 1);
			//	5 * fatorial(4);
				// 4 * fatorial(3);
					// 3 * fatorial(2);
						// 2 * fatorial(1);
							// 1 * fatorial(0);
								// return 1
	}
}










