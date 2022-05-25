package com.fin.breweryapp.web.controller;

import com.fin.breweryapp.web.model.CustomerDTO;
import com.fin.breweryapp.web.service.CustomerService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {

	private final CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;

	}

	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDTO> getBeer(@PathVariable("customerId") UUID customerId) {

		return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<CustomerDTO> save(@RequestBody CustomerDTO customer) {

		CustomerDTO savedCustomerDTO = customerService.saveCustomer(customer);
		HttpHeaders headers = new HttpHeaders();
		headers.add("location", "/api/v1/customer/" + savedCustomerDTO.getId().toString());
		return new ResponseEntity<>(headers, HttpStatus.CREATED);
	}

	@PutMapping("/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateCustomer(@PathVariable("customerId") UUID customerId, @RequestBody CustomerDTO customer) {

		customerService.updateCustomer(customer, customerId);

	}

	@DeleteMapping("/{customerId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteCustomer(@PathVariable("customerId") UUID customerId) {

		customerService.deleteCustomer(customerId);
	}
}
