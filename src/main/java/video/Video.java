package video;

import rental.RentalDetail;

import java.util.Date;

public class Video {

    private String title;
    private int dailyRentalFee;
    private VideoType videoType;
    private VideoStatus videoStatus;

    public Video(String title, int dailyRentalFee, VideoType videoType) {
        this.title = title;
        this.dailyRentalFee = dailyRentalFee;
        this.videoType = videoType;
        this.videoStatus = VideoStatus.READY;
    }

    public int getPaymentFee(int rentalPeriod) {
        int paymentAmt = dailyRentalFee * rentalPeriod;
        int discountAmt = videoType.discountAmt(dailyRentalFee, rentalPeriod);
        return paymentAmt - discountAmt;
    }

    public int getPoint() {
        return videoType.getPoint();
    }

    public VideoStatus getVideoStatus() {
        return videoStatus;
    }

    public RentalDetail rent(int rentalPeriod) {
        this.videoStatus = VideoStatus.RENT;
        return new RentalDetail(getPaymentFee(rentalPeriod), getPoint(), rentalPeriod, new Date());
    }
}
