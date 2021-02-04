package com.example.Company_Annotation;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class DeptLocation {

	@EmbeddedId
	private DeptLocationID id;
	
	public DeptLocation() {
		
	}

	public DeptLocation(DeptLocationID id) {
		super();
		this.id = id;
	}

	public DeptLocationID getId() {
		return id;
	}

	public void setId(DeptLocationID id) {
		this.id = id;
	}
	
	
}
