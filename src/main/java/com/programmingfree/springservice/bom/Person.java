package com.programmingfree.springservice.bom;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String firstName;
	private String lastName;
	private List<Address> addresses;
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
	public List<Address> getAddresses() {
		if(this.addresses == null)
			this.addresses = new ArrayList<Address>();
		return addresses;
	}
	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}
	
	
}
