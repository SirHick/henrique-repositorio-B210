package exercicios_POO;

public class Aluno {
	
	/*
		Desenvolva uma classe chamada Aluno que possua os atributos privados
	nome (String), nota1 (double) e nota2 (double). Crie um construtor que receba
	esses valores e utilize this para inicializar os atributos da classe. Implemente os
	métodos getters e setters.
		Crie um método chamado calcularMedia() que calcule e retorne a média das
	duas notas. Em seguida, implemente um método chamado mostrarSituacao()
	que verifique a média do aluno e imprima no terminal se o aluno está aprovado
	ou reprovado. Considere que a média mínima para aprovação é 7. No método
	main, crie um objeto da classe Aluno e exiba a situação do aluno.
	 */
	
	private String nome;
	private double nota1;
	private double nota2;
	double media = 0;
	
	public Aluno(String nome, double nota1, double nota2) {
		this.nome = nome;
		this.nota1 = nota1;
		this.nota2 = nota2;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	
	void calcularMedia() {
		double soma = nota1 + nota2;
		
		media = media+(soma/2);
		System.out.println("Sua média é: " + media);
	}
	
	void mostrarSituação() {
		if(media < 7.0) {
			System.out.println("Reprovado");
		}else{
			System.out.println("Aprovado");
		}
	}
	
}
