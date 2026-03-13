package exercicios_POO_e_ArrayList;

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
		System.out.println("Nome produto: " + nome + " , preço: " + preco + " e possui " + qtd + " no estoque.");
	}
}
