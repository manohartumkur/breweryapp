package com.fin.breweryapp.web.service;

import com.fin.breweryapp.web.model.CustomerDTO;

import java.util.UUID;

public interface CustomerService {
    CustomerDTO getCustomerById(UUID customerId);

    CustomerDTO saveCustomer(CustomerDTO customer);

    CustomerDTO updateCustomer(CustomerDTO customer, UUID customerId);

    void deleteCustomer(UUID customerId);
}
