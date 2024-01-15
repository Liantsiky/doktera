package project.models;

import ligeneric.annotation.Column;
import ligeneric.annotation.PkType;
import ligeneric.annotation.Primary;
import ligeneric.annotation.Table;

@Table(name = "symptome")
public class Symptome {
	@Primary(pktype = PkType.MANUAL )
	@Column(name = "id")
	String id;
	
	@Column(name = "designation")
	String designation;
	
	public Symptome() {}
	
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
}
