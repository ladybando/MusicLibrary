public class Guitarist extends Artist{
    private int numStrings;

    public Guitarist(int numStrings) {
        this.numStrings = numStrings;
    }
    public Guitarist(String artist_name, String artist_countryOrigin, String artist_genre, String artist_time_period, int artist_num_strings){
        this.name = artist_name;
        this.countryOrigin = artist_countryOrigin;
        this.genre = artist_genre;
        this.time_period = artist_time_period;
        this.numStrings = artist_num_strings;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }

    public void show(){
        System.out.println(
                "\n----____Guitarist in Guitarist____----\n"+
                        "  Artist name        | " + name + "\n" +
                        "  Home Country       | " + countryOrigin + "\n" +
                        "  Genre              | " + genre +"\n" +
                        "  Time-Period        | " + time_period +"\n" +
                        "  Guitar Strings     | " + numStrings +"\n"
        );
    }
}
