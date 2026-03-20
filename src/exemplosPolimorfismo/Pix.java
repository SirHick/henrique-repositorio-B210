package exemplosPolimorfismo;

public class Pix extends Pagamento{
	
	private String chavePix;

	public Pix(String titular, double valor, String chavePix) {
		super(titular, valor);
		this.chavePix = chavePix;
	}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	
	
	
}
