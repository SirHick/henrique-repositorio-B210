package exercíciosExcecoes;

public class Exe3 {

	public static void main(String[] args) {
		/*
		Crie um programa que tente fazer uma divisão e utilize finally para mostrar
		uma mensagem final, independente de erro.
		 */
		
		try {
			int n1 = 224;
			int n2 = 2;
			double resultado = (n1 + n2) / 0;
			System.out.println(resultado);
			
			
		}catch(Exception e) {
			
			System.out.println("Ocorreu um erro: ");
			System.out.println("Mensagem: " +e.getMessage());
			System.out.println("Detalhes do erro: ");
			e.printStackTrace();
			
		}finally {
			System.out.println("Programa Finalizado!");
		}
		
	}

}
