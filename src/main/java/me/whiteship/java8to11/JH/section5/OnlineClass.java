package me.whiteship.java8to11.JH.section5;

import java.util.Optional;

public class OnlineClass {

    private Integer id;
    private String title;
    private boolean closed;
    public Progress progress;
    // 아래와 같이 쓰는 것은 안좋음
    // public Optional<Progress> progress;

    public OnlineClass(Integer id, String title, boolean closed) {
        this.id = id;
        this.title = title;
        this.closed = closed;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

//    public Progress getProgress() { return progress; }
    public Optional<Progress> getProgress() {
        return Optional.ofNullable(progress);
    }

    public void setProgress(Progress progress) {

        this.progress = progress;
    }
}
