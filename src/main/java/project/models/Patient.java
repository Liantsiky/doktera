package project.models;

import java.time.LocalDate;

import ligeneric.annotation.Column;
import ligeneric.annotation.PkType;
import ligeneric.annotation.Primary;
import ligeneric.annotation.Table;

@Table(name = "patient")
public class Patient {
	@Primary(pktype = PkType.MANUAL)
	@Column(name = "id")
	String id;
	
	@Column(name = "nom")
	String nom;
	
	@Column(name = "date_de_naissance")
	LocalDate dateDeNaissance;
	
	public Patient() {}
	
	//getters && setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
}
