package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;

    @Before
    public void setUp() throws Exception {
        customer = new Customer("ggulmool");
    }

    @Test
    public void 비디오_대여() throws Exception {
        Videos videos = new Videos();
        videos.add(new Video("지금만나러갑니다.", 1000, VideoType.MOVIE));
        videos.add(new Video("엘클라시코1", 1000, VideoType.SPORTS));
        videos.add(new Video("엘클라시코2", 1000, VideoType.SPORTS));
        videos.add(new Video("다큐3일", 1000, VideoType.DOCUMENTARY));

        customer.rent(videos, 1);
        assertEquals(5, customer.getPoint());
    }

}
