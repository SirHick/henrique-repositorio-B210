package exesPolimorfismo;

public class Papagaio extends Animal{
	private String corPenas;
	public Papagaio(String nome, int idade, double peso, String corPenas) {
		super(nome, idade, peso);
		this.corPenas = corPenas;
	}
	public String getCorPenas() {
		return corPenas;
	}
	
	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}
	

	@Override
	public void emitirSom() {
		System.out.println("Olá. Quero biscoito!");
	}
	
	@Override
	public String getTipoAlimento() {
		return "Onívoro - Sementes e Frutas";
	}
	
	public void falar() {
		emitirSom();
	}
}
