package com.rd.springboot.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="regulations_id")
	private int regulationsId;
	
	@Column(name="regulation_name")
	private String regulationName;
	
	@Column(name="add_comments")
	private String addComments;
		
	// define constructors
	
	public Employee() {
		
	}
	


	public Employee(int id, String firstName, String lastName, String email, int regulationsId, String regulationName,
			String addComments) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.regulationsId = regulationsId;
		this.regulationName = regulationName;
		this.addComments = addComments;
	}

	
	
	public Employee(String firstName, String lastName, String email, int regulationsId, String regulationName,
			String addComments) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.regulationsId = regulationsId;
		this.regulationName = regulationName;
		this.addComments = addComments;
	}



// generate getter and setters
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




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




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public int getRegulationsId() {
		return regulationsId;
	}




	public void setRegulationsId(int regulationsId) {
		this.regulationsId = regulationsId;
	}




	public String getRegulationName() {
		return regulationName;
	}




	public void setRegulationName(String regulationName) {
		this.regulationName = regulationName;
	}




	public String getAddComments() {
		return addComments;
	}




	public void setAddComments(String addComments) {
		this.addComments = addComments;
	}



	//String toString
	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", regulationsId=" + regulationsId + ", regulationName=" + regulationName + ", addComments="
				+ addComments + "]";
	}




	
	
	
	
	
		
}











