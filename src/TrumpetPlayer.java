public class TrumpetPlayer extends Artist{
    String trumpetType;

    public TrumpetPlayer(String artist_name, String artist_countryOrigin, String artist_genre, String artist_time_period, String artist_trumpetType){
        super(artist_name, artist_countryOrigin, artist_genre, artist_time_period);
        this.trumpetType = artist_trumpetType;
    }

    @Override
        public void show(){
          System.out.println(
                "\t----____ Trumpet Player ____----\n "+ "\n" +
                "  Artist name        | "  + name + "\n" +
                "  Artist Home Country| " + countryOrigin + "\n" +
                "  Artist genre       | " + genre + "\n" +
                "  Artist time-period | " + time_period + "\n" +
                "  Trumpet Type Played| " + trumpetType
        );
    }

}
