package com.programmingfree.springservice.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.itextpdf.text.DocumentException;
import com.programmingfree.springservice.bom.cmm.Customer;
import com.programmingfree.springservice.manager.CustomerServiceManager;
import com.programmingfree.utils.pdf.PDFFactoryFile;

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
	
	@RequestMapping(value="/getpdfForInput", method=RequestMethod.POST)
	public ResponseEntity<byte[]> getPDFFromInput(@RequestParam("period") String period,
			@RequestParam("fromDate") String fromDate,@RequestParam("toDate") String toDate) throws IOException, DocumentException {
	   
	    byte[] contents = null;
	     ByteArrayOutputStream byteArrayOutputStream =PDFFactoryFile.createPdfFile(getServiceManager().getCustomers(),period,fromDate,toDate);
	     contents = byteArrayOutputStream.toByteArray();
	     HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.parseMediaType("application/pdf"));
	    String filename = "output.pdf";
	    headers.setContentDispositionFormData(filename, filename);
	    headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
	    ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(contents, headers, HttpStatus.OK);
	    return response;
	}
	
	@RequestMapping(value="/getpdf", method=RequestMethod.GET)
	public ResponseEntity<byte[]> getPDF(@RequestParam("period") String period,
			@RequestParam("fromDate") String fromDate,@RequestParam("toDate") String toDate) throws IOException, DocumentException {
	   
	    byte[] contents = null;
	     ByteArrayOutputStream byteArrayOutputStream =PDFFactoryFile.createPdfFile(getServiceManager().getCustomers(),period,fromDate,toDate);
	     contents = byteArrayOutputStream.toByteArray();
	     HttpHeaders headers = new HttpHeaders();
	    headers.setContentType(MediaType.parseMediaType("application/pdf"));
	    String filename = "output.pdf";
	    headers.setContentDispositionFormData(filename, filename);
	    headers.setCacheControl("must-revalidate, post-check=0, pre-check=0");
	    ResponseEntity<byte[]> response = new ResponseEntity<byte[]>(contents, headers, HttpStatus.OK);
	    return response;
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