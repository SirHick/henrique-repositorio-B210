package exemplos_heranca;
import java.util.*;
public class Teste_heranca {
	
	private ArrayList<String> nomes = new ArrayList<>();
	
	public void adicionarNome(String nome) {
		nomes.add(nome);
		System.out.println("Adicionado");
}
	
	public void listarNomes() {
		if(nomes.isEmpty()) {
			System.out.println("Lista vazia");
		}else {
			System.out.println(" == Nomes Cadastrados == ");
		for(String total : nomes) {
			System.out.println(total);
		}
		}
	}
	
	public void removerNome(String nome) {
		if(nomes.remove(nome)) {
			System.out.println("Nome removido");
		}else {
			System.out.println("Não encontrado");
		}
	}
	
	public void buscarNome(String nome) {
		if(nomes.contains(nome)) {
			int posicao = nomes.indexOf(nome);
			System.out.println("Encontrado na posição: " + (posicao + 1));
		}else {
			System.out.println("Nome não encontrado");
		}
	}
	
}