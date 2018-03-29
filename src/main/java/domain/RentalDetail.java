package domain;

import java.util.Date;

public class RentalDetail {
    private int paymentFee;
    private int point;
    private Date rentalDate;

    public RentalDetail(int paymentFee, int point, Date rentalDate) {
        this.paymentFee = paymentFee;
        this.point = point;
        this.rentalDate = rentalDate;
    }

    public int getPaymentFee() {
        return paymentFee;
    }

    public int getPoint() {
        return point;
    }

    public Date getRentalDate() {
        return rentalDate;
    }
}
