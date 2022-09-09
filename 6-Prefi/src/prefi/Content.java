package src.prefi;

import java.util.ArrayList;

public abstract class Content {
    protected String name;
    protected int uploadYear;

    public Content(String name, int uploadYear) {
        this.name = name;
        this.uploadYear = uploadYear;
    }

    public String getName() {
        return name;
    }

    public abstract double getDuration();

    public abstract int getViews();

    public abstract int getLikes();

    public int getYear() {
        return uploadYear;
    }

    public abstract int getVidCount();

    public abstract User getAuthor();

    public abstract ArrayList<String> getKeywords();

    public boolean hasKeyword(String keyword) {
        return this.getKeywords().contains(keyword);
    }
}