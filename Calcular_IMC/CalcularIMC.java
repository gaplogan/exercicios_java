import java.util.Scanner;

public class CalcularIMC {
	
	public static void main(String args[]){
		
		Scanner entrada = new Scanner(System.in);
		
		double peso, altura, valorIMC;
		
		System.out.println();
		System.out.print("Informe o seu peso em kg: ");
		peso = entrada.nextDouble();
		
		System.out.print("Informe a altura em metros: ");
		altura = entrada.nextDouble();
        
        entrada.close();
        
		valorIMC = peso / (altura * altura);
		
		if(valorIMC < 20){
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Abaixo do peso.");
			System.out.println();
			
		} else if(valorIMC >= 20 && valorIMC <= 24){
			
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Normal");
			System.out.println();
			
		} else if(valorIMC >= 25 && valorIMC <= 29){
			
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Acima do peso.");
			System.out.println();
			
		} else if(valorIMC >= 30 && valorIMC <= 34){
			
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Obeso.");
			System.out.println();
			
		} else {
			
			System.out.println();
			System.out.println("IMC = " + valorIMC + " Muito Obeso.");
			System.out.println();
		}
	}
}
