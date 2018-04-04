package rental;

import java.util.Date;

public class RentalDetail {

    private int paymentFee;
    private int point;
    private int rentalPeriod;
    private Date rentalDate;

    public RentalDetail(int paymentFee, int point, int rentalPeriod,Date rentalDate) {
        this.paymentFee = paymentFee;
        this.point = point;
        this.rentalPeriod = rentalPeriod;
        this.rentalDate = rentalDate;
    }

    public int getPaymentFee() {
        return paymentFee;
    }

    public int getPoint() {
        return point;
    }

    public int getRentalPeriod() {
        return rentalPeriod;
    }

    public Date getRentalDate() {
        return rentalDate;
    }
}
