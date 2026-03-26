package exesAbstracao;

public class Aluno extends Pessoa{
	
	private String curso;

	public Aluno(String nome, String curso) {
		super(nome);
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	@Override
	public void apresentar() {
		System.out.println("Sou aluno do curso de " + curso);
	}
	
}
