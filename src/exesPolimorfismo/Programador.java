package exesPolimorfismo;
public class Programador extends Funcionario {
    private int horasExtras;
    private double valorHoraExtra;

    public Programador(String nome, double salarioBase, int horasExtras, double valorHoraExtra) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (horasExtras * valorHoraExtra);
    }

    @Override
    public void exibirContracheque() {
        System.out.println("═══ CONTRACHEQUE - PROGRAMADOR ═══");
        System.out.println("Nome: " + getNome());
        System.out.printf("Salário Base: R$ %.2f\n", getSalarioBase());
        System.out.println("Horas Extras: " + horasExtras + "h");
        System.out.printf("Valor Hora Extra: R$ %.2f\n", valorHoraExtra);
        double totalExtras = horasExtras * valorHoraExtra;
        System.out.printf("Total de Extras: R$ %.2f\n", totalExtras);
        System.out.printf("SALÁRIO TOTAL: R$ %.2f\n", calcularSalario());
        System.out.println();
    }
}