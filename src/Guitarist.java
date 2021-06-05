public class Guitarist extends Artist{
    private int numStrings;

    public Guitarist(String artist_name, String artist_countryOrigin, String artist_genre, String artist_time_period, int artist_num_strings){
        super(artist_name, artist_countryOrigin, artist_genre,artist_time_period);
        this.numStrings = artist_num_strings;
    }

    @Override
    public void show(){
        System.out.println(
                "\t----____ Guitar Player ____----\n"+
                        "  Artist name        | " + name + "\n" +
                        "  Home Country       | " + countryOrigin + "\n" +
                        "  Genre              | " + genre +"\n" +
                        "  Time-Period        | " + time_period +"\n" +
                        "  Guitar Strings     | " + numStrings
        );
    }
}
