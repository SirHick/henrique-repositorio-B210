package exercíciosExcecoes;
import java.util.*;
public class Exe2 {

	public static void main(String[] args) {
		//Peça(Scanner) para o usuário digitar um número inteiro.
		//Caso ele digite algo inválido (texto), mostre uma mensagem de erro.
		
		Scanner aula = new Scanner(System.in);
		
		try {
			System.out.println("Digite um número inteiro: ");
			int num = aula.nextInt();
			System.out.println(num);
			
		}catch(Exception e) {
			System.out.println("ERRO! Digite apenas números inteiros!");
		}
		System.out.println("Programa Finalizado.");
		aula.close();
	}

}
