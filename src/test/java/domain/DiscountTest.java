package domain;

import org.junit.Test;

import static domain.Constants.FOUR_DAY;
import static org.junit.Assert.assertEquals;

public class DiscountTest {

    @Test
    public void 비디오_종류별_할인_금액() {
        int discountAmt = VideoType.MOVIE.discountAmt(1000, FOUR_DAY);
        assertEquals(1000, discountAmt);

        discountAmt = VideoType.DOCUMENTARY.discountAmt(900, FOUR_DAY);
        assertEquals(600, discountAmt);

        discountAmt = VideoType.SPORTS.discountAmt(1000, FOUR_DAY);
        assertEquals(0, discountAmt);
    }
}