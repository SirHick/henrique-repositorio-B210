package exe_BD;
import java.util.*;
public class ProdutoMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		try {
			
			System.out.println("Informe o nome do produto: ");
			String nomeDig = aula.nextLine();
			
			System.out.println("Informe o preço do produto: ");
			double precoDig = aula.nextDouble();
			
			aula.nextLine();
			
			System.out.println("Digite a quantidade do produto: ");
			int quantidadeDig = aula.nextInt();
			
			Produto prod = new Produto(nomeDig, precoDig, quantidadeDig);
			
			ProdutoDAO prodDAO = new ProdutoDAO();
			prodDAO.inserir(prod);
			
			//leitura do banco de dados
			
			List<Produto> lista = prodDAO.listar();
			
			for(Produto p : lista) {
				System.out.println(p);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			aula.close();
	}

}