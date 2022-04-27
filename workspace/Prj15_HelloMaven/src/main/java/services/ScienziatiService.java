package services;

import java.sql.SQLException;
import java.util.Set;

import dal.ScienziatiDAO;
import dal.ScienziatiDAOImpl;
import entities.Scienziato;

public class ScienziatiService {

	private ScienziatiDAO repo = new ScienziatiDAOImpl();
	
	public Set<Scienziato> getAll(){
		try {
			return repo.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
