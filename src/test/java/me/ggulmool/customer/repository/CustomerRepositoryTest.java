package me.ggulmool.customer.repository;

import me.ggulmool.customer.Customer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@DataJpaTest
public class CustomerRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void 고객_등록() {
        Customer customer1 = new Customer("kny");
        Customer customer2 = new Customer("ggulmool");
        entityManager.persist(customer1);
        entityManager.persist(customer2);

        List<Customer> customers = customerRepository.findByName("kny");
        assertThat(customers)
                .isNotEmpty()
                .hasSize(1)
                .contains(customer1)
                .doesNotContain(customer2);
    }
}
