import java.util.Scanner;

public class NumerosPrimos
{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		String resultado = "";
		int num, quantDivisores = 0;
		
		System.out.println("Digite um número para verificar se é primo");
		System.out.print("Número: ");
		num = entrada.nextInt();	

		if(num < 2){
			System.out.println("Número inválido.");
		}
		
		for(int i = 1; i <= num; i++) {
			if ((num % i) == 0) {
				quantDivisores++;
			}
		}

		if (quantDivisores == 2) {
			System.out.println("O número " + num + " é primo.");
		} else {
			System.out.println("O número " + num + " não é primo.");
		}
	}
}
