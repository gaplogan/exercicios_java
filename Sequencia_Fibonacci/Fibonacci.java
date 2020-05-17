package Sequencia_Fibonacci;

import java.util.Scanner;

public class Fibonacci{
	
	public static void main(String args[]){
		
		int numeros[] = new int[3];
		
		System.out.print("Digite um n�mero: ");
		int val = new Scanner(System.in).nextInt();
		
		System.out.println("Sequ�ncia de Fibonacci " + val + " valores");
		
		numeros[0] = 0;
		numeros[1] = 1;
		numeros[2] = 0;	

		// 0 1 1 2 3 5 8 13
		
		for(int i = 0; i < val; i++){
			
			if(i < val -1){
				System.out.print(numeros[0] + ", ");
			}else{
				System.out.print(numeros[0]);
			}		
			
			numeros[2] = numeros[0] + numeros[1];
			numeros[0] = numeros[1];
			numeros[1] = numeros[2];
		}
	}
}


