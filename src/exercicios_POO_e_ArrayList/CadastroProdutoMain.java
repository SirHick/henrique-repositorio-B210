package exercicios_POO_e_ArrayList;
import java.util.*;
public class CadastroProdutoMain {
	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		int opcao;
		CadastroProduto prod = null;
		
		do {
			System.out.println("1. Adicionar");
			System.out.println("\n 2. Listar produtos");
			System.out.println("\n 3. Contar produtos");
			System.out.println("0. Sair");
			
			opcao = aula.nextInt();
			
			switch (opcao){
				
			case 1:
			{
				System.out.println("Digite o nome do produto: ");
				String nome = aula.nextLine();
				
				System.out.println("Digite o preço do produto: ");
				Double preco = aula.nextDouble();
				
				System.out.println("Digite a quantidade do produto: ");
				int quant = aula.nextInt();
				
				prod.adicionar(nome, preco, quant);
			}
				
			case 2:
			{
				prod.listarTodos();
			}
			
			default:
			{
				System.out.println("Opção inválida!");
			}
			
			}
		
	}while(opcao != 0);
	}
}
