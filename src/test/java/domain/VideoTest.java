package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoTest {

    private Video movie;
    private Video sports;
    private Video documentary;

    @Before
    public void setUp() throws Exception {
        movie = new Video("지금만나러갑니다.", 1000, VideoType.MOVIE);
        sports = new Video("엘클라시코", 1000, VideoType.SPORTS);
        documentary = new Video("다큐3일", 1000, VideoType.DOCUMENTARY);
    }

    @Test
    public void 대여요금_조회() throws Exception {
        assertEquals(2000, movie.getPaymentFee(2));
        assertEquals(2500, movie.getPaymentFee(3));

        assertEquals(2000, sports.getPaymentFee(2));
        assertEquals(3000, sports.getPaymentFee(3));

        assertEquals(2000, documentary.getPaymentFee(2));
        assertEquals(3000, documentary.getPaymentFee(3));
        assertEquals(3666, documentary.getPaymentFee(4));
    }

    @Test
    public void 종류별_포인트_조회() throws Exception {
        assertEquals(1, movie.getPoint());
        assertEquals(1, sports.getPoint());
        assertEquals(2, documentary.getPoint());
    }

    @Test
    public void 대여() throws Exception {
        RentalDetail movieRentalDetail = movie.rent(3);
        assertEquals(2500, movieRentalDetail.getPaymentFee());
        assertEquals(1, movieRentalDetail.getPoint());

        RentalDetail sportsRentalDetail = sports.rent(3);
        assertEquals(3000, sportsRentalDetail.getPaymentFee());
        assertEquals(1, sportsRentalDetail.getPoint());

        RentalDetail documentaryRentalDetail = documentary.rent(3);
        assertEquals(3000, documentaryRentalDetail.getPaymentFee());
        assertEquals(2, documentaryRentalDetail.getPoint());
    }
}
