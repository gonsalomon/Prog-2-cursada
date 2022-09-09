package src.prefi.filtros;

import src.prefi.Content;

public class FilterLikes extends Filter {
    private int minLikes;

    public FilterLikes(int minLikes) {
        super();
        this.minLikes = minLikes;
    }

    public void setMinLikes(int minLikes) {
        this.minLikes = minLikes;
    }

    @Override
    public boolean cumple(Content content) {
        return content.getLikes() > minLikes;
    }
}
