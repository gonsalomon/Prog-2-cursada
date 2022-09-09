package src.prefi.filtros;

import src.prefi.Content;

public class FilterKeyword extends Filter {
    private String keyword;

    public FilterKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean cumple(Content content) {
        if (!keyword.isEmpty())
            return content.getKeywords().contains(keyword);
        else
            return true;
    }
}
