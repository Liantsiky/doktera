package project.models;

import ligeneric.annotation.Column;
import ligeneric.annotation.Foreign;
import ligeneric.annotation.PkType;
import ligeneric.annotation.Primary;
import ligeneric.annotation.Table;

@Table(name = "medicament_symptome" )
public class MedicamentSymptome {
	@Primary(pktype = PkType.AUTO)
	@Column(name = "id")
	int id;
	
	@Foreign(join = "id_medicament")
	Medicament medicament;
	
	@Foreign(join = "id_symptome")
	Symptome symptome;
	
	@Column(name = "unite")
	int unite;
	
	public MedicamentSymptome() {}
	
	//getters && setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Medicament getMedicament() {
		return medicament;
	}
	public void setMedicament(Medicament medicament) {
		this.medicament = medicament;
	}
	
	public Symptome getSymptome() {
		return symptome;
	}
	public void setSymptome(Symptome symptome) {
		this.symptome = symptome;
	}
	
	public int getUnite() {
		return unite;
	}
	public void setUnite(int unite) {
		this.unite = unite;
	}
	
	
}
