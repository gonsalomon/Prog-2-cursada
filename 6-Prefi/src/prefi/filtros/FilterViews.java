package src.prefi.filtros;

import src.prefi.Content;

public class FilterViews extends Filter {
    private int minViews;

    public FilterViews(int minViews) {
        super();
        this.minViews = minViews;
    }

    public void setMinViews(int minViews) {
        this.minViews = minViews;
    }

    @Override
    public boolean cumple(Content content) {
        return content.getViews() > minViews;
    }
}