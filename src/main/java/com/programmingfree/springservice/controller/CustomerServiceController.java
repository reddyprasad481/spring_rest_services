package com.programmingfree.springservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.programmingfree.springservice.bom.cmm.Customer;
import com.programmingfree.springservice.manager.CustomerServiceManager;

@EnableWebMvc
@RestController
@RequestMapping("/service/customers/*")
public class CustomerServiceController{
	
	
	@RequestMapping(value = "/getCustomers", method = RequestMethod.GET)
	public List<Customer> getCustomers() {
		
		return getServiceManager().getCustomers();
	}
	
	@RequestMapping(value = "/getCustomer/{id}", method = RequestMethod.GET)
	public Customer getCustomer(@PathVariable Integer id) {
		
		return getServiceManager().getCustomer(id);
	}
	
	@RequestMapping(value="/insertCustomer", method=RequestMethod.POST)
	public Integer insertCustomer(@RequestBody Customer customer){
	    
		return getServiceManager().insertCustomer(customer);
	}
	
	@RequestMapping(value="/deleteCustomer/{id}", method=RequestMethod.DELETE)
	public Boolean deleteCustomer(@PathVariable Integer id){
	    
		return getServiceManager().deleteCustomer(id);
	}
	
	
	public CustomerServiceManager getServiceManager() {
		
		if(this.customerServiceManager != null){
			
			return this.customerServiceManager;
			
		}else{
			
			this.customerServiceManager = new CustomerServiceManager();
			return this.customerServiceManager;
		}
	}


	private CustomerServiceManager customerServiceManager;
}