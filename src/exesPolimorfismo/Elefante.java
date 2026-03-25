package exesPolimorfismo;

public class Elefante extends Animal{
	
	private double comprimentoElefante;

	public Elefante(String nome, int idade, double peso, double comprimentoElefante) {
		super(nome, idade, peso);
		this.comprimentoElefante = comprimentoElefante;
	}

	public double getComprimentoElefante() {
		return comprimentoElefante;
	}

	public void setComprimentoElefante(double comprimentoElefante) {
		this.comprimentoElefante = comprimentoElefante;
	}
	
	@Override
	public void emitirSom() {
		System.out.println("PRRRUUUUU!");
	}
	
	@Override
	public String getTipoAlimento() {
		return "Herbívoro - Folhas e Frutas";
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Comprimento do Elefante: " + comprimentoElefante);
		getTipoAlimento();
		emitirSom();
	}
}
