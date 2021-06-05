public class Vocalist extends Artist{
    String influencedBy;

    public Vocalist(String artist_name, String artist_countryOrigin, String artist_genre, String artist_time_period, String artist_influenced_by){
        super(artist_name, artist_countryOrigin,artist_genre, artist_time_period); //super calls constructor in super class
        this.influencedBy = artist_influenced_by;
    }

@Override
    public void show() {
        System.out.println(
                "\t----____ Vocalist ____----\n" +
                        "  Artist name        | " + name + "\n" +
                        "  Artist Home Country| " + countryOrigin + "\n" +
                        "  Artist genre       | " + genre + "\n" +
                        "  Artist time-period | " + time_period + "\n" +
                        "  Influenced by      | " + influencedBy
        );
    }

}
