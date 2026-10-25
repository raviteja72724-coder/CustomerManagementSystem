package com.cms;

public class CustomerTest {

	public static void main(String[] args) {
		CustomerOperations service = new CustomerOperations();

		System.out.println("Initial Customers:");
		for (Customer c : service.getCustomers()) {
			System.out.println(c);
		}

		System.out.println();
		System.out.println("Customer 106 added: " + service.addCustomer(106, "Ananya", "Verma", 'F'));

		System.out.println();
		System.out.println("Duplicate Customer 106 added: " + service.addCustomer(106, "Ananya", "Verma", 'F'));

		System.out.println();
		System.out.println("Customer 103 updated: " + service.updateCustomer(103, "Arjun", "Reddy", 'M'));

		System.out.println();
		System.out.println("Customer 104 deleted: " + service.deleteCustomer(104));

		System.out.println();
		Customer c1 = service.findCustomerById(102);
		if (c1 != null) {
			System.out.println("Found ID 102: " + c1);
		} else {
			System.out.println("Customer not found");
		}

		System.out.println();
		Customer c2 = service.findCustomerByFirstname("Kiran");
		if (c2 != null) {
			System.out.println("Found Kiran: " + c2);
		} else {
			System.out.println("Customer not found");
		}

		System.out.println();
		Customer c3 = service.findCustomerById(999);
		if (c3 != null) {
			System.out.println(c3);
		} else {
			System.out.println("Customer with ID 999 does not exist");
		}

		System.out.println();
		System.out.println("All Customers After Operations:");
		for (Customer c : service.getCustomers()) {
			System.out.println(c);
		}
	}
}