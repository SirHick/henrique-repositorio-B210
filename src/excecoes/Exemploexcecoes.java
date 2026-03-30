package excecoes;

public class Exemploexcecoes {

	public static void main(String[] args) {
		
		try {
			//vou tentar ir ao banheiro
			int resultado = 223 /  0;
			System.out.println(resultado);
		}catch(Exception e) {
			//deu problema
			System.out.println("Ocorreu um erro: ");
			System.out.println("Mensagem: " +e.getMessage());
			System.out.println("Detalhes do erro: ");
			e.printStackTrace();
			
			
		}finally {
			//lavar as mãos sempre
			System.out.println("Bloco finally executado! ");
			
		}
	}

}
