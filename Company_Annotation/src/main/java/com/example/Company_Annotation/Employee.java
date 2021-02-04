package com.example.Company_Annotation;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ssn;

	private String fname;

	private String minit;

	private String lname;

	private String bdate;

	private String address;

	private String sex;

	private Integer salary;

//	@ManyToOne
//	@JoinColumn(name = "ssn", updatable=false, insertable=false)
//	private Employee super_ssn;

	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="Super_ssn")
	private Employee Super_ssn;

//	@OneToMany(mappedBy="Super_ssn") // FK formiranje so sopstvenata tabela
//	private Set<Employee> subordinates = new HashSet<Employee>();
	
	@ManyToOne
	@JoinColumn(name = "dno")
	private Department dno;


	public Employee() {

	}


	public Employee(String fname, String minit, String lname, String bdate, String address, String sex, Integer salary) {
		super();
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.bdate = bdate;
		this.address = address;
		this.sex = sex;
		this.salary = salary;
//		Super_ssn = super_ssn;
//		this.subordinates = subordinates;
//		this.dno = dno;
	}


	public Long getSsn() {
		return ssn;
	}


	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}


	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getMinit() {
		return minit;
	}


	public void setMinit(String minit) {
		this.minit = minit;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getBdate() {
		return bdate;
	}


	public void setBdate(String bdate) {
		this.bdate = bdate;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}


	public Integer getSalary() {
		return salary;
	}


	public void setSalary(Integer salary) {
		this.salary = salary;
	}


	public Employee getSuper_ssn() {
		return Super_ssn;
	}


	public void setSuper_ssn(Employee super_ssn) {
		Super_ssn = super_ssn;
	}


//	public Set<Employee> getSubordinates() {
//		return subordinates;
//	}
//
//
//	public void setSubordinates(Set<Employee> subordinates) {
//		this.subordinates = subordinates;
//	}


	public Department getDno() {
		return dno;
	}


	public void setDno(Department dno) {
		this.dno = dno;
	}

	
	

}