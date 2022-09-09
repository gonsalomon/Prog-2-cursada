package src.prefi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import src.prefi.filtros.Filter;

public class SitioVideos {
    private ArrayList<Content> contents;

    public SitioVideos() {
        this.contents = new ArrayList<Content>();
    }

    public void addContent(Content content) {
        if (content != null) {
            if (!contents.isEmpty()) {
                if (!contents.contains(content)) {
                    contents.add(content);
                }
            } else {
                contents.add(content);
            }
        }
    }

    public void removeContent(Content content) {
        if (content != null) {
            if (!contents.isEmpty() && this.contents.contains(content)) {
                this.contents.remove(content);
            }
        }
    }

    public ArrayList<Content> getListado(Filter f) {
        ArrayList<Content> listado = new ArrayList<Content>();
        Comparator<Content> c = new Comparator<Content>() {
            @Override
            public int compare(Content c1, Content c2) {
                if (c1.getAuthor().getName().equals(c2.getAuthor().getName())) {
                    return c1.getAuthor().getMail().compareTo(c2.getAuthor().getMail());
                }
                return c1.getAuthor().getName().compareTo(c2.getAuthor().getName());
            }
        };
        for (Content content : this.contents) {
            if (f.cumple(content)) {
                listado.add(content);
            }
        }
        Collections.sort(listado, c);
        return listado;
    }
}
