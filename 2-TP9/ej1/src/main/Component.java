package main;

import java.util.ArrayList;

public class Component {
    private ArrayList<Component> sub;
    private ArrayList<Noticia> news;

    public Component() {
        sub = new ArrayList<>();
        news = new ArrayList<>();
    }

    public int newsCount (){
        return this.news.size();
    }

    public void addNew (Noticia n){
        this.news.add(n);
    }

    public ArrayList<Noticia> seek (String keyword){
        ArrayList<Noticia> partial = new ArrayList<>();
        if (!sub.isEmpty()){
            for (int i = 0; i < sub.size()-1; i++) {
                for (int j = 0; j < sub.get(i).newsCount()-1; j++) {
                    if(sub.get(i).seek(keyword).get(j).copyKeywords().contains(keyword)){
                        partial.add(sub.get(i).seek(keyword).get(j));
                    }
                }
            }
        }
        for (Noticia n:news) {
            if (n.copyKeywords().contains(keyword)){
                partial.add(n);
            }
        }
        return partial;
    }

    public ArrayList<Noticia> newsWith(){

    }
}
