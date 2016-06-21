package com.programmingfree.springservice.dao;

import java.util.ArrayList;
import java.util.List;

import com.programmingfree.springservice.bom.cmm.Customer;
import com.programmingfree.springservice.bom.cmm.Order;

public class Data {

	public static List<Customer> getInitialCustomers(){
		
		
		List<Customer> customers = new ArrayList<>();
		
		Customer customer1 = new Customer(1, "Lee", "Carroll", "1234 Anywhere St.", "Phoenix");
		customer1.getOrders().add(new Order("Basket", 29.99f, 1, 29.99f));
		customer1.getOrders().add(new Order("Yarn", 9.99f, 4, 39.96f));
		customer1.getOrders().add(new Order("Needes", 5.99f, 1, 5.99f));
		customers.add(customer1);

		Customer customer2 = new Customer(2, "Jesse", "Hawkins", "89 W. Center St.", "Atlanta");
		customer2.getOrders().add(new Order("Table", 329.99f, 1, 329.99f));
		customer2.getOrders().add(new Order("Chair", 129.99f, 4, 519.96f));
		customer2.getOrders().add(new Order("Lamp", 89.99f, 5, 449.95f));
		customers.add(customer2);

		Customer customer3 = new Customer(3, "Charles", "Charles", "455 7th Ave.", "Quebec");
		customer3.getOrders().add(new Order("Call of Duty", 59.99f, 1, 59.99f));
		customer3.getOrders().add(new Order("Controller", 49.99f, 1, 49.99f));
		customer3.getOrders().add(new Order("Gears of War", 49.99f, 1, 49.99f));
		customer3.getOrders().add(new Order("Lego City", 49.99f, 1, 49.99f));
		customers.add(customer3);

		Customer customer4 = new Customer(4, "Albert", "Einstein", "8966 N. Crescent Dr.", "New York City");
		customer4.getOrders().add(new Order("Baseball", 9.99f, 5, 49.95f));
		customer4.getOrders().add(new Order("Bat", 19.99f, 1, 19.99f));
		customers.add(customer4);

		Customer customer5 = new Customer(5, "Sonya", "Williams", "55 S. Hollywood Blvd", "Los Angeles");
		customers.add(customer5);

		Customer customer6 = new Customer(6, "Victor", "Bryan", "563 N. Rainier St.", "Seattle");
		customer6.getOrders().add(new Order("Speakers", 499.99f, 1, 49.99f));
		customer6.getOrders().add(new Order("iPod", 399.99f, 1, 399.99f));
		customers.add(customer6);

		Customer customer7 = new Customer(7, "Lynette", "Gonzalez", "25624 Main St.", "Albuquerque");
		customer7.getOrders().add(new Order("Statue", 429.99f, 1, 429.99f));
		customer7.getOrders().add(new Order("Picture", 1029.99f, 1, 1029.99f));
		customers.add(customer7);

		Customer customer8 = new Customer(8, "Erick", "Pittman", "33 S. Lake Blvd", "Chicago");
		customer8.getOrders().add(new Order("Book: AngularJS Development", 39.99f, 1, 39.99f));
		customer8.getOrders().add(new Order("Book: Basket Weaving Made Simple", 19.99f, 1, 19.99f));
		customers.add(customer8);

		Customer customer9 = new Customer(9, "Alice", "Price", "3354 Town", "Cleveland");
		customer9.getOrders().add(new Order("Webcam", 85.99f, 1, 85.99f));
		customer9.getOrders().add(new Order("HDMI Cable", 39.99f, 2, 79.98f));
		customers.add(customer9);
		

		Customer customer10 = new Customer(10, "Gerard", "Tucker", "6795 N. 53 W. Bills Dr.", "Buffalo");
		customer10.getOrders().add(new Order("Fan", 49.99f, 4, 199.96f));
		customer10.getOrders().add(new Order("Remote Control", 109.99f, 1, 109.99f));
		customers.add(customer10);
		

		Customer customer11 = new Customer(11, "Shanika", "Passmore", "459 S. International Dr.", "Orlando");
		customers.add(customer11);
		
		return customers;
		
	}
}
