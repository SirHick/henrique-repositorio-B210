package exercicios_heranca;

public class Eletronico extends Produto{
	
	private int garantiaMeses;

	public Eletronico(String nome, double preco, int qtd, int garantiaMeses) {
		super(nome, preco, qtd);
		this.garantiaMeses = garantiaMeses;
	}

	public int getGarantiaMeses() {
		return garantiaMeses;
	}

	public void setGarantiaMeses(int garantiaMeses) {
		this.garantiaMeses = garantiaMeses;
	}
	
	@Override
	
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Garantia em meses: " + garantiaMeses);
	}
	
}
