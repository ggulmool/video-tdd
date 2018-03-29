package domain;

import java.util.ArrayList;
import java.util.List;

public class Rental {

    private int rentalPeriod;
    private int totalRentalFee;
    private int totalPoint;
    private List<RentalDetail> rentalDetails;

    public Rental(int rentalPeriod) {
        this.rentalPeriod = rentalPeriod;
        this.rentalDetails = new ArrayList<>();
    }

    public void add(RentalDetail rentalDetail) {
        this.rentalDetails.add(rentalDetail);
        this.totalRentalFee += rentalDetail.getPaymentFee();
        this.totalPoint += rentalDetail.getPoint();
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public int getTotalRentalFee() {
        return totalRentalFee;
    }

    public int getTotalPoint() {
        return totalPoint;
    }
}
