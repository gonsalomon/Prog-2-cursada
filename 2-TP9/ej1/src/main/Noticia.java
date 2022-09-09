package main;

import java.util.ArrayList;

public class Noticia {
    private String title;
    private ArrayList<String> keywords;
    private String intro;
    private String content;
    private String author;
    private String url;

    public Noticia(String title, String intro, String content, String author, String url) {
        this.title = title;
        keywords = new ArrayList<>();
        this.intro = intro;
        this.content = content;
        this.author = author;
        this.url = url;
    }

    public void addKeyword(String n){
        keywords.add(n);
    }

    public ArrayList<String> copyKeywords (){
        return new ArrayList<String>(keywords);
    }
}
