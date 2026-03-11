package exercicios_POO;

public class Exe_Pessoa {
	
	private String nome;
	private int idade;
	
	public Exe_Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	void apresentar() {
		System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");
	}
	
}
