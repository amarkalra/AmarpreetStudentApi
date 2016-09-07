package com.capone.domain;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	String firstName;
	String lastName;
	String affiliations;
	String birthDate;

	String lastEnrolled;
	String hireDate;
	String separationDate;
	String address;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getHireDate() {
		return hireDate;
	}

	public String getAffiliations() {
		return affiliations;
	}

	public void setAffiliations(String affiliations) {
		this.affiliations = affiliations;
	}

	public String getLastEnrolled() {
		return lastEnrolled;
	}

	public void setLastEnrolled(String lastEnrolled) {
		this.lastEnrolled = lastEnrolled;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getSeparationDate() {
		return separationDate;
	}

	public void setSeparationDate(String separationDate) {
		this.separationDate = separationDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}