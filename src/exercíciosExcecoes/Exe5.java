package exercíciosExcecoes;
import java.util.*;
public class Exe5 {

	public static void main(String[] args) {
		/*
		 Crie um programa que:
		● Peça(Scanner) ao usuário a idade
		● Se a idade for menor que 18, lance um erro com throw
		● Trate o erro com try-catch
		● Caso contrário, mostre "Acesso permitido"
		 */
		
		Scanner aula = new Scanner (System.in);
		
		try {
			System.out.println("Digite a sua idade: ");
			int idade = aula.nextInt();
			if(idade < 18) {
				throw new InputMismatchException ("Menor de Idade");
			}else {
				System.out.println("Acesso Permitido!");
			}
		}catch(InputMismatchException e){
			System.out.println("Ocorreu um erro: ");
			System.out.println("Mensagem: " + e.getMessage());
		}
		aula.close();
	}

}
