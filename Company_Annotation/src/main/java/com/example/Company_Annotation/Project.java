package com.example.Company_Annotation;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pnumber;
	
	private String pname;
	
	private String plocation;
	
	@ManyToOne
	@JoinColumn(name = "dnum")
	private Department dnum;

	public Project() {
		
	}

	public Project(String pname, String plocation, Department dnum) {
		super();
		this.pname = pname;
		this.plocation = plocation;
		this.dnum = dnum;
	}

	public Long getPnumber() {
		return pnumber;
	}

	public void setPnumber(Long pnumber) {
		this.pnumber = pnumber;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPlocation() {
		return plocation;
	}

	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}

	public Department getDnum() {
		return dnum;
	}

	public void setDnum(Department dnum) {
		this.dnum = dnum;
	}

	

	
}
