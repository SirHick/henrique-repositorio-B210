package exemplos_encapsulamento;
import java.util.*;
public class PessoaMain {

	public static void main(String[] args) {
		/*
		Pessoa p1 = new Pessoa("Natalino", 50 , "12345678910");
		
		System.out.println(p1.getNome() + " \n" + p1.getIdade() + " \n" + p1.getCPF());
		
		p1.setIdade(53);
		System.out.println(p1.getIdade());
		*/
		
		Scanner aula = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = aula.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = aula.nextInt();
		aula.nextLine();
		
		System.out.println("Digite o seu CPF: ");
		String CPF = aula.nextLine();
		
		Pessoa p1 = new Pessoa(nome, idade, CPF);
		
		System.out.println(p1.getNome());
		
		aula.close();
	}

}
