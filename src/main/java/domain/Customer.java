package domain;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String name;
    private int point;
    private List<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        this.rentals = new ArrayList<>();
    }

    public void rent(Videos videos, int rentalPeriod) {
        Rental rental = videos.rent(rentalPeriod);
        this.point += rental.getTotalPoint();
        this.rentals.add(rental);
    }

    public int getPoint() {
        return point;
    }
}
