package com.example.Company_Annotation;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class WorksOnID implements Serializable{
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Employee essn;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Project pno;
	
	public WorksOnID() {
		
	}

	public WorksOnID(Employee essn, Project pno) {
		super();
		this.essn = essn;
		this.pno = pno;
	}

	public Employee getEssn() {
		return essn;
	}

	public void setEssn(Employee essn) {
		this.essn = essn;
	}

	public Project getPno() {
		return pno;
	}

	public void setPno(Project pno) {
		this.pno = pno;
	}

}
