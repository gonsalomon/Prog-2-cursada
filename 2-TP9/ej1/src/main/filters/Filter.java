package main.filters;

import java.util.Comparator;

public class Filter implements Comparator<Noticia> {
    @Override
    public int compare(Noticia o1, Noticia o2){
        return o1.getLen().compareTo(o2.getLen());
    }
}
