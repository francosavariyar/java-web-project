package com.customer.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.customer.domain.Customer;

@Repository
public class InMemoryCustomerDAO implements CustomerDAO{
	
	private Map<Integer, Customer> Customers = new HashMap<>();

	{
		saveCustomer(new Customer(1, "Susan", "s@gmail.com", "MountainBike"));
		saveCustomer(new Customer(2, "Bob", "b@gmail.com", "Football"));
		saveCustomer(new Customer(3, "Jill", "j@gmail.com", "Kayak"));
	}

	@Override
	public void saveCustomer(Customer Customer) {
		Customers.put(Customer.getId(), Customer);
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		return Customers.values();
	}

	@Override
	public Customer getCustomer(int id) {
		return Customers.get(id);
	}


}
