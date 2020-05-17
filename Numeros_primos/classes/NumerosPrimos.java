package classes;

public class NumerosPrimos{
	
	public boolean verificarPrimo(int num){
		
		if(num < 2){
			return false;
		}
		
		for(int i = 2; i < num; i++) {
			if ((num % i) == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public String verTodos(int num){
		
		String resultado = "";
		
		for(int i = 2; i <= num; i++){
			if(verificarPrimo(i)){
				resultado += i + " ";
			}
		}
		
		return resultado;
	}
}
