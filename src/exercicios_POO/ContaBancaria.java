package exercicios_POO;

public class ContaBancaria {
	
	/*
		Crie uma classe chamada ContaBancaria com os atributos privados titular
	(String) e saldo (double). Implemente um construtor para inicializar os atributos
	utilizando this. Crie os métodos getters e setters necessários.
		Desenvolva também os métodos depositar(double valor), que aumenta o saldo
	da conta, e sacar(double valor), que diminui o saldo da conta. O saldo não
	pode ficar negativo. Crie ainda um método chamado mostrarSaldo() que exiba
	o saldo atual no terminal. No método main, crie um objeto da classe
	ContaBancaria, realize um depósito, depois um saque e mostre o saldo final.
	 */
	
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	
	
	public String getTitular() {
		return titular;
	}



	public void setTitular(String titular) {
		this.titular = titular;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	void depositar(double valor) {
		System.out.println("Saldo após depósito: " + (saldo += valor));
		if(saldo <= 0) {
			System.out.println("Erro");
		}else {
			System.out.println("Operação Válida.");
		}
	}
	
	void sacar(double valor) {
		
		if(saldo <= 0) {
			System.out.println("Não é possível fazer a operação.");
		}else {
			saldo -= valor;
		}
	}
	
	void mostrarSaldo() {
		System.out.println("Seu saldo é: " + saldo);
	}
	
}
