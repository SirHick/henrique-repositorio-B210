package exercicios_heranca;

public class Pessoa {
	
	private String nome;
	private String CPF;
	private int idade;
	
	public Pessoa(String nome, String cPF, int idade) {
		this.nome = nome;
		CPF = cPF;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
}
