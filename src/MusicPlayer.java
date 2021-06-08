import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;


public class MusicPlayer {
    public static void main(String[] args) throws FileNotFoundException {
        MusicPlayer play = new MusicPlayer();
        play.createLibrary();
        play.printArtists();
        play.addArtistFromFile();
    }

    public String[] createLibrary() {

        TrumpetPlayer velvet = new TrumpetPlayer("Velvet Brown", "USA", "Classical", "21st Century", "Tuba");
        velvet.show();
        Song queen = new Song("Queen of the Night Aria", "The Smooth Hits", "https://youtu.be/_wWKyOnJfyk");
        velvet.setSongMember(queen);
        velvet.displaySongs();
        System.out.println("\n");

        Vocalist rob = new Vocalist("Rob Thomas", "Germany/USA", "Punk Rock", "21st Century", "Fleetwood Mac");
        rob.show();
        Song smooth = new Song("Smooth", "The Smooth Hits", "https://youtu.be/6Whgn_iE5uc");
        rob.setSongMember(smooth);
        rob.displaySongs();
        System.out.println("\n");

        Guitarist carlos = new Guitarist("Carlos Santana", "Mexico/USA", "Latin Rock", "21st Century", 6);
        carlos.show();
        Song oye = new Song("Oye Como Va", "The Smooth Hits", "https://youtu.be/J7ATTjg7tpE");
        carlos.setSongMember(oye);
        carlos.setSongMember(smooth);
        carlos.displaySongs();
        System.out.println("\n");

        Vocalist burning = new Vocalist("Burning Flames", "Antigua W.I.", "Soca", "21st Century", "Short Shirt");
        burning.show();
        Song engine = new Song("Swinging Engine", "Sweet Soca", "https://www.youtube.com/watch?v=V-P0Pbit4wQ");
        burning.setSongMember(engine);
        burning.displaySongs();
        System.out.println("\n");

        Vocalist jhene = new Vocalist("Jhene Aiko", "USA", "RnB", "21st Century", "John Mayer");
        jhene.show();
        Song bs = new Song("BS", "The Smooth Hits", "https://www.youtube.com/watch?v=tXZ_B8Amy00");
        jhene.setSongMember(bs);
        jhene.displaySongs();
        System.out.println("\n");

        Vocalist sevyn = new Vocalist("Sevyn Streeter", "USA", "RnB/Pop", "21st Century", "Stevie Wonder");
        sevyn.show();
        Song kisses = new Song("Kissez", "The Smooth Hits", "https://www.youtube.com/watch?v=nNpASlGAgcI");
        sevyn.setSongMember(kisses);
        sevyn.displaySongs();
        System.out.println("\n");

        Vocalist her = new Vocalist("H.E.R.", "USA", "RnB", "21st Century", "Stevie Wonder");
        her.show();
        Song damage = new Song("Damage", "The Smooth Hits", "https://youtu.be/PAFAfhod9TU");
        her.setSongMember(damage);
        her.setSongMember(bs);
        her.displaySongs();
        System.out.println("\n");

        return new String[]{velvet.name,rob.name,carlos.name,burning.name,jhene.name,sevyn.name,her.name};
    }

    public void printArtists(){
        ArrayList<Song> song_library = Artist.song_library;
        String[] artists = createLibrary();//get artists from createLibrary() method and add to array

        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\ayana\\Desktop\\Android_Fellow\\artistlist.txt");

            for (int i = 0; i < song_library.size(); i++) {
                pw.println(Arrays.toString(artists));
            }
            pw.close();
        }  catch (Exception ex) {
            System.err.println("Couldn’t write the song info.");
        }

    }

    public void addArtistFromFile() throws FileNotFoundException {
        ScanFile scanned = new ScanFile();//getting information scanned from file
        String[] artist = scanned.scanArtist();//adding information to array to pull information from
        //array pulled in all information into index 1
        String name = artist[0].substring(1,8);//getting variables from array
        String origin = artist[0].substring(9, 17);
        String genre = artist[0].substring(18,25);
        String time_period = artist[0].substring(26,38);
        String influencedBy = artist[0].substring(39,45);

        Vocalist riri = new Vocalist(name, origin, genre, time_period, influencedBy);//create new artist
        riri.show();
        Song camefor = new Song("This Is What You Came For", "Rihanna Hits", "https://youtu.be/kOkQ4T5WO9E");//create new song
        riri.setSongMember(camefor);
        riri.displaySongs();
    }
}