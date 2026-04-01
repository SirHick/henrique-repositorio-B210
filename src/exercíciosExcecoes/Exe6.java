package exercíciosExcecoes;
import java.util.*;
public class Exe6 {

	public static void main(String[] args) {
		/*
		 Crie um programa que:
		● Peça(Scanner) uma senha ao usuário
		● Se a senha tiver menos de 6 caracteres, lance um erro
		● Caso contrário, mostre "Senha válida"
		● Use try-catch para tratar o erro
		 */
		
		Scanner aula = new Scanner (System.in);
		
		try {
			System.out.println("Digite uma senha: ");
			String senha = aula.nextLine();
			if(senha.length() < 6) {
				throw new InputMismatchException ("Senha menor que 6 caracteres.");
			}else {
				System.out.println("Senha aceita");
			}
		}catch(InputMismatchException e) {
			System.out.println("ERRO: ");
			System.out.println("Mensagem: " + e.getMessage());
		}
		aula.close();
	}

}
