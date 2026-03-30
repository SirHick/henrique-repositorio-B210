package excecoes;
import java.util.*;
public class Exe3excecoes {

	public static void main(String[] args) {
		Scanner aula = new Scanner(System.in);
		
		
		try {
			System.out.println("Digite o primeiro número: ");
			int n1 = aula.nextInt();
			
			System.out.println("Digite o segundo número: ");
			int n2 = aula.nextInt();
			
			int soma = n1 + n2;
			
			System.out.println("A soma é: " + soma);
			
		}catch(Exception e) {
			System.out.println("Erro! Digite apenas números inteiros!");
				
		}
		System.out.println("Programa finalizado.");	
			
		aula.close();
	}

}
