package exemplos_encapsulamento;

public class Pessoa {
	
	//atributos
	private String nome;
	private int idade;
	private String CPF;
	
	//construtor completo
	public Pessoa(String nome, int idade, String CPF) {
		this.nome = nome;
		this.idade = idade;
		this.CPF = CPF;
	}
	//criando métodos de acesso Getters e Setters

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

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	//Getters --> chama o atributo   .get
	//Setters --> modifica o atributo    .set
	
	
	
}
