package domain;

public enum VideoType {
    MOVIE(1), SPORTS(1), DOCUMENTARY(2);

    private int point;

    VideoType(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }
}
