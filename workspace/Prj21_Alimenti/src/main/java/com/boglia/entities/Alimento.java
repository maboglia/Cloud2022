package com.boglia.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "alimenti")
public class Alimento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String categoria;
	private String prodotto;
	private double carboidrati;
	private double lipidi;
	private double proteine;
	private int energia;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getProdotto() {
		return prodotto;
	}
	public void setProdotto(String prodotto) {
		this.prodotto = prodotto;
	}
	public double getCarboidrati() {
		return carboidrati;
	}
	public void setCarboidrati(double carboidrati) {
		this.carboidrati = carboidrati;
	}
	public double getLipidi() {
		return lipidi;
	}
	public void setLipidi(double lipidi) {
		this.lipidi = lipidi;
	}
	public double getProteine() {
		return proteine;
	}
	public void setProteine(double proteine) {
		this.proteine = proteine;
	}
	public int getEnergia() {
		return energia;
	}
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Alimento [id=");
		builder.append(id);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", prodotto=");
		builder.append(prodotto);
		builder.append(", carboidrati=");
		builder.append(carboidrati);
		builder.append(", lipidi=");
		builder.append(lipidi);
		builder.append(", proteine=");
		builder.append(proteine);
		builder.append(", energia=");
		builder.append(energia);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
