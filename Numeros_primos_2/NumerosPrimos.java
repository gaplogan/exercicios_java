package Numeros_primos_2;

import java.util.Scanner;

public class NumerosPrimos
{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		String resultado = "";
		int num, quantDivisores = 0;
		
		System.out.println("Digite um n�mero para verificar se � primo");
		System.out.print("N�mero: ");
		num = entrada.nextInt();	

		if(num < 2){
			System.out.println("N�mero inv�lido.");
		}
		
		for(int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				quantDivisores++;
			}
		}

		if (quantDivisores == 2) {
			System.out.println("O n�mero " + num + " � primo.");
		} else {
			System.out.println("O n�mero " + num + " n�o � primo.");
		}
	}
}
