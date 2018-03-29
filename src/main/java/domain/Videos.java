package domain;

import java.util.ArrayList;
import java.util.List;

public class Videos {

    private List<Video> videos;

    public Videos() {
        this.videos = new ArrayList<>();
    }

    public void add(Video video) {
        this.videos.add(video);
    }

    public Rental rent(int rentalPeriod) {
        Rental rental = new Rental(rentalPeriod);
        videos.forEach(video -> {
            RentalDetail rentalDetail = video.rent(rentalPeriod);
            rental.add(rentalDetail);
        });
        return rental;
    }
}
