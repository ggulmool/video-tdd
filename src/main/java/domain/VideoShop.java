package domain;

import java.util.List;

public class VideoShop {

    private Customers customers;
    private Videos videos;

    public VideoShop() {
        this.customers = new Customers();
        this.videos = new Videos();
    }

    public Video registerVideo(Video video) {
        this.videos.add(video);
        return video;
    }

    public List<Video> getReadyVideo() {
        return videos.getReadyVideos();
    }

    public int pointByCustomer(String name) {
        Customer customer = customers.findCustomerByName(name);
        return customer.getPoint();
    }

    public Customer findCustomerByName(String name) {
        return customers.findCustomerByName(name);
    }

    public Customer registerCustomer(String name) {
        Customer customer = new Customer(name);
        customers.add(customer);
        return customer;
    }


    // 할인한다 (일일 대여가격을)
    // 누적한다 (포인트를)
    // 계산한다 (포인트 총합을)
    // 계산한다 (총 대여가격을)
    // 계산한다 (총 대여비디오 수를)
    // 제공한다 (대여정보를)
}
