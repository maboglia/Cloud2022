package dal;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Scienziato;

public class ScienziatoDAOImpl implements ScienziatoDAO {

	Connessione miaConn = new Connessione();
	
	Statement stat = null;
	ResultSet rs = null;
	
	
	
	@Override
	public List<Scienziato> findAll() throws SQLException {
		
		List<Scienziato> scienziati = new ArrayList<>();
		
		this.stat = miaConn.getConn().createStatement();
		this.rs = this.stat.executeQuery(TROVA_TUTTI);
		
		while (this.rs.next()) {
			Scienziato s = new Scienziato();
			s.setId(  this.rs.getInt(1)  );
			s.setNome(this.rs.getString(2));
			s.set_date(this.rs.getString(3));
			
			scienziati.add(s);
		}
		
		
		return scienziati;
	}

	@Override
	public Scienziato findScienziatoById(int id) throws SQLException {
		this.stat = miaConn.getConn().createStatement();
		this.rs = this.stat.executeQuery(TROVA_UNO + id);
		
		this.rs.next();
		
			Scienziato s = new Scienziato();
			s.setId(  this.rs.getInt(1)  );
			s.setNome(this.rs.getString(2));
			s.set_date(this.rs.getString(3));
		
		return s;
	}

}
