package exesPolimorfismo;

public class Bicicleta extends Transporte{
	
	private String tipoFreio;

	public Bicicleta(double distancia, int passageiros, String tipoFreio) {
		super(distancia, passageiros);
		this.tipoFreio = tipoFreio;
	}

	public String getTipoFreio() {
		return tipoFreio;
	}

	public void setTipoFreio(String tipoFreio) {
		this.tipoFreio = tipoFreio;
	}
	
	@Override
	public double calcularCusto() {
		return getDistancia() * 0.0;
	}
	
	@Override
	public void exibirDetalhes() {
		System.out.println("Distância: " + getDistancia());
		System.out.println("Quantidade de Passageiros: " + getPassageiros());
		System.out.println("Tipo do Freio: " + tipoFreio);
		System.out.println("Custo: R$ " + calcularCusto());
	}
}
