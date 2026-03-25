package exesPolimorfismo;

public class Onibus extends Transporte{
	
	private int numeroLinhas;

	public Onibus(double distancia, int passageiros, int numeroLinhas) {
		super(distancia, passageiros);
		this.numeroLinhas = numeroLinhas;
	}

	public int getNumeroLinhas() {
		return numeroLinhas;
	}

	public void setNumeroLinhas(int numeroLinhas) {
		this.numeroLinhas = numeroLinhas;
	}
	
	@Override
	
	public double calcularCusto() {
		return getDistancia() * 0.80;
	}
	
	@Override
	
	public void exibirDetalhes() {
		System.out.println("Distância: " + getDistancia());
		System.out.println("Quantidade de Passageiros: " + getPassageiros());
		System.out.println("Número de Linhas: " + numeroLinhas);
		System.out.println("Custo: R$ " + calcularCusto());
		
	}
}
