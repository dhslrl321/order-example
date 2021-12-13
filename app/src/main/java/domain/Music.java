package domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Music {
    private String title;
    private String singer;
    private String musicPath;

    public Music(String title, String singer, String musicPath) {
        this.title = title;
        this.singer = singer;
        this.musicPath = musicPath;
    }

    public String getMusicPath() {
        return musicPath;
    }

    public String getSinger() {
        return singer;
    }

    public String getTitle() {
        return title;
    }

    public void setMusicPath(String musicPath) {
        this.musicPath = musicPath;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
