package project.models;

import ligeneric.annotation.Column;
import ligeneric.annotation.Foreign;
import ligeneric.annotation.PkType;
import ligeneric.annotation.Primary;
import ligeneric.annotation.Table;

@Table(name = "patient_symptomes_details")
public class PatientSymptomesDetails {
	@Primary(pktype = PkType.AUTO)
	@Column(name = "id")
	int id;
	
	@Foreign(join = "id_patient_symptomes")
	PatientSymptomes patientSymptomes;
	
	@Foreign(join = "id_symptome")
	Symptome symptome;
	
	@Column(name = "level_pain")
	int levelPain;
	
	public PatientSymptomesDetails() {}
	
	//getters && setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public PatientSymptomes getPatientSymptomes() {
		return patientSymptomes;
	}
	public void setPatientSymptomes(PatientSymptomes patientSymptomes) {
		this.patientSymptomes = patientSymptomes;
	}
	
	public Symptome getSymptome() {
		return symptome;
	}
	public void setSymptome(Symptome symptome) {
		this.symptome = symptome;
	}
	
	public int getLevelPain() {
		return levelPain;
	}
	public void setLevelPain(int levelPain) {
		this.levelPain = levelPain;
	}
}
