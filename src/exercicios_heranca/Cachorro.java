package exercicios_heranca;

public class Cachorro extends Animal{
	
	private String raca;

	public Cachorro(String nome, int idade, String raca) {
		super(nome, idade);
		this.raca = raca;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Raça: " + raca);
		
	}
	
}
