package project.models;

public class MedicamentPrescrits {
	Medicament medicament;
	
	double quantite;
	
	double prixTotal;
	
	public MedicamentPrescrits() {}
	
	//getters && setters
	public Medicament getMedicament() {
		return medicament;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	
	public double getQuantite() {
		return quantite;
	}
	public void setQuantite(double quantite) {
		this.quantite = quantite;
	}
	
	public double getPrixTotal() {
		return prixTotal;
	}
	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}
	
	
}
