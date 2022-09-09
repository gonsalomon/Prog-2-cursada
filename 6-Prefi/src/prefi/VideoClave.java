package src.prefi;

import java.util.ArrayList;

public class VideoClave extends Video {
    public VideoClave(String name, int uploadYear, User creator, double duration) {
        super(name, uploadYear, creator, duration);
        this.keywords = new ArrayList<String>();
    }

    @Override
    public boolean hasKeyword(String keyword) {
        return true;
    }
}
