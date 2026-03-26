package exesAbstracao;

public class PessoaMain {

	public static void main(String[] args) {
		
		Pessoa a = new Aluno("Henrique", "Automação");
		a.saudacao();
		a.apresentar();
		
		
		Pessoa prof = new Professor("André", "Redes de Comunicação");
		prof.saudacao();
		prof.apresentar();
	}

}
