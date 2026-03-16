package exercicios_POO_e_ArrayList;

import java.util.ArrayList;

public class AgendaContato {
	
	private String nome; 
	private String telefone;
	
	public AgendaContato(String nome, String telefone) {
		
		this.nome = nome;
		this.telefone = telefone;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome + " \n" + " Seu telefone: " + telefone);
	}
	
	private ArrayList<AgendaContato> lista =  new ArrayList<>();

	public ArrayList<AgendaContato> getLista() {
		return lista;
	}

	public void setLista(ArrayList<AgendaContato> lista) {
		this.lista = lista;
	}
	
	public void adicionarContato(String nome, String telefone) {
		AgendaContato addContato = new AgendaContato(nome, telefone);
		lista.add(addContato);
		System.out.println("Adicionado com sucesso.");
	}
	
	public void listarContato() {
		if(lista.isEmpty()) {
			System.out.println("Agenda vazia.");
			return;
		}
		System.out.println(" === Lista Contatos === ");
		for(AgendaContato total : lista) {
			total.exibirDados();
			System.out.println("-----------------------");
		}
		System.out.println("\n Total: " + lista.size() + " contatos");
	}
	
	public void buscarContato(String nomeBuscado) {
		
		for (AgendaContato contato : lista) {
			
			if (contato.getNome().equalsIgnoreCase(nomeBuscado)) {
				System.out.println("\nContato encontrado:");
				contato.exibirDados();
				return; 
			}
	
	
		for(AgendaContato nomes : lista) {
		nomes.exibirDados();
	}
}
}
}