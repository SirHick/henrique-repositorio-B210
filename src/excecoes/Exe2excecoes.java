package excecoes;

public class Exe2excecoes {

	public static void main(String[] args) {
		
		try {
			int idade = 20;
			if(idade < 18) {
				throw new Exception("Idade Inválida.");
			}
			
		}catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
			
		}finally {
			//throw: Cria o Erro
			//throw: Resolve o Erro
		}

	}

}
