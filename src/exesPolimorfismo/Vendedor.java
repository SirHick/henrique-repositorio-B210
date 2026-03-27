package exesPolimorfismo;

public class Vendedor extends Funcionario{
	
	private double totalVendas;
	private double comissao;
	public Vendedor(String nome, double salarioBase, double totalVendas, double comissao) {
		super(nome, salarioBase);
		this.totalVendas = totalVendas;
		this.comissao = comissao;
	}
	public double getTotalVendas() {
		return totalVendas;
	}
	public void setTotalVendas(double totalVendas) {
		this.totalVendas = totalVendas;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() + (totalVendas * comissao);
	}
	
	@Override
    public void exibirContracheque() {
        System.out.println("═══ CONTRACHEQUE - VENDEDOR ═══");
        System.out.println("Nome: " + getNome());
        System.out.printf("Salário Base: R$ %.2f\n", getSalarioBase());
        System.out.printf("Total Vendas: R$ %.2f\n", totalVendas);
        double valorComissao = totalVendas * (comissao / 100.0);
        System.out.printf("Comissão (%.0f%%): R$ %.2f\n", comissao, valorComissao);
        System.out.printf("SALÁRIO TOTAL: R$ %.2f\n", calcularSalario());
        System.out.println();
    }
}