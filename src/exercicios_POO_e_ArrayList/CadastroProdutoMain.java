package exercicios_POO_e_ArrayList;
import java.util.*;

public class CadastroProdutoMain {
	public static void main(String[] args) {
		
		Scanner aula = new Scanner(System.in);
		int opcao;
		
		
		CadastroProduto prod = new CadastroProduto("", 0.0, 0);
		
		do {
			System.out.println("\n === MENU ===");
			System.out.println(" 1. Adicionar");
			System.out.println(" 2. Listar produtos");
			System.out.println(" 3. Contar produtos");
			System.out.println(" 0. Sair");
			System.out.print(" Escolha: ");
			
			opcao = aula.nextInt();
			
			switch (opcao) {
				
			case 1:
				
				aula.nextLine(); 
				
				System.out.print("Digite o nome do produto: ");
				String nome = aula.nextLine();
				
				System.out.print("Digite o preço do produto: ");
				double preco = aula.nextDouble();
				
				System.out.print("Digite a quantidade do produto: ");
				int quant = aula.nextInt();
				
				prod.adicionar(nome, preco, quant);
				System.out.println("\nSucesso na execução!");
				break; 
				
			case 2:
				prod.listarTodos();
				break;
			
			case 3:
				prod.contarProduto();
				break;
				
			case 0:
				System.out.println("Saindo do sistema...");
				break;
				
			default:
				System.out.println("Opção inválida!");
				break;
			}
		
		} while(opcao != 0);
		
		
		aula.close();
	}
}