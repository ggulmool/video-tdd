package me.ggulmool.customer;

import java.util.ArrayList;
import java.util.List;

public class Customers {

    private List<Customer> customers;

    public Customers() {
        this.customers = new ArrayList<>();
    }

    public Customer add(Customer customer) {
        this.customers.add(customer);
        return customer;
    }

    public Customer findCustomerByName(String name) {
        return customers.stream()
                .filter(c -> c.getName().equals(name))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("me.ggulmool.customer not found"));
    }
}
