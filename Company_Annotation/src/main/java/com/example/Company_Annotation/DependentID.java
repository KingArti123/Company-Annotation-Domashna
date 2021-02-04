package com.example.Company_Annotation;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class DependentID implements Serializable {
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee essn;
	
	private String DependentName;
	
	public DependentID() {
		
	}

	public DependentID(Employee essn, String dependentName) {
		super();
		this.essn = essn;
		DependentName = dependentName;
	}

	public Employee getEssn() {
		return essn;
	}

	public void setEssn(Employee essn) {
		this.essn = essn;
	}

	public String getDependentName() {
		return DependentName;
	}

	public void setDependentName(String dependentName) {
		DependentName = dependentName;
	}

	
	}