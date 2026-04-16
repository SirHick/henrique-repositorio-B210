package exe_BD2;
import java.util.*;
public class GameMain {

	public static void main(String[] args) {
		
		Scanner aula = new Scanner (System.in);
		
		try {
			
			System.out.println("Informe o titulo do jogo: ");
			String titulo = aula.nextLine();
			
			System.out.println("Informe a plataforma do jogo: ");
			String plataforma = aula.nextLine();
			
			System.out.println("Digite o genero do jogo: ");
			String genero = aula.nextLine();
			
			System.out.println("Digite o ano de lançamento do jogo: ");
			int anoLanca = aula.nextInt();
			
			System.out.println("Digite o preco de aluguel do jogo: ");
			double precoAlug = aula.nextDouble();
			
			Game game = new Game(titulo, plataforma, genero, anoLanca, precoAlug);
			
			GameDAO gameDAO = new GameDAO();
			gameDAO.inserir(game);
			
			//leitura do banco de dados
			
			List<Game> lista = gameDAO.listar();
			
			for(Game ga : lista) {
				System.out.println(ga);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
			aula.close();
	}

}