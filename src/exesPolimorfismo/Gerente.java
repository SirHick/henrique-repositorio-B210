package exesPolimorfismo;

public class Gerente extends Funcionario{
	
	private double bonusFixo;

	public Gerente(String nome, double salarioBase, double bonusFixo) {
		super(nome, salarioBase);
		this.bonusFixo = bonusFixo;
	}

	public double getBonusFixo() {
		return bonusFixo;
	}

	public void setBonusFixo(double bonusFixo) {
		this.bonusFixo = bonusFixo;
	}
	
	@Override
	public double calcularSalario() {
		return getSalarioBase() + getBonusFixo();
	}
	
	@Override
    public void exibirContracheque() {
        System.out.println("═══ CONTRACHEQUE - GERENTE ═══");
        System.out.println("Nome: " + getNome());
        System.out.printf("Salário Base: R$ %.2f\n", getSalarioBase());
        System.out.printf("Bônus Fixo: R$ %.2f\n", bonusFixo);
        System.out.printf("SALÁRIO TOTAL: R$ %.2f\n", calcularSalario());
        System.out.println();
    }
}