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

    //TODO:리팩토링
    public int getPaymentFee(int rentalPeriod) {
        if (videoType == VideoType.MOVIE) {
            return (rentalPeriod > 2 ? dailyRentalFee * 2 + ((rentalPeriod - 2) * (dailyRentalFee / 2)) : dailyRentalFee * rentalPeriod);
        }

        if (videoType == VideoType.DOCUMENTARY) {
            return (rentalPeriod > 2 ? dailyRentalFee * 3 + ((rentalPeriod - 3) * (dailyRentalFee / 3 * 2)) : dailyRentalFee * rentalPeriod);
        }

        return dailyRentalFee * rentalPeriod;
    }

    public int getPoint() {
        return videoType.getPoint();
    }

    public RentalDetail rent(int rentalPeriod) {
        return new RentalDetail(getPaymentFee(rentalPeriod), getPoint(), new Date());
    }
}
