package banco_de_Dados;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class PessoaDAO {
	
	//create 
	public void inserir(Pessoa p) throws SQLException{
		String sql = "INSERT INTO pessoa(nome, idade, cpf) VALUES (?, ?, ?)";
		//try com recursos
		try(Connection conn = Conexao.conectar();
				PreparedStatement stmt = conn.prepareStatement(sql)){
			
			stmt.setString(1, p.getNome());
			stmt.setInt(2,  p.getIdade());
			stmt.setString(3, p.getCPF());
			
			stmt.executeUpdate();
			System.out.println("Pessoa inserida com sucesso.");
	}
	
	}

	//Read Listar todas as pessoas
	public List<Pessoa> listar() throws SQLException{
		
		List <Pessoa> lista = new ArrayList<>();
		String sql = "SELECT * FROM pessoas";
		
		try (Connection conn = Conexao.conectar();
				Statement stmt = conn.createStatement();
						ResultSet rs = stmt.executeQuery(sql)){
			
			while (rs.next()) {
				lista.add(new Pessoa(
				rs.getInt("id"),
				rs.getString("nome"),
				rs.getInt("idade"),
				rs.getString("cpf")
				));
			}
			
		}
		
		return lista;
	}
	
	//Update --> (Atualizar) nome e idade pelo ID
	
			public void atualizar (Pessoa p) throws SQLException{
				
				String sql = "UPDATE pessoa SET nome = ?, idade = ?, cpf = ? WHERE id = ?";
				
				try(Connection conn = Conexao.conectar();
						PreparedStatement stmt = conn.prepareStatement(sql)){
					
					stmt.setString(1, p.getNome());
					stmt.setInt(2, p.getIdade());
					stmt.setString(3, p.getCPF());
					stmt.setInt(4, p.getId());
					
					stmt.executeUpdate();
					System.out.println("Dados Atualizados.");
				}
			}
			
		//Delete
			public void excluit (int ID) throws SQLException{
				String sql = "DELETE from pessoa WHERE id = ?";
				
				try(Connection conn = Conexao.conectar();
						PreparedStatement stmt = conn.prepareStatement(sql)){
					
					stmt.setInt(1, ID);
					
					stmt.executeUpdate();
					System.out.println("Dados Excluídos.");
				
			}

}
			}