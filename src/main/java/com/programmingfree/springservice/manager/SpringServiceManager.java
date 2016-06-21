package com.programmingfree.springservice.manager;

import java.util.ArrayList;
import java.util.List;

import com.programmingfree.springservice.bom.cmm.Customer;
import com.programmingfree.springservice.dao.Data;

public class SpringServiceManager {

	private List<Customer> customers;
	
	public List<Customer> getCustomers() {
		if(customers == null)
			customers = new ArrayList<>();
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public SpringServiceManager() {
		
		this.customers = Data.getInitialCustomers();
	}
	
}
