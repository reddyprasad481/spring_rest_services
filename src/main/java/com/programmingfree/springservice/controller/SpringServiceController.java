package com.programmingfree.springservice.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.programmingfree.springservice.bom.Address;
import com.programmingfree.springservice.bom.Person;

@EnableWebMvc
@RestController
@RequestMapping("/service/greeting/*")
public class SpringServiceController{
	
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String getGreeting(@PathVariable String name) {
		
		String result="Hello "+name;
		
		return result;
	}
	
	@RequestMapping(value = "/address", method = RequestMethod.GET)
	public Address getAddress() {
		
		Address address = new Address(131, "vinayak nagar", "Hyderabad", 
				"Ranga Reddy", "Telangana", "India", 500031);
		
		return address;
	}
	

	@RequestMapping(value = "/person", method = RequestMethod.GET)
	public Person getPerosn() {
		
		Person person =  new Person();
		person.setFirstName("Reddy");
		person.setLastName("Prasad");
		Address address1 = new Address(131, "vinayak nagar", "Hyderabad", 
				"Ranga Reddy", "Telangana", "India", 500031);
		Address address2 = new Address(171, "Amile Palli", "Gurram konda", 
				"Chittoor", "Andhra Pradesh", "India", 517219);
		
		person.getAddresses().add(address1);
		person.getAddresses().add(address2);
		return person;
	}
	
	@RequestMapping(value="/user/create", method=RequestMethod.POST)
	public Map<Integer, String> createUser(@RequestBody List<Integer> userIds){
	    
		//System.out.println(address);
		//List<Integer> userIds = Arrays.asList(1,2,3,4);
		 Map<Integer, String> usersList = new TreeMap<Integer, String>();
		 
		 for (Integer integer : userIds) {
			 
			 String id = "000"+integer;
			 usersList.put(integer, id);
		}
		 
		 return usersList;
	}
	
	@RequestMapping("/admin")
	public @ResponseBody
	Map<String, Boolean> admin() {
	    Map<String, Boolean> success = new TreeMap<String, Boolean>();
	    success.put("success", true);
	    return success;
	}
}