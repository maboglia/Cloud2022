package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

import entities.Scienziato;

public class ScienziatiDAOImpl implements ScienziatiDAO {

//	private Connessione miaConn = new Connessione();
	
	private Statement stat;
	private ResultSet rs;
	
	
	
	@Override
	public Set<Scienziato> findAll() throws SQLException {

		Set<Scienziato> scienziati = new HashSet<>();	
		
		this.stat = Connessione.getConn().createStatement();
		this.rs = this.stat.executeQuery(TROVA_TUTTI);
		
		while (this.rs.next()) {
			
			int id = this.rs.getInt(1);
			String nome = this.rs.getString("nome");
			
			Scienziato s = new Scienziato();
			s.setId(id);
			s.setNome(nome);
			
			scienziati.add(s);
			
			
		}
		
		return scienziati;
	}

}
