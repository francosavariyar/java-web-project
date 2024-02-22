package com.customer.dao;

import java.util.Collection;

import com.customer.domain.Customer;

public interface CustomerDAO {
	public void saveCustomer(Customer customer);
	public Collection<Customer> getAllCustomers();
	public Customer getCustomer(int id);
}
