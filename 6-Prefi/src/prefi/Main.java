package src.prefi;

public class Main {
    public static void main(String[] args) {
        SitioVideos sitioVideos = new SitioVideos();
        /* acá se hacen todos los sitioVideos.addContent(content); que se deseen */

        // 1. playlist lenta: es una playlist normal, pero con 35 seg de loadingDelay
        Playlist playlistLenta = new Playlist("playlist lenta 1", 2021);
        playlistLenta.setLoadingDelay(35);
        // 2. playlist sponsoreada: es una playlist normal, sólo que en el constructor
        // se le añade un anuncio del sponsor como primer elemento del arraylist de
        // contenido
        User yo = new User("Gonzalo", 2021, "salomongonzalo8@gmail.com");
        User profe = new User("Soledad", 2006, "no se su mail");
        Video adSponsor = new Video("no sé", 2021, yo, 30);
        PlaylistSponsoreada playlistSponsoreada = new PlaylistSponsoreada("prueba 1", 2021, yo, adSponsor);
        Video nuevoAd = new Video("nuevo ad", 2021, profe, 10);
        playlistSponsoreada.setSponsorAd(nuevoAd);
        // 3. video clave: tiene todas las keywords que le preguntes, re tramposo
        VideoClave videoClave = new VideoClave("explicación magistral de cómo usar el addAll()", 2021, profe, 240.5);
        System.out.println("Sabrá este video sobre quién gana las próximas elecciones?");
        if (videoClave.hasKeyword("Elecciones 2023")) {
            System.out.println("Obvio que sabe");
        } else {
            // raro que el IDE no me tire un "unreachable code", porque es literalmente
            // imposible llegar acá
            System.out.println("No sabe");
        }
        // 4. playlist "Matrix 4": playlist sponsoreada que en vez del anuncio de un
        // sponsor, pone la publicidad de Matrix 4
        Video matrix4 = new Video("Matrix 4", 2021, yo, 30);
        PlaylistSponsoreada playlistMatrix4 = new PlaylistSponsoreada("Matrix 4", 2021, yo, matrix4);
        System.out.println("Ahora vean el spot de Matrix 4: ");
        System.out.println(playlistMatrix4.getSponsorAd().getName() + ", 30 segundos de spot");
        // agrego las playlist al sitioVideos, que aunque innecesario, tenía que armarlo
        // para tener dónde meter el método que filtra (sí, ya sé, tiene que ir en
        // Playlist, y que tire los videos de la Playlist... pero en YT te permite
        // buscar por playlist también, punto para mi solución ahre)
        sitioVideos.addContent(playlistLenta);
        sitioVideos.addContent(playlistSponsoreada);
        sitioVideos.addContent(playlistMatrix4);
        // terminé, fiu, ahora a ver si apruebo y doy el final
    }
}
