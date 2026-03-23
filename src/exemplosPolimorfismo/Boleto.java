package exemplosPolimorfismo;

public class Boleto extends Pagamento{
	
	private String codigoBarras;

	public Boleto(String titular, double valor, String codigoBarras) {
		super(titular, valor);
		this.codigoBarras = codigoBarras;
	}

	public String getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	@Override
	public void processarPagamento() {
		System.out.println("PROCESSANDO BOLETO\n");
		System.out.println("Titular: " + getTitular());
		System.out.println("Valor: R$ " + String.format("%.2f", getValor()));
		System.out.println("Código de Barras: " + codigoBarras);
		
		System.out.println("Taxa: R$ " + String.format("%.2f", calcularTaxa()));
		System.out.println("Total: R$ " + String.format("%,2f", getValor() + calcularTaxa()));
		System.out.println("Boleto gerado! Venc. 3 dias! ");
	}
	
	@Override
	public double calcularTaxa() {
		return 2.50; //taxa de R$ 2,50
	}
}
