package exercicios_POO;

import java.util.*;

public class ContaBancariaMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner(System.in);
		
		System.out.println("Digite o nome do titular: ");
		String titular = aula.nextLine();
		
		System.out.println("Digite o seu saldo: ");
		double saldo = aula.nextDouble();
		
		System.out.println("Digite o valor para a operação Depósito: ");
		double valorDep = aula.nextDouble();
		
		System.out.println("Digite o valor para a operação Depósito: ");
		double valorSaque = aula.nextDouble();
		
		ContaBancaria cb1 = new ContaBancaria(titular, saldo);
		
		cb1.depositar(valorDep);
		cb1.sacar(valorSaque);
		cb1.mostrarSaldo();
		
		aula.close();

	}

}
