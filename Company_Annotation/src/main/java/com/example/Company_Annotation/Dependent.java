package com.example.Company_Annotation;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Dependent {
	
	@EmbeddedId
	private DependentID id;
	
	private String sex;
	
	private String relationship;
	
	private String bdate;
	
	public Dependent() {
		
	
	}

	public Dependent(DependentID id, String sex, String relationship, String bdate) {
		super();
		this.id = id;
		this.sex = sex;
		this.relationship = relationship;
		this.bdate = bdate;
	}

	public DependentID getId() {
		return id;
	}

	public void setId(DependentID id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public String getBdate() {
		return bdate;
	}

	public void setBdate(String bdate) {
		this.bdate = bdate;
	}

}
