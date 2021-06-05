public class Song {
    String title;
    String playlist;
    String url;


    public Song(String title, String playlist, String url) {
        this.title = title;
        this.playlist = playlist;
        this.url = url;
    }

    public void show(){
                     System.out.print(
                            "  Song Title         | " + title + "\n" +
                            "  Playlist Name      | " + playlist + "\n" +
                            "  Website            | " + url + "\n"
            );
    }
}
