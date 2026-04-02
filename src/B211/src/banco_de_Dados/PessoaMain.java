package banco_de_Dados;
import java.util.*;
public class PessoaMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		try {
			
			System.out.println("Informe seu nome: ");
			String nomeDig = aula.nextLine();
			
			System.out.println("informe a sua idade: ");
			int idadeDig = aula.nextInt();
			
			Pessoa natalino = new Pessoa(nomeDig, idadeDig);
			
			PessoaDAO natalinoDAO = new PessoaDAO();
			natalinoDAO.inserir(natalino);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			aula.close();
	}

}
