package dal;

import java.sql.SQLException;
import java.util.Set;

import entities.Scienziato;

public interface ScienziatiDAO {

	String TROVA_TUTTI = "SELECT * FROM scienziati";
	
	Set<Scienziato> findAll() throws SQLException;
	
	
}
