package exesPolimorfismo;

public class Carro extends Transporte{
	
	private String tipoCombustivel;

	public Carro(double distancia, int passageiros, String tipoCombustivel) {
		super(distancia, passageiros);
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}
	
	 @Override
	 public double calcularCusto() {
		 return getDistancia() * 1.50;
	 }
	
	 @Override
	 public void exibirDetalhes() {
		 System.out.println("Distância: " + getDistancia());
		 System.out.println("Quantidade de Passageiros: " + getPassageiros());
		 System.out.println("Tipo do Combustível: " + tipoCombustivel);
		 System.out.println("Custo: R$ " + calcularCusto());
	 }
}
