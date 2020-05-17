package Media_de_tres_numeros;

import java.util.Scanner;

public class Media{
	
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		double num1, num2, num3, media;
		
		System.out.print("Digite o primeiro valor: ");
		num1 = entrada.nextDouble();

		System.out.print("Digite o segundo valor: ");
		num2 = entrada.nextDouble();

		System.out.print("Digite o terceiro valor: ");
		num3 = entrada.nextDouble();
		
		media = (num1 + num2 + num3) / 3;
		
		System.out.println("A m�dia dos valores �: " + media);
	}
}





