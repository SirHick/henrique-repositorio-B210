package exercicios_heranca;

public class Livro extends Produto{
	
	private String autor;

	public Livro(String nome, double preco, int qtd, String autor) {
		super(nome, preco, qtd);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Autor: " + autor);
	}
	
}
