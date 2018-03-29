package domain;

public class Customer {

    private String name;
    private int point;

    public Customer(String name) {
        this.name = name;
    }

    public void rent(Videos videos, int rentalPeriod) {
        Rental rental = videos.rent(rentalPeriod);
        this.point += rental.getTotalPoint();
    }

    public int getPoint() {
        return point;
    }
}
