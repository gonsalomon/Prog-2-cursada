package src.prefi;

import java.util.ArrayList;

public class Video extends Content {
    protected User author;
    protected double duration;
    protected int views;
    protected int likes;
    protected int dislikes;
    protected ArrayList<String> keywords;

    public Video(String name, int uploadYear, User uploader, double duration) {
        super(name, uploadYear);
        this.author = uploader;
        this.duration = duration;
        this.keywords = new ArrayList<String>();
    }

    @Override
    public double getDuration() {
        return duration;
    }

    public User getUploader() {
        return author;
    }

    public int getViews() {
        return views;
    }

    public int getLikes() {
        return likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public ArrayList<String> getKeywords() {
        return new ArrayList<String>(keywords);
    }

    public void addKeyword(String keyword) {
        if (keyword != null) {
            if (!keywords.contains(keyword)) {
                keywords.add(keyword);
            }
        }
    }

    public void removeKeyword(String keyword) {
        if (keyword != null) {
            if (keywords.contains(keyword)) {
                keywords.remove(keyword);
            }
        }
    }

    @Override
    public int getYear() {
        return uploadYear;
    }

    @Override
    public int getVidCount() {
        return 1;
    }

    @Override
    public User getAuthor() {
        return author;
    }
}
