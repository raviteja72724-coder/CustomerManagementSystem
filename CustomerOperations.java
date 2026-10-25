package com.cms;

import java.util.HashSet;
import java.util.Iterator;

public class CustomerOperations {

	private HashSet<Customer> customers = new HashSet<Customer>();

	public CustomerOperations() {
		customers.add(new Customer(101, "Rahul", "Sharma", 'M'));
		customers.add(new Customer(102, "Priya", "Reddy", 'F'));
		customers.add(new Customer(103, "Arjun", "Kumar", 'M'));
		customers.add(new Customer(104, "Sneha", "Rao", 'F'));
		customers.add(new Customer(105, "Kiran", "Patel", 'M'));
	}

	public boolean addCustomer(int id, String firstname, String lastname, char gender) {
		Customer c = new Customer(id, firstname, lastname, gender);
		return customers.add(c);
	}

	public boolean deleteCustomer(int customerId) {
		Iterator<Customer> it = customers.iterator();
		while (it.hasNext()) {
			Customer c = it.next();
			if (c.getId() == customerId) {
				it.remove();
				return true;
			}
		}
		return false;
	}

	public Customer findCustomerByFirstname(String firstname) {
		for (Customer c : customers) {
			if (c.getFirstName().equalsIgnoreCase(firstname)) {
				return c;
			}
		}
		return null;
	}

	public Customer findCustomerById(int customerId) {
		for (Customer c : customers) {
			if (c.getId() == customerId) {
				return c;
			}
		}
		return null;
	}

	public HashSet<Customer> getCustomers() {
		return customers;
	}

	public boolean updateCustomer(int customerId, String firstname, String lastname, char gender) {
		for (Customer c : customers) {
			if (c.getId() == customerId) {
				c.setFirstName(firstname);
				c.setLastName(lastname);
				c.setGender(gender);
				return true;
			}
		}
		return false;
	}
}