package coffeeShop.entities;

import java.time.LocalDate;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityIdentity;
	private LocalDate dateOfBirth;
	
	public Customer() {
		
	}

	public Customer(int id, String firstName, String lastName, String nationalityIdentity, LocalDate dateOfBirth) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityIdentity = nationalityIdentity;
		this.dateOfBirth = dateOfBirth;
	}

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

	public String getNationalityIdentity() {
		return nationalityIdentity;
	}

	public void setNationalityIdentity(String nationalyIdentity) {
		this.nationalityIdentity = nationalyIdentity;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
}
