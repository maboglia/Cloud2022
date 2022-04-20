package model;

public class Scienziato {

	private int id;
	private String nome;
	private String _date;
	
	public Scienziato() {
	}

	public Scienziato(int id, String nome, String _date) {
		this.id = id;
		this.nome = nome;
		this._date = _date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String get_date() {
		return _date;
	}

	public void set_date(String _date) {
		this._date = _date;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Scienziato [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", _date=");
		builder.append(_date);
		builder.append("]");
		return builder.toString();
	}

	
	
	
}
