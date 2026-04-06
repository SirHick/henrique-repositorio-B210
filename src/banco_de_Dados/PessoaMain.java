package banco_de_Dados;
import java.util.*;
public class PessoaMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		try {
			
			System.out.println("Informe seu nome: ");
			String nomeDig = aula.nextLine();
			
			System.out.println("Informe a sua idade: ");
			int idadeDig = aula.nextInt();
			
			aula.nextLine();
			
			System.out.println("Digite o seu CPF: ");
			String cpfDig = aula.nextLine();
			
			Pessoa natalino = new Pessoa(nomeDig, idadeDig, cpfDig);
			
			PessoaDAO natalinoDAO = new PessoaDAO();
			natalinoDAO.inserir(natalino);
			
			//leitura do banco de dados
			
			List<Pessoa> lista = natalinoDAO.listar();
			
			for(Pessoa p : lista) {
				System.out.println(p);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			aula.close();
	}

}