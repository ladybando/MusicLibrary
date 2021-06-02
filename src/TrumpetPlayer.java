public class TrumpetPlayer extends Artist{
    String trumpetType;

    public TrumpetPlayer(String artist_name, String artist_countryOrigin, String artist_genre, String artist_time_period, String artist_trumpetType){
        this.name = artist_name;
        this.countryOrigin = artist_countryOrigin;
        this.genre = artist_genre;
        this.time_period = artist_time_period;
        this.trumpetType = artist_trumpetType;
    }

    public TrumpetPlayer(String trumpetType) {
        this.trumpetType = trumpetType;
    }

/*    public String getTrumpetType() {
        return trumpetType;
    }

    public void setTrumpetType(String trumpetType) {
        this.trumpetType = trumpetType;
    }*/

        public void show(){
          System.out.println(
                "----____Artist in Trumpet Player____----\n "+ "\n" +
                "  Artist name        | "  + name + "\n" +
                "  Artist Home Country| " + countryOrigin + "\n" +
                "  Artist genre       | " + genre + "\n" +
                "  Artist time-period | " + time_period + "\n" +
                "  Trumpet Type Played| " + trumpetType + "\n"
        );
    }

}
