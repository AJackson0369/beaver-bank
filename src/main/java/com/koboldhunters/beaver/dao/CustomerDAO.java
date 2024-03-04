package com.koboldhunters.beaver.dao;

import com.koboldhunters.beaver.model.Customer;

import java.util.List;

public interface CustomerDAO {
    boolean addCustomer(Customer customer);
    Customer getCustomerById(long id);
    List<Customer> getAllCustomers();

    boolean updateCustomer(Customer customer);
    boolean deleteCustomerById(long id);
}
