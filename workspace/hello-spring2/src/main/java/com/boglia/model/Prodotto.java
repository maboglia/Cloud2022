package com.boglia.model;

public class Prodotto {

	private int id;
	private String nome;
	private int quantita;
	
	public Prodotto() {
		// TODO Auto-generated constructor stub
	}

	public Prodotto(int id, String nome, int quantita) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantita = quantita;
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

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Prodotto [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", quantita=");
		builder.append(quantita);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
