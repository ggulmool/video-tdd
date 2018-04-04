package shop;

import common.Constants;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;
import video.Video;
import video.VideoType;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class VideoShopTest {

    private VideoShop videoShop;

    @Before
    public void setUp() throws Exception {
        videoShop = new VideoShop();
        videoShop.registerCustomer("ggulmool");
        videoShop.registerCustomer("thekarin");
        videoShop.registerCustomer("south10");

        videoShop.registerVideo(new Video("지금만나러갑니다.", 1000, VideoType.MOVIE));
        videoShop.registerVideo(new Video("엘클라시코", 1000, VideoType.SPORTS));
        videoShop.registerVideo(new Video("다큐3일", 900, VideoType.DOCUMENTARY));
    }

    @Test
    public void 고객_등록() throws Exception {
        Customer customer = videoShop.registerCustomer("ggulmool");
        assertEquals("ggulmool", customer.getName());
    }

    @Test
    public void 비디오_대여() throws Exception {
        Customer customer1 = videoShop.findCustomerByName("ggulmool");
        List<Video> videos = videoShop.getReadyVideo();
        customer1.rent(Constants.ONE_DAY, videos);
        assertEquals(0, videoShop.getReadyVideo().size());
    }

    @Test
    public void 고객_포인트_조회() throws Exception {
        int point = videoShop.pointByCustomer("ggulmool");
        assertEquals(0, point);
    }
}
