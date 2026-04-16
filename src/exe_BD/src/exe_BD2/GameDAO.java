package exe_BD2;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GameDAO {

	public void inserir(Game g) throws SQLException{
		String sql = "INSERT INTO games (titulo, plataforma, genero, anoLancamento, precoAluguel) values (?,?,?,?,?)";
		
		try(Connection conn = ConexaoGame.conectar();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, g.getTitulo());
			stmt.setString(2, g.getPlataforma());
			stmt.setString(3, g.getGenero());
			stmt.setInt(4, g.getAnoLancamento());
			stmt.setDouble(5, g.getPrecoAluguel());
			
			stmt.executeUpdate();
			System.out.println("Game inserido com sucesso.");
		}
		
	}
public List<Game> listar() throws SQLException{
		
		List <Game> lista = new ArrayList<>();
		String sql = "SELECT * FROM games";
		
		try (Connection conn = ConexaoGame.conectar();
				Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery(sql)){
			
			while (rs.next()) {
				lista.add(new Game(
				rs.getInt("id"),
				rs.getString("titulo"),
				rs.getString("plataforma"),
				rs.getString("genero"),
				rs.getInt("anoLancamento"),
				rs.getDouble("precoAluguel")
				));
			}
			
		}
		
		return lista;
	}
}