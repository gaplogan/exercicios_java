public class Calculadora{
	
	public static void main(String args[]){
		
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[2]);
		
		String operacao = args[1];
		
		double resultado = 0;
		
		switch(operacao){
			default:
				System.out.println("Operação Inválida");
				break;
			case "+":
				resultado = num1 + num2;
				System.out.println("O Resultado da Soma é: " + resultado);
				break;
			case "-":
				resultado = num1 - num2;
				System.out.println("O Resultado da Subtração é: " + resultado);
				break;
			case "x":
			case "X":
				resultado = num1 * num2;
				System.out.println("O Resultado da Multiplicação é: " + resultado);
				break;
			case "/":
			case ":":				
				if(num2 == 0){
					System.out.println("Não é possível dividir por zero.");
				}else{
					resultado = num1 / num2;					
					System.out.println("O Resultado da Divisão é: " + resultado);
				}				
				break;
		}
	}
}



