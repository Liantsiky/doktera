package project.models;

import ligeneric.annotation.Column;
import ligeneric.annotation.PkType;
import ligeneric.annotation.Primary;
import ligeneric.annotation.Table;

@Table(name = "medicament")
public class Medicament {
	@Primary(pktype = PkType.MANUAL)
	@Column(name = "id")
	String id;
	
	@Column(name = "designation")
	String designation;
	
	@Column(name = "prix")
	double prix;
	
	@Column(name = "age_minimum")
	int ageMinimum;
	
	public Medicament() {}
	
	//getters && setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public int getAgeMinimum() {
		return ageMinimum;
	}
	public void setAgeMinimum(int ageMinimum) {
		this.ageMinimum = ageMinimum;
	}
}
