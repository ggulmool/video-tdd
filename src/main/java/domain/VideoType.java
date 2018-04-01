package domain;

import static domain.Constants.THREE_DAY;
import static domain.Constants.TWO_DAY;

public enum VideoType implements Discountable {
    MOVIE(1) {
        @Override
        public int discountAmt(int dailyRentalFee, int rentalPeriod) {
            if (rentalPeriod > TWO_DAY) {
                return (rentalPeriod - TWO_DAY) * (dailyRentalFee / 2);
            }
            return 0;
        }
    }, SPORTS(1) {
        @Override
        public int discountAmt(int dailyRentalFee, int rentalPeriod) {
            return 0;
        }
    }, DOCUMENTARY(2) {
        @Override
        public int discountAmt(int dailyRentalFee, int rentalPeriod) {
            if (rentalPeriod > THREE_DAY) {
                return (rentalPeriod - THREE_DAY) * (dailyRentalFee / 3 * 2);
            }
            return 0;
        }
    };

    private int point;

    VideoType(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }
}
