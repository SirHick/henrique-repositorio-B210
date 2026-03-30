package exercíciosExcecoes;

public class Exe1 {

	public static void main(String[] args) {
		
		//Crie um programa que faça uma divisão entre dois números inteiros.
		//Use try-catch para tratar o erro de divisão por zero.
		
		try {
			int n1 = 223;
			int n2 = 2;
			double resultado = (n1 + n2) / 0;
			System.out.println(resultado);
			
			
		}catch(Exception e) {
			
			System.out.println("Ocorreu um erro: ");
			System.out.println("Mensagem: " +e.getMessage());
			System.out.println("Detalhes do erro: ");
			e.printStackTrace();
			
		}
	}


}