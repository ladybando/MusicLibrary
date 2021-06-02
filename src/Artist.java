import java.util.HashMap;

public class Artist {
    String name;
    String countryOrigin;
    String genre;
    String time_period;

    public Artist(){}

    public Artist(String artist_name, String artist_countryOrigin, String artist_genre, String artist_time_period){
        this.name = artist_name;
        this.countryOrigin = artist_countryOrigin;
        this.genre = artist_genre;
        this.time_period = artist_time_period;
    }

    public void show(){
       System.out.println(
                "\n----____Artist in Artist____----\n"+
               "  Artist name        | " + name + "\n" +
               "  Artist Home Country| " + countryOrigin + "\n" +
               "  Artist genre       | " + genre + "\n" +
               "  Artist time-period | " + time_period +"\n"
       );
    }

}
