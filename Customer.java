package com.cms;

import java.util.Objects;

public class Customer {

	private String firstName;
	private char gender;
	private int id;
	private String lastName;

	public Customer() {
	}

	public Customer(int id, String firstName, String lastName, char gender) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(firstName, other.firstName) && gender == other.gender && id == other.id
				&& Objects.equals(lastName, other.lastName);
	}

	public String getFirstName() {
		return firstName;
	}

	public char getGender() {
		return gender;
	}

	public int getId() {
		return id;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, Character.valueOf(gender), Integer.valueOf(id), lastName);
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstName + ", lastname=" + lastName + ", gender=" + gender
				+ "]";
	}

}
