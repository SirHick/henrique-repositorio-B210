package exemplosPolimorfismo;

public class CartaoCredito extends Pagamento{
	
	private String numeroCartao;

	public CartaoCredito(String titular, double valor, String numeroCartao) {
		super(titular, valor);
		this.numeroCartao = numeroCartao;
	}

	public String getNumeroCartao() {
		return numeroCartao;
	}

	public void setNumeroCartao(String numeroCartao) {
		this.numeroCartao = numeroCartao;
	}
	
	@Override
	// Sobrescrita do método com polimorfismo
	public void processarPagamento() {
		System.out.println("PROCESSANDO CARTÃO DE CRÉDITO\n");
		System.out.println("Titular: " + getTitular());
		System.out.println("Valor: R$ " + String.format("%.2f", getValor()));
		System.out.println("Cartão: **** **** **** " + numeroCartao.substring(numeroCartao.length()-4));
		
		System.out.println("Taxa: R$ " + String.format("%.2f", calcularTaxa()));
		System.out.println("Total: R$ " + String.format("%,2f", getValor() + calcularTaxa()));
		System.out.println("Pagamento com o cartão APROVADO!");
	}
	
	@Override
	
	public double calcularTaxa() {
		return getValor() * 0.03; //taxa de 3%
	}
	
}
