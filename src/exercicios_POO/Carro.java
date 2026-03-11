package exercicios_POO;

public class Carro {
	
	/*
		Implemente uma classe chamada Carro que possua os atributos privados
	modelo (String), ano (int) e velocidade (double). Crie um construtor que
	inicialize esses atributos utilizando a palavra-chave this. Implemente os
	métodos getters e setters.
		Crie também os métodos acelerar(double valor), que aumenta a velocidade do
	carro, e frear(double valor), que diminui a velocidade. A velocidade nunca pode
	ficar negativa. Desenvolva ainda um método chamado mostrarVelocidade() que
	exiba a velocidade atual do carro no terminal. No método main, crie um objeto
	da classe Carro, acelere o carro, depois freie e mostre a velocidade final.
	 */
	
	private String modelo;
	private int ano;
	private double velocidade;
	
	public Carro(String modelo, int ano, double velocidade) {
		this.modelo = modelo;
		this.ano = ano;
		this.velocidade = velocidade;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	void acelerar(double valor) {
		if(velocidade <= 0) {
			System.out.println("Erro");
		}else {
			System.out.println("Acelerando.");
	}
		System.out.println("Velocidade após acelerar: " + (velocidade += valor));
}
	void frear(double valor) {
		if(velocidade <= 0) {
			System.out.println("Não é possível frear algo parado.");
		}else {
			System.out.println("Freando...");
			velocidade -= valor;
	}
}
	
	void mostrarVelocidade(){
		System.out.println("Sua velocidade atual é: " + velocidade + " km/h");
	}
	
}
