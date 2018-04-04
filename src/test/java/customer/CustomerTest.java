package customer;

import org.junit.Before;
import org.junit.Test;
import video.Video;
import video.VideoType;

import java.util.Arrays;

import static common.Constants.ONE_DAY;
import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("ggulmool");
    }

    @Test
    public void 비디오_대여() throws Exception {
        Video video1 = new Video("지금만나러갑니다.", 1000, VideoType.MOVIE);
        Video video2 = new Video("엘클라시코1", 1000, VideoType.SPORTS);
        Video video3 = new Video("엘클라시코2", 1000, VideoType.SPORTS);
        Video video4 = new Video("다큐3일", 1000, VideoType.DOCUMENTARY);

        customer.rent(ONE_DAY, Arrays.asList(video1, video2, video3, video4));
        assertEquals(5, customer.getPoint());
    }

}
