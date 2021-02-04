package com.example.Company_Annotation;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long dnumber;
	
	private String dname;
	
	@ManyToOne
	@JoinColumn(name = "mgr_ssn")
	private Employee mgr_ssn;
	
	private String mgr_start_date;
	
	public Department() {
		
	}

	public Department(String dname, String mgr_start_date) {
		super();
		this.dname = dname;
		this.mgr_start_date = mgr_start_date;
	}

	public Long getDnumber() {
		return dnumber;
	}

	public void setDnumber(Long dnumber) {
		this.dnumber = dnumber;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public Employee getMgr_ssn() {
		return mgr_ssn;
	}

	public void setMgr_ssn(Employee mgr_ssn) {
		this.mgr_ssn = mgr_ssn;
	}

	public String getMgr_start_date() {
		return mgr_start_date;
	}

	public void setMgr_start_date(String mgr_start_date) {
		this.mgr_start_date = mgr_start_date;
	}
	
	



}
