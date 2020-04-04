public class Calculadora
{
	public static void main(String args[])
	{
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[2]);
		String operacao = args[1];
		
		double resultado = 0;
		
		switch(operacao)
		{
			default:
				System.out.println("Erro, opção inválida");
				break;
			case "+":
				resultado = num1 + num2;
				System.out.println("O resultado da soma é: " + resultado);
				break;
			case "-":
				resultado = num1 - num2;
				System.out.println("O resultado da subtração é: " + resultado);
				break;
			case "x":
			case "X":
			resultado = num1 * num2;
				System.out.println("O resultado da multiplicação é: " + resultado);
				break;
			case "/":
			case ":":
				if(num2 == 0){
					System.out.println("Não é possível dividir por 0 (zero).");					
				}else{
					resultado = num1 / num2;
					System.out.println("O resultado da divisão é: " + resultado);
				}
				break;
		}
	}
}
