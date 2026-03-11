package exercicios_POO;

public class Produto {
	
	/*
		Desenvolva uma classe chamada Produto que possua os atributos privados
	nome (String), preco (double) e quantidade (int). Crie um construtor que
	inicialize esses três atributos utilizando a palavra-chave this. Implemente
	também os métodos getters e setters para todos os atributos.
		Crie um método chamado exibirProduto() que mostre no terminal o nome, o
	preço e a quantidade do produto. No método main, crie um objeto da classe
	Produto, altere o preço utilizando o método setter e depois utilize o método
	exibirProduto para mostrar os dados atualizados.
	 */
	
	private String nome;
	private double preco;
	private int qtd;
	
	public Produto(String nome, double preco, int qtd) {
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
	
	void exibirProduto() {
		System.out.println("O nome do produto é " + nome + " seu preço é de " + preco + " reais e tem " + qtd + " no estoque.");
	}
	
}
