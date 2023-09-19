import java.util.Scanner;

public class ControleDeFluxo{
    
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o primeiro número: ");
		int primeiroNumero = input.nextInt();
		
		System.out.print("\nDigite o segundo número: ");
		int segundoNumero = input.nextInt();

		try {
		    contarNumeros(primeiroNumero, segundoNumero);
		    
		} catch(ParametrosInvalidosException e) {
		    System.out.println("O segundo parâmetro (número digitado) deve ser maior que o primeiro número");
		}
	}
	
	static void contarNumeros (int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException{
	    if(primeiroNumero > segundoNumero){
			System.out.println("\nO primeiro número digitado foi: " + primeiroNumero);
			System.out.println("O segundo número digitado foi: " + segundoNumero);
	        int contagem = primeiroNumero - segundoNumero;
            for(int i = 0; i < contagem; i++){
                int numeroUsuário = i + 1;
	            System.out.println("Imprindo número: " + numeroUsuário);
            }
	    }
        else{
            throw new ParametrosInvalidosException();
	        
        }
    }
    
    
}
    class ParametrosInvalidosException extends Exception {
        
}