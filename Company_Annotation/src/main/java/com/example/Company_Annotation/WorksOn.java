package com.example.Company_Annotation;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table
@AssociationOverrides({
@AssociationOverride(name = "id.essn", joinColumns = @JoinColumn(name = "ssn")),
@AssociationOverride(name = "id.pno", joinColumns = @JoinColumn(name = "pnumber")) })
public class WorksOn {
	
	@EmbeddedId	
	private WorksOnID id;
	
	private Double hours;
	
	public WorksOn() {
		
	}

	public WorksOn(WorksOnID id, Double hours) {
		super();
		this.id = id;
		this.hours = hours;
	}


	public WorksOnID getId() {
		return id;
	}

	public void setId(WorksOnID id) {
		this.id = id;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}


}
