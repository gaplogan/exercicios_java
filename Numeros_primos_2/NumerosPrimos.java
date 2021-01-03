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
                
                // para ser numero primo tem que ser igual ou maior que 2.
		if(num < 2){
                        // se for menor que 2 não é primo.
			System.out.println("N�mero inv�lido.");
		}
		
                // Para ser número primo só pode ter 2 divisores, os divisores são 1 e o proprio numero.
		for(int i = 1; i <= num; i++) {
                        // o ciclo verifica passa por todos os antecessores do numero.
                        // a cada passagem verifica se o número e divisivel por esse antecessor.
			if ((num % i) == 0) {
                                // se for divisivel por este antecessor, incrementa a variavel de controle.
				quantDivisores++;
			}
		}

                // no final verifica quantos divisores encontrou.
		if (quantDivisores == 2) {
                        // se encontrou somente 2 é primo.
                        // já que só tem 2 divisores, 1 e o próprio número.
			System.out.println("O n�mero " + num + " � primo.");
		} else {
                        // caso contrario tem mais divisores portanto não é primo.
			System.out.println("O n�mero " + num + " n�o � primo.");
		}
	}
}
