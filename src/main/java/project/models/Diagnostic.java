package project.models;

import java.util.List;

public class Diagnostic {
	Patient patient;
	
	List<MedicamentPrescrits> medicamentPrescrits;
	
	double montantTotal;
	
	public Diagnostic() {}
	
	//getters && setters
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	public List<MedicamentPrescrits> getMedicamentPrescrits() {
		return medicamentPrescrits;
	}
	public void setMedicamentPrescrits(List<MedicamentPrescrits> medicamentPrescrits) {
		this.medicamentPrescrits = medicamentPrescrits;
	}
	
	public double getMontantTotal() {
		return montantTotal;
	}
	public void setMontantTotal(double montantTotal) {
		this.montantTotal = montantTotal;
	}
	
}
