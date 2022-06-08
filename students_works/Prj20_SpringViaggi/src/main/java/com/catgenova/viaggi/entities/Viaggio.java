package com.catgenova.viaggi.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="viaggi")
public class Viaggio  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String destinazione;
	
	@JsonManagedReference
	@OneToOne(mappedBy = "viaggio",fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Documento documento;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDestinazione() {
		return destinazione;
	}
	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Viaggio [id=");
		builder.append(id);
		builder.append(", destinazione=");
		builder.append(destinazione);
		builder.append(", documento=");
		builder.append(documento);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
	
}
