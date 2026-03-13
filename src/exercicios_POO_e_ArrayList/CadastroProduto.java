package exercicios_POO_e_ArrayList;
import java.util.*;

public class CadastroProduto {
	
	private String nome;
	private double preco;
	private int qtd;
	
	public CadastroProduto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}
	
	public void exibirDados() {
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Quantidade: " + qtd);
	}
	private ArrayList<CadastroProduto> lista = new ArrayList<>();

	public ArrayList<CadastroProduto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<CadastroProduto> lista) {
		this.lista = lista;
	}

	public void adicionar(String nome, double preco, int qtd) {
		CadastroProduto novoProduto = new CadastroProduto(nome, preco, qtd);
		lista.add(novoProduto);
		System.out.println("Produto adicionado.");
	}

	public void listarTodos() {
		if(lista.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
			return;
		}
		System.out.println("=== Lista Produtos === ");
		for(CadastroProduto total : lista) {
			total.exibirDados();
			System.out.println("-----------------------");
		}
		System.out.println("\n Total: " + lista.size() + " produtos");
	}
	
	public void contarProduto()
	{
		
	}
}