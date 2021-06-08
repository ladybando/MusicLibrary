import java.util.ArrayList;

public class Artist {
    String name;
    String countryOrigin;
    String genre;
    String time_period;
    static ArrayList<Song> song_library;
    ScanFile scanFile;

    public void setSongMember(Song songMember) {
        song_library.add(songMember);
    }

    public void displaySongs() {
        for (Song song : song_library) {
            song.show();
        }
    }
    public Artist(ScanFile scanFile){}

    public Artist(String artist_name, String artist_countryOrigin, String artist_genre, String artist_time_period) {
        this.name = artist_name;
        this.countryOrigin = artist_countryOrigin;
        this.genre = artist_genre;
        this.time_period = artist_time_period;
        this.song_library = new ArrayList<>();
    }

    public void show() {
        System.out.println("\n\t----____ Artist Information ____----\n");

        System.out.println(
                        "  Artist name       | " + this.name + "\n" +
                        "  Artist Home Country| " + this.countryOrigin + "\n" +
                        "  Artist genre       | " + this.genre + "\n" +
                        "  Artist time-period | " + this.time_period + "\n"
        );
    }
}
