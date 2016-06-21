package com.programmingfree.springservice.manager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.programmingfree.springservice.bom.cmm.Customer;
import com.programmingfree.springservice.dao.Data;

public class CustomerServiceManager {

	private List<Customer> customers;
	
	public List<Customer> getCustomers() {
		if(customers == null)
			customers = new ArrayList<>();
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public CustomerServiceManager() {
		
		this.customers = Data.getInitialCustomers();
	}

	public Customer getCustomer(Integer id) {
		
		if(id != null){
			
			for (Customer customer : getCustomers()) {
				
				if (customer != null && customer.getId() ==id.intValue()) {
					
					return customer;
				}
			}
		}
		return null;
	}

	public Boolean deleteCustomer(Integer id) {
		
		boolean isRemoved = false;
		
		if(id != null){
			
			Iterator<Customer> customersIterator = getCustomers().iterator();
			
			while (customersIterator.hasNext()) {
				
				Customer customer = customersIterator.next();
				
				if (customer != null && customer.getId() ==id.intValue()) {
					
					 customersIterator.remove();
					 isRemoved = true;
					 break;
				}
				
			}
		}
		return isRemoved;
	}

	public Integer insertCustomer(Customer newCustomer) {
		
		int newCustomerId = 0;
		if(newCustomer != null){
			
			int maxCustomerId  = 0;
			for (Customer customer : getCustomers()) {
				
				if (customer != null && customer.getId()>maxCustomerId) {
					
					maxCustomerId = customer.getId();
				}
			}
			
			 newCustomerId = maxCustomerId+1; 
			 getCustomers().add(new Customer(newCustomerId, newCustomer.getFirstName(), 
					 newCustomer.getLastName(), newCustomer.getAddress(), newCustomer.getCity()));
		}
		return newCustomerId;
	}
	
}
