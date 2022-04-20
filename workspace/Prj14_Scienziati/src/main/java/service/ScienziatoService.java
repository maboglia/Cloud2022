package service;

import java.sql.SQLException;
import java.util.List;

import dal.ScienziatoDAO;
import dal.ScienziatoDAOImpl;
import model.Scienziato;

public class ScienziatoService {

	ScienziatoDAO repo = new ScienziatoDAOImpl();
	
	public List<Scienziato> getAll(){
		try {
			return repo.findAll();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public Scienziato getById(int id) {
		try {
			return repo.findScienziatoById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
