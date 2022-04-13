package dal;

import java.sql.SQLException;
import java.util.List;

import model.Libro;

public interface LibroDAO {

	String GET_ALL = "select * from libri";
	String GET_ONE = "select * from libri where id = ";
	
	String ADD = "insert into libri (titolo, prezzo, pagine) values(?,?,?)";
	
	
	//crud
	
	void addLibro(Libro l);
	List<Libro> getAll()  throws SQLException;
	Libro getLibroById(int id);
	void updLibro(Libro l);
	void delLibroById(int id);
}
