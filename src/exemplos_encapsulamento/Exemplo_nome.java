package exemplos_encapsulamento;

	import java.util.ArrayList;

	public class Exemplo_nome {

	    private ArrayList<String> nomes = new ArrayList<>();

	    public void adicionarNome(String nome) {
	        nomes.add(nome);
	        System.out.println("Nome adicionado!");
	    }

	    public void listarNomes() {
	        if (nomes.isEmpty()) {
	            System.out.println("Lista vazia!");
	        } else {
	            System.out.println("\n--- NOMES CADASTRADOS ---");
	            //for (int i = 0; i < nomes.size(); i++) {
	                //System.out.println((i + 1) + ". " + nomes.get(i));
	           // }
	            for(String total:nomes) {
	            System.out.println(total);
	            }
	        }
	    }

	    public void removerNome(String nome) {
	        if (nomes.remove(nome)) {
	            System.out.println("Nome removido!");
	        } else {
	            System.out.println("Nome não encontrado!");
	        }
	    }

	    public void buscarNome(String nome) {
	        if (nomes.contains(nome)) {
	            int posicao = nomes.indexOf(nome);
	            System.out.println("Encontrado na posição " + (posicao + 1));
	        } else {
	            System.out.println("Nome não encontrado!");
	        }
	    }

	    public boolean listaVazia() {
	        return nomes.isEmpty();
	    }
	}
	
	
