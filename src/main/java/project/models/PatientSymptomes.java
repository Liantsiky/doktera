package project.models;

import java.time.LocalDate;

import ligeneric.annotation.Column;
import ligeneric.annotation.Foreign;
import ligeneric.annotation.PkType;
import ligeneric.annotation.Primary;
import ligeneric.annotation.Table;

@Table(name = "patient_symptomes")
public class PatientSymptomes {
	@Primary(pktype = PkType.MANUAL)
	@Column(name = "id")
	String id;
	
	@Foreign(join = "id_patient")
	Patient patient;
	
	@Column(name = "date_visite")
	LocalDate dateVisite;
	
	public PatientSymptomes() {}
	
	//getters && setters
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public LocalDate getDateVisite() {
		return dateVisite;
	}
	public void setDateVisite(LocalDate dateVisite) {
		this.dateVisite = dateVisite;
	}
	
}
