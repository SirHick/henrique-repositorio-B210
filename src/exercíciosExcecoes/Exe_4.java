package exercíciosExcecoes;
import java.util.*;
public class Exe_4 {

	public static void main(String[] args) {
		/*
		 Crie um programa que Peça(Scanner) ao usuário um número inteiro
		● Valide se o número é maior que zero
		● Caso seja zero ou negativo, mostre uma mensagem de erro
		● Use try-catch para tratar entradas inválidas
		 */
		
		Scanner aula = new Scanner (System.in);
		
		try {
			System.out.println("Digite um número inteiro: ");
			int num = aula.nextInt();
			if(num <= 0) {
				throw new InputMismatchException("Igual ou menor que ZERO");
			}else {
				System.out.println("Positivo");
			}
				
		}catch(InputMismatchException e) {
			System.out.println("Ocorreu um erro: ");
			System.out.println("Mensagem: " + e.getMessage());
		}
		aula.close();
	}

}
