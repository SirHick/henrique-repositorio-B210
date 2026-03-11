package exercicios_POO;

import java.util.Scanner;

public class CarroMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner(System.in);
		
		System.out.println("Digite o modelo do carro: ");
		String modelo = aula.nextLine();
		
		System.out.println("Digite o ano do carro: ");
		int ano = aula.nextInt();
		
		System.out.println("Digite sua velocidade atual: ");
		double velocidade = aula.nextDouble();
		
		System.out.println("Digite o valor para acelerar: ");
		double valorAcelerar = aula.nextDouble();
		
		System.out.println("Digite o valor para frear: ");
		double valorFrear = aula.nextDouble();
		
		Carro c1 = new Carro(modelo, ano, velocidade);
		
		c1.acelerar(valorAcelerar);
		c1.frear(valorFrear);
		c1.mostrarVelocidade();
		
		aula.close();
	}

}
