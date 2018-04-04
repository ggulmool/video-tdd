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

    public void rent(int rentalPeriod, List<Video> videos) {
        Rental rental = new Rental();
        videos.forEach(video -> {
            RentalDetail rentalDetail = video.rent(rentalPeriod);
            rental.add(rentalDetail);
        });

        this.point += rental.getTotalPoint();
        this.rentals.add(rental);
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }
}
