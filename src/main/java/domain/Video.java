package domain;

import java.util.Date;

public class Video {

    private String title;
    private int dailyRentalFee;
    private VideoType videoType;

    public Video(String title, int dailyRentalFee, VideoType videoType) {
        this.title = title;
        this.dailyRentalFee = dailyRentalFee;
        this.videoType = videoType;
    }

    public int getPaymentFee(int rentalPeriod) {
        int paymentAmt = dailyRentalFee * rentalPeriod;
        int discountAmt = videoType.discountAmt(dailyRentalFee, rentalPeriod);
        return paymentAmt - discountAmt;
    }

    public int getPoint() {
        return videoType.getPoint();
    }

    public RentalDetail rent(int rentalPeriod) {
        return new RentalDetail(getPaymentFee(rentalPeriod), getPoint(), rentalPeriod, new Date());
    }
}
