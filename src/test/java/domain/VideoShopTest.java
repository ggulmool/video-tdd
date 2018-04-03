package domain;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VideoShopTest {

    private VideoShop videoShop;

    @Before
    public void setUp() throws Exception {
        videoShop = new VideoShop();
    }

    @Test
    public void 고객_등록() throws Exception {
        Customer customer = videoShop.registerCustomer("ggulmool");
        assertEquals("ggulmool", customer.getName());
    }

    @Test
    public void 고객_포인트_조회() throws Exception {
        int point = videoShop.pointByCustomer("ggulmool");
    }
}
