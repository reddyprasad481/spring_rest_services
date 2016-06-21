package com.programmingfree.springservice.bom.cmm;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private List<Order> orders;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String firstName, String lastName, String address,
			String city) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public List<Order> getOrders() {
		if(orders == null)
			orders = new ArrayList<Order>();
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", orders=" + orders + "]";
	}
	
	

}
