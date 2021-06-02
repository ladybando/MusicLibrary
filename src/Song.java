public class Song {
    String title;
    String playlist;
    String url;
    String musician;
    String trumpeter;
    String guitarist;

    public Song(){}

    public Song(String title, String playlist, String url, String musician, String trumpeter, String guitarist) {
        this.title = title;
        this.playlist = playlist;
        this.url = url;
        this.musician = musician;
        this.trumpeter = trumpeter;
        this.guitarist = guitarist;
    }

    public Song(String title, String playlist, String url, String musician, String guitarist) {
        this.title = title;
        this.playlist = playlist;
        this.url = url;
        this.musician = musician;
        this.guitarist = guitarist;
    }
    public Song(String title, String playlist, String url) {
        this.title = title;
        this.playlist = playlist;
        this.url = url;

    }

    public void show(){
        System.out.println(
                "\n----____Songs in Songs____----\n"+
                        "  Song Title       | " + title + "\n" +
                        "  Playlist Name    | " + playlist + "\n" +
                        "  Website          | " + url + "\n" +
                        "  Musician Name    | " + musician +"\n" +
                        "  Trumpet Player   | " + trumpeter + "\n" +
                        "  Guitarist        | " + guitarist
        );
    }
}
