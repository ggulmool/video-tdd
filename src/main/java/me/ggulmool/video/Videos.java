package me.ggulmool.video;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Videos {

    private List<Video> videos;

    public Videos() {
        this.videos = new ArrayList<>();
    }

    public void add(Video video) {
        this.videos.add(video);
    }

    public List<Video> getReadyVideos() {
        return videos.stream().filter(v -> v.getVideoStatus() == VideoStatus.READY)
                .collect(Collectors.toList());
    }
}
