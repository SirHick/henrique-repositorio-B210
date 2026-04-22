package crud;

import java.sql.SQLException;
import java.util.*;

public class PessoaMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		int opcao;
		
		do {
			System.out.println("=== MENU CRUD ===");
			System.out.println("1. Inserir pessoa");
			System.out.println("2. Listar Pessoa");
			System.out.println("3. Atualizar pessoa");
			System.out.println("4. Excluir pessoa");
			System.out.println("0. SAIR");
			
			System.out.println("Escolha uma opção: ");
			
			opcao = aula.nextInt();
			aula.nextLine();
			
			switch(opcao) {
			
			case 1:
				try {
					System.out.println("Nome: ");
					String nome = aula.nextLine();
					
					System.out.println("Idade: ");
					int idade = aula.nextInt();
					
					Pessoa novaPessoa = new Pessoa(nome, idade);
					pessoaDAO.inserir(novaPessoa);
					
				}catch(SQLException e) {
					
				}
				break;
				
			case 2:
				try {
					List<Pessoa> lista = pessoaDAO.listar();
					
					if(lista.isEmpty()) {
						System.out.println("Nenhuma pessoa cadastrada.");
					}else {
						System.out.println("Lista de pessoas: ");
						for(Pessoa p : lista) {
							System.out.println(p);
						}
					}
				}catch(SQLException e) {
					System.out.println("Erro ao listar." + e.getMessage());
				}
			break;
			
			
			case 3:
				try {
					System.out.println("ID da pessoa: ");
				int idAtualizar = aula.nextInt();
				aula.nextLine();
				
				System.out.println("Novo nome: ");
				String novoNome = aula.nextLine();
				
				System.out.println("Nova Idade: ");
				int novaIdade = aula.nextInt();
				aula.nextLine();
				
				Pessoa pessoaAtualizada = new Pessoa(idAtualizar, novoNome, novaIdade);
				pessoaDAO.atualizar(pessoaAtualizada);
				
				}catch(SQLException e) {
					System.out.println("Erro ao atualizar." + e.getMessage());
				}
			break;
			
			case 4:
				try {
					System.out.println("ID para excluir: ");
					int idExcluir = aula.nextInt();
					aula.nextLine();
					
					pessoaDAO.excluir(idExcluir);
				}catch(SQLException e) {
					System.out.println("Erro ao excluir: " + e.getMessage());
			}
				break;
				
			case 0:
				System.out.println("SAINDO...");
				break;
				
			default:
				System.out.println("Valor inválido!");
                break; 
			
            } 
            
		} while(opcao != 0); 
		
        aula.close();
	} 

} 