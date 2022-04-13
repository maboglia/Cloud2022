package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Libro;

public class LibroDAOImpl implements LibroDAO {

	private Connessione miaConn = new Connessione();
	
	private Statement stat;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	@Override
	public void addLibro(Libro l) {
		
		try {
//			this.stat= miaConn.getConn().createStatement();
			this.ps = miaConn.getConn().prepareStatement(ADD);
			
			this.ps.setString(1, l.getTitolo());
			this.ps.setDouble(2, l.getPrezzo());
			this.ps.setInt(3, l.getPagine());
			
			this.ps.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	@Override
	public List<Libro> getAll() throws SQLException {
		
		List<Libro> libri = new ArrayList<Libro>();

		this.stat = miaConn.getConn().createStatement();
		this.rs = this.stat.executeQuery(GET_ALL);
		
		while (this.rs.next()) {
			Libro l = new Libro();
			l.setId(rs.getInt("id"));
			l.setTitolo(rs.getString("titolo"));
			l.setPrezzo(rs.getDouble("prezzo"));
			l.setPagine(rs.getInt("pagine"));
			libri.add(l);
			
		}
		return libri;
	}

	@Override
	public Libro getLibroById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updLibro(Libro l) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delLibroById(int id) {
		// TODO Auto-generated method stub

	}

}
