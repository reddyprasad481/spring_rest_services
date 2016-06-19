package com.programmingfree.springservice.bom;

import java.io.Serializable;

public class Address implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int doorNumber;
	private String street;
	private String city;
	private String district;
	private String state;
	private String Nation;
	private long pin;
	
	public Address(int doorNumber, String street, String city, String district,
			String state, String nation, long pin) {
		super();
		this.doorNumber = doorNumber;
		this.street = street;
		this.city = city;
		this.district = district;
		this.state = state;
		Nation = nation;
		this.pin = pin;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public int getDoorNumber() {
		return doorNumber;
	}

	public void setDoorNumber(int doorNumber) {
		this.doorNumber = doorNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNation() {
		return Nation;
	}

	public void setNation(String nation) {
		Nation = nation;
	}

	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "Address [doorNumber=" + doorNumber + ", street=" + street
				+ ", city=" + city + ", district=" + district + ", state="
				+ state + ", Nation=" + Nation + ", pin=" + pin + "]";
	}
	
	
	
}
