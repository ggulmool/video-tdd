package me.ggulmool.customer.repository;

import me.ggulmool.customer.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

   List<Customer> findByName(String name);
}
