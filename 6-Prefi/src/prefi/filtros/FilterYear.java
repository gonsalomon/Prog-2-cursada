package src.prefi.filtros;

import src.prefi.*;

public class FilterYear extends Filter{
    private int year;

    public FilterYear(int year) {
        super();
        this.year = year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean cumple(Content content) {
        return content.getYear() == year;
    }
}
