package exercicios_heranca;
import java.util.*;
public class ProdutoMain {

	public static void main(String[] args) {
		Scanner aula = new Scanner (System.in);
		
		System.out.println("Escreva o nome do livro: ");
		String nome = aula.nextLine();
		
		System.out.println("Escreva o preço: ");
		double preco = aula.nextDouble();
		
		System.out.println("Escreva a quantidade: ");
		int quantidade = aula.nextInt();
		aula.nextLine();
		System.out.println("Escreva o nome do autor: ");
		String autor = aula.nextLine();
		
		Livro livro1 = new Livro(nome, preco, quantidade, autor);
		
		
		System.out.println("Escreva o nome do Eletronico: ");
		nome = aula.nextLine();
		
		System.out.println("Escreva o preço: ");
		preco = aula.nextDouble();
		
		System.out.println("Escreva a quantidade: ");
		quantidade = aula.nextInt();
		
		System.out.println("Escreva a quantidade de meses da garantia: ");
		int garantiaMeses = aula.nextInt();
		
		Eletronico ele1 = new Eletronico(nome, preco, quantidade, garantiaMeses);
		
		
		System.out.println("\n");
		livro1.exibirDados();
		System.out.println("\n");
		ele1.exibirDados();
		
		aula.close();
	}

}
