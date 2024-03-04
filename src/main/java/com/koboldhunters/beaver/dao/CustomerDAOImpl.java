package com.koboldhunters.beaver.dao;

import com.koboldhunters.beaver.model.Customer;

import java.util.List;

public class CustomerDAOImpl implements CustomerDAO{
    private List<Customer> customerList;

    public CustomerDAOImpl(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public boolean addCustomer(Customer customer) {
        customerList.add(customer);
        return true;
    }

    @Override
    public Customer getCustomerById(long id) {
        for (Customer customer: customerList){
            if (customer.getId() == id){
                return customer;
            }

        }
        return null;
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerList;
    }

    @Override
    public boolean updateCustomer(Customer customer) {
        Customer oldCustomer = getCustomerById(customer.getId());
        if (oldCustomer != null){
            int counter = 0;
            for (Customer cust: customerList){
                counter++;
                if (cust.getId() == customer.getId()){
                    break;
                }
            }
            customerList.set(counter, customer);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteCustomerById(long id) {
        for (Customer customer: customerList){
            if (customer.getId() == id){
                customerList.remove(customer);
                return true;
            }
        }
        return false;
    }
}

//Look up JSP info
//Setup Tomcat
//Setup Database

// Book Design Patterns
