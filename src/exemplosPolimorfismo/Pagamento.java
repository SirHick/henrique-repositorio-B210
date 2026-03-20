package exemplosPolimorfismo;

public class Pagamento {
	
	private String titular;
	private double valor;
	
	public Pagamento(String titular, double valor) {
		
		this.titular = titular;
		this.valor = valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	 public void processarPagamento() {
		System.out.println("Processando Pagamento\n");
		System.out.println("Titular: " + titular);
		System.out.println("Valor: R$ " + String.format("%.2f", valor));
		System.out.println("PAGAMENTO PROCESSADO");
	}
	//método sem o 'void' deve ter um valor para retornar (return), senão dá erro
	 public double calcularTaxa() {
		 return valor * 0.02;
	 }
	 
	 
	 public void exibirDados() {
		 System.out.println("Titular: " + titular);
		 System.out.println("Valor: R$ " + String.format("%,2f", valor));
	 }
}
