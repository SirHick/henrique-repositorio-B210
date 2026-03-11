package exercicios_POO;

import java.util.Scanner;

public class AlunoMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner(System.in);
		
		System.out.println("Digite o nome do aluno: ");
		String nome = aula.nextLine();
		
		System.out.println("Digite a nota 1: ");
		double nota1 = aula.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		double nota2 = aula.nextDouble();
		
		Aluno matricula1 = new Aluno(nome, nota1, nota2);
		
		matricula1.calcularMedia();
		matricula1.mostrarSituação();
		
		aula.close();
		
	}

}
