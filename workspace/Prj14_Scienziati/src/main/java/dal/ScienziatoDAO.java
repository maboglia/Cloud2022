package dal;

import java.sql.SQLException;
import java.util.List;

import model.Scienziato;

public interface ScienziatoDAO {

	String TROVA_TUTTI = "select * from scienziati";
	String TROVA_UNO = "select * from scienziati where id = ";
	
	List<Scienziato> findAll() throws SQLException;
	Scienziato findScienziatoById(int id) throws SQLException;
	
}
