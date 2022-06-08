package com.catgenova.viaggi.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="documenti")
public class Documento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String percorso;
	
	
	@JsonBackReference
	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "viaggi_id",nullable = false)
	private Viaggio viaggio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPercorso() {
		return percorso;
	}

	public void setPercorso(String percorso) {
		this.percorso = percorso;
	}

	public Viaggio getViaggio() {
		return viaggio;
	}

	public void setViaggio(Viaggio viaggio) {
		this.viaggio = viaggio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Documento [id=");
		builder.append(id);
		builder.append(", percorso=");
		builder.append(percorso);
		builder.append(", viaggio=");
		builder.append(viaggio);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
