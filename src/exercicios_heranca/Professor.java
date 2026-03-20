package exercicios_heranca;

public class Professor extends Pessoa{
	
	private String disciplina;
	private double salario;
	
	public Professor(String nome, String cPF, int idade, String disciplina, double salario) {
		super(nome, cPF, idade);
		this.disciplina = disciplina;
		this.salario = salario;
	}

	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	@Override
	public void exibirDados() {
		super.exibirDados();
		System.out.println("Disciplina: " + disciplina);
		System.out.println("Salário: " + salario);
	}
	
}
