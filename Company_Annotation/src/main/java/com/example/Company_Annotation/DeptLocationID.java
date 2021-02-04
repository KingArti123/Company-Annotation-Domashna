package com.example.Company_Annotation;

import java.io.Serializable;


import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class DeptLocationID implements Serializable {

	@ManyToOne(cascade = CascadeType.ALL)
	private Department dnumber;
	
	private String dlocation;
	
	public DeptLocationID() {
		
	}

	public DeptLocationID(Department dnumber, String dlocation) {
		super();
		this.dnumber = dnumber;
		this.dlocation = dlocation;
	}

	public Department getDnumber() {
		return dnumber;
	}

	public void setDnumber(Department dnumber) {
		this.dnumber = dnumber;
	}

	public String getDlocation() {
		return dlocation;
	}

	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}

	
}
