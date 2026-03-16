package exercicios_POO_e_ArrayList;
import java.util.*;
public class AgendaContatoMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		AgendaContato cont = new AgendaContato("","");
		
		int opcao;
		
		do {
			System.out.println("\n === MENU ===");
			System.out.println("1. Adicionar contato");
			System.out.println("2. Listar contatos");
			System.out.println("3. Buscar por nome");
			System.out.println("4. Remover contato");
			System.out.println("0. Sair");
			
			opcao = aula.nextInt();
			
			switch (opcao) {
				
			case 1:
				aula.nextLine(); 
				
				System.out.print("Digite o nome do contato: ");
				String nome = aula.nextLine();
		
				System.out.println("Digite o número do contato: ");
				String telefone = aula.nextLine();
				
				cont.adicionarContato(nome, telefone);
				break;
				
			case 2:
				cont.listarContato();
				break;
	
			case 3:
				System.out.println("Digite o contato desejado: ");
				String contato = aula.nextLine();
				cont.buscarContato(contato);
				break;
			}
			
		} while(opcao != 0);
		
		
		aula.close();
	}

}
