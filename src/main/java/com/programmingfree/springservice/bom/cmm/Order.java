package com.programmingfree.springservice.bom.cmm;

import java.io.Serializable;

public class Order implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String product;
	private float price;
	private int quantity;
	private float orderTotal;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}
	
	public Order(String product, float price, int quantity, float orderTotal) {
		super();
		this.product = product;
		this.price = price;
		this.quantity = quantity;
		this.orderTotal = orderTotal;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public float getOrderTotal() {
		return orderTotal;
	}
	public void setOrderTotal(float orderTotal) {
		this.orderTotal = orderTotal;
	}
	@Override
	public String toString() {
		return "Order [product=" + product + ", price=" + price + ", quantity="
				+ quantity + ", orderTotal=" + orderTotal + "]";
	}
	
	

}
