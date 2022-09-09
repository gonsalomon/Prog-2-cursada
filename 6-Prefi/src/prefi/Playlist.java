package src.prefi;

import java.util.ArrayList;
import java.util.Collections;

public class Playlist extends Content {
    protected ArrayList<Content> contents;
    protected double loadingDelay;

    public Playlist(String name, int uploadYear) {
        super(name, uploadYear);
        this.contents = new ArrayList<Content>();
    }

    public void addContent(Content content) {
        if (content != null) {
            if (!contents.contains(content)) {
                contents.add(content);
            }
        }
    }

    @Override
    public double getDuration() {
        double duration = 0;
        for (Content content : contents) {
            duration += content.getDuration();
        }
        return duration + this.loadingDelay;
    }

    @Override
    public int getViews() {
        int views = 0;
        for (Content content : contents) {
            views += content.getViews();
        }
        return views;
    }

    @Override
    public int getVidCount() {
        int vidCount = 0;
        for (Content content : contents) {
            vidCount += content.getVidCount();
        }
        return vidCount;
    }

    @Override
    /*
     * como no tengo likes en una playlist, devuelvo el promedio de los likes de los
     * videos contenidos (no sabía si devolver eso o 0 directamente, lo que hubiera
     * sido más sencillo). pasa que necesito mi getlikes() en playlist por haberlo
     * definido en content
     */
    public int getLikes() {
        int likes = 0;
        int vidCount = 0;
        for (Content content : contents) {
            likes += content.getLikes();
            vidCount += content.getVidCount();
        }
        return likes / vidCount;
    }

    @Override
    /*
     * en una playlist, el autor es indistinto, sólo lo implemento para respetar que
     * lo llevé al abstracto. necesitaba hacer esto porque consulto sobre el autor
     * en FilterAuthor (castear una playlist a video y consultar el autor rompe el
     * composite)
     */
    public User getAuthor() {
        for (Content content : contents) {
            if (content.getAuthor() != null) {
                return content.getAuthor();
            }
        }
        return null;
    }

    @Override
    public ArrayList<String> getKeywords() {
        ArrayList<String> keywords = new ArrayList<String>();
        for (Content c : contents) {
            for (String k : c.getKeywords()) {
                if (!keywords.contains(k)) {
                    keywords.add(k);
                }
            }
        }
        Collections.sort(keywords);
        return keywords;
    }

    public double getLoadingDelay() {
        return loadingDelay;
    }

    public void setLoadingDelay(double loadingDelay) {
        this.loadingDelay = loadingDelay;
    }
}
