package me.ggulmool.customer;

import me.ggulmool.rental.Rental;
import me.ggulmool.rental.RentalDetail;
import me.ggulmool.video.Video;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {

    @Id @GeneratedValue
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private int point;

    @Transient
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

    public Long getId() {
        return id;
    }

    public int getPoint() {
        return point;
    }

    public String getName() {
        return name;
    }
}
