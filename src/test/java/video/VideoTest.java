package video;

import org.junit.Before;
import org.junit.Test;
import rental.RentalDetail;

import static common.Constants.*;
import static org.junit.Assert.assertEquals;

public class VideoTest {

    private Video movie;
    private Video sports;
    private Video documentary;

    @Before
    public void setUp() throws Exception {
        movie = new Video("지금만나러갑니다.", 1000, VideoType.MOVIE);
        sports = new Video("엘클라시코", 1000, VideoType.SPORTS);
        documentary = new Video("다큐3일", 900, VideoType.DOCUMENTARY);
    }

    @Test
    public void 비디오_종류별_할인_대여요금_조회() throws Exception {
        assertEquals(2000, movie.getPaymentFee(TWO_DAY));
        assertEquals(2500, movie.getPaymentFee(THREE_DAY));

        assertEquals(2000, sports.getPaymentFee(TWO_DAY));
        assertEquals(3000, sports.getPaymentFee(THREE_DAY));

        assertEquals(2700, documentary.getPaymentFee(THREE_DAY));
        assertEquals(3000, documentary.getPaymentFee(FOUR_DAY));
    }

    @Test
    public void 비디오_종류별_적립_포인트_조회() throws Exception {
        assertEquals(1, movie.getPoint());
        assertEquals(1, sports.getPoint());
        assertEquals(2, documentary.getPoint());
    }

    @Test
    public void 비디오_종류별_대여() throws Exception {
        RentalDetail movieRentalDetail = movie.rent(THREE_DAY);
        assertEquals(2500, movieRentalDetail.getPaymentFee());
        assertEquals(1, movieRentalDetail.getPoint());

        RentalDetail sportsRentalDetail = sports.rent(THREE_DAY);
        assertEquals(3000, sportsRentalDetail.getPaymentFee());
        assertEquals(1, sportsRentalDetail.getPoint());

        RentalDetail documentaryRentalDetail = documentary.rent(THREE_DAY);
        assertEquals(2700, documentaryRentalDetail.getPaymentFee());
        assertEquals(2, documentaryRentalDetail.getPoint());
    }
}
