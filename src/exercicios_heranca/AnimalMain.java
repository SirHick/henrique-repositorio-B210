package exercicios_heranca;
import java.util.*;
public class AnimalMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		System.out.println("Digite o nome: ");
		String nome = aula.nextLine();
		
		System.out.println("Digite a idade: ");
		int idade = aula.nextInt();
		aula.nextLine();
		System.out.println("Digite a raça: ");
		String raca = aula.nextLine();
		
		Cachorro dog = new Cachorro(nome, idade, raca);
		
		System.out.println("\n");
		dog.exibirDados();
		
		aula.close();
	}

}
