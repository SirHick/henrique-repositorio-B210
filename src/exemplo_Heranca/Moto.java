package exemplo_Heranca;

public class Moto extends Veiculo{
	//atributo da classe Moto
	private int cilindradas;
	
	
	//construtor vai referenciar a superClasse
	public Moto(String marca, String modelo, int ano, int cilindradas) {
		super(marca, modelo, ano);
		this.cilindradas = cilindradas;
	}


	public int getCilindradas() {
		return cilindradas;
	}


	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override //indica que o método está sendo sobreescrito
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Cilindradas: " + cilindradas);
	}
	
}
