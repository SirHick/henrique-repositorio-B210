package exesPolimorfismo;

public class Leao extends Animal{
	
	public Leao(String nome, int idade, double peso) {
		super(nome, idade, peso);
		
	}

	@Override
	public void emitirSom() {
		System.out.println("ROARRR!");
	}
	
	@Override
	public String getTipoAlimento() {
		return "Carnívoro - Carne";
	}
	
	public void rugir() {
		emitirSom();
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		getTipoAlimento();
		rugir();
	}
}
