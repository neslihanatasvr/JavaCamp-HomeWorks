package Entities;

import java.time.LocalDate;


import Abstract.Entitiy;


public class Customer implements Entitiy {
	
	private int id;
	private String FirstName;
	private String LastName;
	private LocalDate DateOfBirths;
	private String NationalityId;
	
	public Customer() {
		
	}
	


	public Customer(int id, String firstName, String lastName, LocalDate dateOfBirths, String nationalityId) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		DateOfBirths = dateOfBirths;
		NationalityId = nationalityId;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getFirstName() {
		return FirstName;
	}



	public void setFirstName(String firstName) {
		FirstName = firstName;
	}



	public String getLastName() {
		return LastName;
	}



	public void setLastName(String lastName) {
		LastName = lastName;
	}



	public LocalDate getDateOfBirths() {
		return DateOfBirths;
	}



	public void setDateOfBirths(LocalDate dateOfBirths) {
		DateOfBirths = dateOfBirths;
	}



	public String getNationalityId() {
		return NationalityId;
	}



	public void setNationalityId(String nationalityId) {
		NationalityId = nationalityId;
	}


}
