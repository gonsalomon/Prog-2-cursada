package src.prefi;

import java.util.ArrayList;

public class PlaylistSponsoreada extends Playlist {
    private Video sponsorAd;

    public PlaylistSponsoreada(String nombre, int uploadYear, User creator, Video newAd) {
        super(nombre, uploadYear);
        this.sponsorAd = newAd;
        this.contents = new ArrayList<Content>();
        this.contents.add(newAd); // acá inserto el ad al principio de la playlist
    }

    public Video getSponsorAd() {
        return this.sponsorAd;
    }

    public void setSponsorAd(Video sponsorAd) {
        this.sponsorAd = sponsorAd;
    }
}
