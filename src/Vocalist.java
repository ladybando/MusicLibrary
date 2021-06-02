public class Vocalist extends Artist{
    String influencedBy;

/*    public String getInfluencedBy() {
        return influencedBy;
    }

    public void setInfluencedBy(String influencedBy) {
        this.influencedBy = influencedBy;
    }*/

    public Vocalist(String influencedBy) {
        this.influencedBy = influencedBy;
    }
    public Vocalist(String artist_name, String artist_countryOrigin, String artist_genre, String artist_time_period, String artist_influenced_by){
        this.name = artist_name;
        this.countryOrigin = artist_countryOrigin;
        this.genre = artist_genre;
        this.time_period = artist_time_period;
        this.influencedBy = artist_influenced_by;
    }


    public void show() {
        System.out.println(
                "----____Artist in Vocalist____----\n " + "\n" +
                        "  Artist name        | " + name + "\n" +
                        "  Artist Home Country| " + countryOrigin + "\n" +
                        "  Artist genre       | " + genre + "\n" +
                        "  Artist time-period | " + time_period + "\n" +
                        "  Influenced by      | " + influencedBy + "\n"
        );
    }

}
