package exercicios_heranca;

public class Produto {
	private String nome;
	private double preco;
	private int qtd;
	
	public Produto(String nome, double preco, int qtd) {
		super();
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
		System.out.println("== DADOS DO PRODUTO == ");
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + " R$ " + preco);
		System.out.println("Quantidade: " + qtd);
	}
}
