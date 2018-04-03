package domain;

import java.util.ArrayList;
import java.util.List;

public class VideoShop {

    private List<Customer> customers;

    public VideoShop() {
        this.customers = new ArrayList<>();
    }

    // 계산한다 (포인트 총합)
    public int pointByCustomer(String name) {
        return 0;
    }

    public Customer registerCustomer(String name) {
        Customer customer = new Customer(name);
        customers.add(customer);
        return customer;
    }
    // 할인한다 (일일 대여가격을)
    // 누적한다 (포인트를)
    // 계산한다 (포인트 총합을)
    // 계산한다 (총 대여가격을)
    // 계산한다 (총 대여비디오 수를)
    // 제공한다 (대여정보를)
}
