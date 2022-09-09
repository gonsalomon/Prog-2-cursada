package src.prefi.filtros;

import src.prefi.Content;

public class FilterAuthor extends Filter {
    private String author;

    public FilterAuthor(String author) {
        this.author = author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean cumple(Content content) {
        if (content != null && author != null) {
            return author.equals(content.getAuthor().getName());
        }
        return false;
    }
}
